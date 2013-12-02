package cs2114.tiletraveler;

import sofia.graphics.Shape.Animator;

/**
 * The parent class for all moving enemies
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public abstract class MovingEnemy
    extends Enemy
{
    private static final long MOVETIME = 800;
    private Path              path;
    private Animator<?> lastAnimation = null;


    /**
     * Constructor for the Enemy that takes in an x and a y coordinate, as well
     * as a Tile size.
     *
     * @param tileSize
     *            The size of one Tile in pixels.
     * @param stage
     *            The stage the Enemy resides in
     * @param pathSetting
     *            - Whether to allow or disallow Tiles in the array conditions
     * @param pathConditions
     *            - tiles to be allowed or disallowed
     * @param locations
     *            - the Locations of the Path's corners
     */
    public MovingEnemy(
        float tileSize,
        Stage stage,
        PathSetting pathSetting,
        Tile[] pathConditions,
        Location[] locations)
    {
        super(locations[0], tileSize, stage);
        this.path = new Path(pathSetting, pathConditions, stage.getMap(), locations);
    }


    public void act()
    {
        move();
    }

    // ----------------------------------------------------------
    /**
     * @return the path
     */
    public Path getPath()
    {
        return path;
    }

    // ----------------------------------------------------------
    /**
     * @return the MovingEnemy's MOVETIME in milliseconds
     */
    public static long getMoveTime()
    {
        return MOVETIME;
    }

    // ----------------------------------------------------------
    /**
     * @return the most recent animation
     */
    public Animator<?> getLastAnimation()
    {
        return lastAnimation;
    }

    // ----------------------------------------------------------
    /**
     * sets the most recent animation
     * @param animation The most recent animation
     */
    public void setLastAnimation(Animator<?> animation)
    {
        lastAnimation = animation;
    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     */
    public abstract void move();
}
