package cs2114.tiletraveler;

import sofia.app.OptionsMenu;
import sofia.util.Timer;
import sofia.graphics.Anchor;
import sofia.app.ShapeScreen;
import android.widget.TextView;
import sofia.graphics.RectangleShape;
import sofia.graphics.Color;

// -------------------------------------------------------------------------
/**
 * Screen class to set up the tile traveler game screen CURRENT BUGS - Movement
 * is affected when the game gets laggy - Double jumping near the edge of a Map
 * can get a little gross (screen movement causes the Player to be recreated.
 * Should only redraw when the Player has landed - We admittedly don't need to
 * draw EVERY Tile...
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
@OptionsMenu
public class TileTravelerScreen
    extends ShapeScreen
{
    private float            tileSize;
    private Map              currentMap;
    private Stage            currentStage;
    private static final int SCREENDIM = 15;                // tile size of one
// side in a single view
    private int              mapDim;
    private Player           player;

    private TextView         status;

    /**
     * the map location currently at the bottom left of the screen
     */
    private Location         origin    = new Location(0, 0);


    public void initialize()
    {
        getCoordinateSystem().origin(Anchor.BOTTOM_LEFT).flipY();
        tileSize = Math.min(getWidth(), getHeight()) / SCREENDIM;

        currentStage = new DemoStage3();

        reset();
    }


    // ----------------------------------------------------------
    /**
     * Moves the Player west when the left button is clicked
     */
    public void leftClicked()
    {
        player.act(Direction.WEST);
    }


    // ----------------------------------------------------------
    /**
     * Moves the Player east when the right button is clicked
     */
    public void rightClicked()
    {
        player.act(Direction.EAST);
    }


    // ----------------------------------------------------------
    /**
     * Moves the Player north when the up button is clicked
     */
    public void upClicked()
    {
        player.act(Direction.NORTH);
    }


    // ----------------------------------------------------------
    /**
     * Moves the Player south when the down button is clicked
     */
    public void downClicked()
    {
        player.act(Direction.SOUTH);
    }


    // ----------------------------------------------------------
    /**
     * Resets the Stage when reset is clicked
     */
    public void resetClicked()
    {
        reset();
    }


    /**
     * Recenters the screen when Center Screen is clicked
     */
    public void centerScreenClicked()
    {
        if (!player.isMoving() && player.isAlive())
        {
            Location loc = player.getLocation();
            origin =
                new Location(loc.x() - (SCREENDIM / 2), loc.y()
                    - (SCREENDIM / 2));
            redraw();
        }
    }


    // ----------------------------------------------------------
    /**
     * Completely resets the Stage
     */
    public void reset()
    {
        currentMap = currentStage.getMap();
        mapDim = currentMap.getMapDim();
        player =
            new Player(
                currentStage.getStartLoc(),
                tileSize,
                currentStage,
                origin);
        status.setText("Using the arrow buttons, escape the dungeon!");

        draw();
        centerScreenClicked();
    }


    // ----------------------------------------------------------
    /**
     * Draws the screen and adds the Player to the screen and begins observing
     * it
     */
    public void draw()
    {
        drawScreen();
        add(player.getShape());
        player.addObserver(this);
        checkOrigin();
    }


    // ----------------------------------------------------------
    /**
     * Redraws the Player and the Stage
     */
    public void redraw()
    {
        remove(player.getShape());
        Location playerLoc = player.getLocation();
        player = new Player(playerLoc, tileSize, currentStage, origin);
        draw();
    }


    /**
     * Redraws the Player
     */
    public void redrawPlayer()
    {
        if (player.isAlive())
        {
            remove(player.getShape());
            Location playerLoc = player.getLocation();
            player = new Player(playerLoc, tileSize, currentStage, origin);
            add(player.getShape());
            player.addObserver(this);
            checkOrigin();
        }
    }


    /**
     * Draws the Map according to the value of origin
     */
    public void drawScreen()
    {
        clear();
        RectangleShape background =
            new RectangleShape(0, 0, getWidth(), getHeight());
        background.setFillColor(Color.black);
        add(background);
        for (int y = 0; y < mapDim; y++)
        {
            for (int x = 0; x < mapDim; x++)
            {
                drawTile(x, y);
            }
        }
    }


    /**
     * Draws a Tile
     *
     * @param x
     *            the x coordinate of the Tile to be drawn
     * @param y
     *            the y coordinate of the Tile to be drawn
     */
    public void drawTile(int x, int y)
    {
        Tile tile = currentMap.getTile(x, y);
        if (tile == null)
            return;
        switch (tile)
        {
            case DOOR:
                add(new Door((x - origin.x()), (y - origin.y()), tileSize));
                break;

            case FLOOR:
                add(new Floor((x - origin.x()), (y - origin.y()), tileSize));
                break;

            case LILY:
                add(new Water((x - origin.x()), (y - origin.y()), tileSize));
                add(new Lily((x - origin.x()), (y - origin.y()), tileSize));
                break;

            case PILLAR:
                add(new Pillar((x - origin.x()), (y - origin.y()), tileSize));
                break;

            case WALL:
                add(new Wall((x - origin.x()), (y - origin.y()), tileSize));
                break;

            case WATER:
                add(new Water((x - origin.x()), (y - origin.y()), tileSize));
                break;

            default:
                break;

        }
    }


    // ----------------------------------------------------------
    /**
     * @return the Tile size in pixels
     */
    public float getTileSize()
    {
        return tileSize;
    }


    // ----------------------------------------------------------
    /**
     * Checks whether or not the player has moved outside the bounds set by
     * SCREENDIM. If this is the case, the screen shifts by SCREENDIM Tiles in
     * the direction of the Player
     */
    public void checkOrigin()
    {
        if (player.isAlive())
        {
            boolean changed = false;
            if (player.getLocation().y() - origin.y() < 0)
            {
                origin = origin.south(SCREENDIM);
                changed = true;
            }
            else if (player.getLocation().x() - origin.x() < 0)
            {
                origin = origin.west(SCREENDIM);
                changed = true;
            }
            else if (player.getLocation().y() - origin.y() >= SCREENDIM)
            {
                origin = origin.north(SCREENDIM);
                changed = true;
            }
            else if (player.getLocation().x() - origin.x() >= SCREENDIM)
            {
                origin = origin.east(SCREENDIM);
                changed = true;
            }
            if (changed && !player.isJumping())
            {
                redraw();
            }
        }
    }


    // ----------------------------------------------------------
    /**
     * Checks whether or not the player is alive and responds appropriately
     *
     * @param entity
     *            The player
     * @param alive
     *            Whether or not he or she is alive
     */
    public void changeWasObserved(Player entity, boolean alive)
    {
        if (!alive)
        {
            status.setText("You are died!");
        }
    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     *
     * @param entity
     *            The player
     * @param fractionMoveTime
     *            The fraction of the player's MoveTime that this move will take
     *            to execute
     * @param x
     *            The x coordinate to be moved to
     * @param y
     *            The y coordinate to be moved to
     */
    public void changeWasObserved(
        Player entity,
        double fractionMoveTime,
        int x,
        int y)
    {
        player.getShape()
            .animate(player.getMoveTime() * Math.round(fractionMoveTime))
            .moveBy(x * getTileSize(), y * getTileSize()).play();
    }


    // ----------------------------------------------------------
    /**
     * Calls the screen method associated with the Player method specified by
     * methodName after a delay, calls the redrawPlayer() method to fix any
     * offset to lag, and then calls the checkOrigin() method to make sure the
     * Player stays within the screen's bounds
     *
     * @param entity
     *            The Player
     * @param methodName
     *            The name of the Player method to be called
     * @param fractionMoveTime
     *            The fraction of the Player's MoveTime that te method's delay
     *            will take
     */
    public void changeWasObserved(
        Player entity,
        String methodName,
        double fractionMoveTime)
    {
        StringBuilder thisMethodName = new StringBuilder();
        thisMethodName.append("call");
        thisMethodName.append(methodName.substring(0, 1).toUpperCase());
        thisMethodName.append(methodName.substring(1, methodName.length()));
        Timer.callOnce(
            this,
            thisMethodName.toString(),
            (entity.getMoveTime() * (long)Math.floor(fractionMoveTime)));
        Timer.callOnce(
            this,
            "redrawPlayer",
            (entity.getMoveTime() * (long)Math.floor(fractionMoveTime)) + 2);
        Timer.callOnce(
            this,
            "checkOrigin",
            (entity.getMoveTime() * (long)Math.floor(fractionMoveTime)) + 4);
    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     */
    // -------------------------------------------------------------------------
    // PLAYER CALL METHODS
    // -------------------------------------------------------------------------

    // ----------------------------------------------------------
    /**
     * Call's the player's resumeInput() method
     */
    public void callResumeInput()
    {
        player.resumeInput();
    }


    // ----------------------------------------------------------
    /**
     * Call's the player's movingStopped() method
     */
    public void callMovingStopped()
    {
        player.movingStopped();
    }


    // ----------------------------------------------------------
    /**
     * Call's the player's checkAndMove() method
     */
    public void callCheckAndMove()
    {
        player.checkAndMove();
    }


    // ----------------------------------------------------------
    /**
     * Call's the player's incJumpCount() method
     */
    public void callIncJumpCount()
    {
        player.incJumpCount();
    }


    // ----------------------------------------------------------
    /**
     * Call's the player's nextMove() method
     */
    public void callNextMove()
    {
        player.nextMove();
    }
}
