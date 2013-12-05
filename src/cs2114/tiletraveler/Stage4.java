package cs2114.tiletraveler;

// -------------------------------------------------------------------------
/**
 *  A stage for the application
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public class Stage4
    extends Stage
{

    private static Map map = new Map(
                               "WWWWWWWWDWWWWWWW",
                               "W  O OO OOOOO  W",
                               "W              W",
                               "W  O O O    O  W",
                               "W              W",
                               "W  OOO OOOOOO  W",
                               "W       O      W",
                               "W       O      W",
                               "W  OOOOOOOOOO  W",
                               "W    O    O O  W",
                               "W  O        O  W",
                               "W  O        O  W",
                               "W  OOOOOOOOOO  W",
                               "W      O       W",
                               "WWWWWWOOWWWWWWWW");

    private static Location startLoc = new Location(6, 0);

    // ----------------------------------------------------------
    /**
     * Create a new Stage1 object.
     * @param tileSize
     *            The size of one Tile in pixels.
     */
    public Stage4(float tileSize)
    {
        super(map, startLoc);
        getEnemyMap().addEnemy(new Bug(tileSize, this, new Location(3, 7), new Location(12, 7)));
    }

    public Stage reset(float tileSize)
    {
        return new Stage4(tileSize);
    }
}