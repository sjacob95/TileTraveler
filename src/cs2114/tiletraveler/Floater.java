package cs2114.tiletraveler;

/**
 * A floating enemy
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class Floater
    extends MovingEnemy
{

    // ----------------------------------------------------------
    /**
     * Create a new Floater object.
     *
     * @param tileSize
     *            The size of one Tile in pixels.
     * @param stage
     *            The Stage in which the Floater resides
     * @param locations
     *            The Locations of the Path's corners
     */
    public Floater(
        float tileSize,
        Stage stage,
        Location... locations)
    {
        super(tileSize, stage, PathSetting.DISALLOW, new Tile[] {
            Tile.DOOR, Tile.INVALID, Tile.PILLAR, Tile.WALL }, locations);
        getShape().setImage("enemyc");
    }


    @Override
    public void move()
    {
        getPath().get().next();
        setLocation(getPath().get().getCurrent());
        notifyObservers(1.0, getLocation().x(), getLocation().y());
    }

}
