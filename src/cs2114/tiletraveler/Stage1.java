package cs2114.tiletraveler;

// -------------------------------------------------------------------------
/**
 *  A demo stage designed to show off the basics of Map and tile creation
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public class Stage1
    extends Stage
{

    private static Map map = new Map(
                               "WWWWWDWWWWW",
                               "WIOO O OO~W",
                               "WOOO O OOOW",
                               "WOOO O OOOW",
                               "W    O    W",
                               "WOOOOOOOOOW",
                               "W    O    W",
                               "WOOO O OOOW",
                               "WOOO O OOOW",
                               "W~OO O OOIW",
                               "WWWWWOWWWWW");

    private static Location startLoc = new Location(5, 0);

    // ----------------------------------------------------------
    /**
     * Create a new Stage1 object.
     * @param tileSize
     *            The size of one Tile in pixels.
     */
    public Stage1(float tileSize)
    {
        super(map, startLoc);
        getEnemyMap().addEnemy(new Bug(tileSize, this, new Location(1, 5), new Location(9, 5)));
        getEnemyMap().addEnemy(new Bug(tileSize, this, new Location(7, 7), new Location(9, 7)));
    }

    public Stage reset(float tileSize)
    {
        return new Stage1(tileSize);
    }
}
