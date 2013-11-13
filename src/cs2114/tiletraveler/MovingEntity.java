package cs2114.tiletraveler;

/**
 * // -------------------------------------------------------------------------
 * /** A mobile Entity
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public class MovingEntity
    extends Entity
{

    // ----------------------------------------------------------
    /**
     * Constructor for MovingEntities that takes in an x and a y coordinate
     *
     * @param loc
     *            The Location of the MovingEntity
     * @param tileSize
     *            The size of one Tile in pixels.
     * @param stage
     *            The stage the MovingEntity resides in
     * @param origin
     *            The Location of the Tile currently at the bottom-left of the
     *            screen
     */
    public MovingEntity(
        Location loc,
        float tileSize,
        Stage stage,
        Location origin)
    {
        super(loc, tileSize, stage, origin);
    }


    // ----------------------------------------------------------
    /**
     * Constructor for MovingEntities that takes in an x and a y coordinate
     *
     * @param x
     *            The x coordinate for the MovingEntity's Location.
     * @param y
     *            The y coordinate for the MovingEntity's Location.
     * @param tileSize
     *            The size of one Tile in pixels.
     * @param stage
     *            The stage the MovingEntity resides in
     * @param origin
     *            The Location of the Tile currently at the bottom-left of the
     *            screen
     */
    public MovingEntity(
        float x,
        float y,
        float tileSize,
        Stage stage,
        Location origin)
    {
        super(x, y, tileSize, stage, origin);
    }
}
