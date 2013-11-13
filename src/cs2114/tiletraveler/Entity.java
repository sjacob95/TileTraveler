package cs2114.tiletraveler;

import sofia.graphics.RectangleShape;

/**
 * This class is the parent class for all of the Entities on the game board.
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public abstract class Entity
    extends sofia.util.Observable
{
    private RectangleShape entityShape;
    private Direction      direction;
    private Location       location;
    private float          tileSize;
    private Stage          stage;


    /**
     * Constructor for Entities that takes in an x and a y coordinate
     *
     * @param x
     *            The x coordinate for the Entity's Location.
     * @param y
     *            The y coordinate for the Entity's Location.
     * @param tileSize
     *            The size of one Tile in pixels.
     * @param stage
     *            The stage the entity resides in
     * @param origin
     *            The Location of the Tile currently at the bottom-left of the
     *            screen
     */
    public Entity(float x, float y, float tileSize, Stage stage, Location origin)
    {
        entityShape =
            new RectangleShape(
                (x - origin.x()) * tileSize,
                (y - origin.y()) * tileSize,
                ((x + 1) - origin.x()) * tileSize,
                ((y + 1) - origin.y()) * tileSize);
        direction = Direction.NORTH;
        location = new Location((int)x, (int)y);
        this.tileSize = tileSize;
        this.stage = stage;
    }


    /**
     * Constructor for Entities that takes in a Location object
     *
     * @param loc
     *            The Location of the Tile
     * @param tileSize
     *            The size of one Tile in pixels.
     * @param stage
     *            The stage the Entity resides in
     * @param origin
     *            The Location of the Tile currently at the bottom-left of the
     *            screen
     */
    public Entity(Location loc, float tileSize, Stage stage, Location origin)
    {
        entityShape =
            new RectangleShape(
                (loc.x() - origin.x()) * tileSize,
                (loc.y() - origin.y()) * tileSize,
                ((loc.x() + 1) - origin.x()) * tileSize,
                ((loc.y() + 1) - origin.y()) * tileSize);
        direction = Direction.NORTH;
        location = loc;
        this.stage = stage;
    }


    /**
     * Allows access to the RectangleShape object of the Entity class.
     *
     * @return The RectangleShape object.
     */
    public RectangleShape getShape()
    {

        return entityShape;
    }


    /**
     * Gets the direction that entity is currently heading and returns it.
     *
     * @return A direction object.
     */
    public Direction getDirection()
    {

        return direction;
    }


    /**
     * Sets the direction that entity is currently facing
     *
     * @param direc
     *            The direction that the Entity should be heading.
     */
    public void setDirection(Direction direc)
    {

        direction = direc;
    }


    // ----------------------------------------------------------
    /**
     * @return the Entity's Location
     */
    public Location getLocation()
    {
        return location;
    }


    // ----------------------------------------------------------
    /**
     * Sets the Entity's Location
     *
     * @param loc
     *            - the new Location
     */
    public void setLocation(Location loc)
    {
        location = loc;
    }


    // ------------------------------------------------------------
    /**
     * @return the cellSize
     */
    public float getTileSize()
    {
        return tileSize;
    }


    // ----------------------------------------------------------
    /**
     * @return the Entity's Stage
     */
    public Stage getStage()
    {
        return stage;
    }

}
