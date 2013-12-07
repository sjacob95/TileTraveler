package cs2114.tiletraveler;

// -------------------------------------------------------------------------
/**
 * A demo stage designed to show how a map that is too large for the screen
 * functions when the screen's edge is reached
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class Stage2
    extends Stage
{

    private static Map      map      =
                                         new Map(
                                             "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOD",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW",
                                             "WOOOWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW",
                                             "WOOOW",
                                             "WOOOW",
                                             "WOOOW",
                                             "WOOOW",
                                             "WOOOW",
                                             "IOOOI",
                                             "WOOOW",
                                             "WOOOW",
                                             "WOOOW",
                                             "WOOOW",
                                             "WOOOW",
                                             "IOOOI",
                                             "WOOOW",
                                             "WOOOW",
                                             "WOOOW",
                                             "WOOOW",
                                             "WOOOW");

    private static Location startLoc = new Location(2, 0);


    // ----------------------------------------------------------
    /**
     * Create a new Stage2 object.
     *
     * @param tileSize
     *            The size of one Tile in pixels.
     */
    public Stage2(float tileSize)
    {
        super(map, startLoc);
        getEnemyMap().addEnemy(
            new Bug(tileSize, this, new Location(1, 5), new Location(3, 5)));
        getEnemyMap().addEnemy(
            new Bug(tileSize, this, new Location(1, 11), new Location(3, 11)));
        getEnemyMap().addEnemy(
            new Bug(tileSize, this, new Location(1, 5), new Location(3, 5)));
        getEnemyMap().addEnemy(
            new Bug(tileSize, this, new Location(4, 20), new Location(4, 18)));
        getEnemyMap().addEnemy(
            new Bug(
                tileSize,
                this,
                new Location(6, 19),
                new Location(6, 18),
                new Location(6, 20),
                new Location(6, 19)));
        getEnemyMap().addEnemy(
            new Bug(tileSize, this, new Location(8, 18), new Location(8, 20)));
        getEnemyMap().addEnemy(
            new Bug(
                tileSize,
                this,
                new Location(10, 19),
                new Location(10, 20),
                new Location(10, 18),
                new Location(10, 19)));
        getEnemyMap()
            .addEnemy(
                new Bug(tileSize, this, new Location(12, 20), new Location(
                    12,
                    18)));
        getEnemyMap().addEnemy(
            new Bug(
                tileSize,
                this,
                new Location(14, 19),
                new Location(14, 18),
                new Location(14, 20),
                new Location(14, 19)));
        getEnemyMap()
            .addEnemy(
                new Bug(tileSize, this, new Location(16, 18), new Location(
                    16,
                    20)));

    }


    /**
     * Resets the stage to its original layout.
     */
    public Stage reset(float tileSize)
    {
        return new Stage2(tileSize);
    }
}
