package cs2114.tiletraveler;

/**
 * A stage for the application
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class Stage7
    extends Stage
{

    private static Map      map      = new Map(
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

    /**
     * Create a new Stage7 object.
     * @param tileSize
     *            The size of one Tile in pixels.
     */
    public Stage7(float tileSize)
    {
        super(map, startLoc);
        getEnemyMap().addEnemy(
            new Bug(tileSize, this, new Location(3, 6), new Location(12, 6)));
    }

    /**
     * Resets the stage to its original layout.
     *
     * @param tileSize
     *          The size of one tile in pixels
     * @return original stage
     */
    public Stage reset(float tileSize)
    {
        return new Stage7(tileSize);
    }
}
