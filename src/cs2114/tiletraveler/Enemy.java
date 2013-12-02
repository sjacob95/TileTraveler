package cs2114.tiletraveler;

/**
 * The parent class for all enemies
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public abstract class Enemy
    extends Entity
{


    /**
     * Constructor for the Enemy that takes in an x and a y coordinate, as well
     * as a Tile size.
     *
     * @param loc
     *            The Location of the Enemy
     * @param tileSize
     *            The size of one Tile in pixels.
     * @param stage
     *            The stage the Enemy resides in
     */
    public Enemy(Location loc, float tileSize, Stage stage)
    {
        super(loc, tileSize, stage);
    }

    /**
     * Causes the Enemy to act in a way specific to the type of Enemy
     */
    public abstract void act();
}
