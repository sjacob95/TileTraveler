package cs2114.tiletraveler;

/**
 * A demo stage designed to show the abilities of moving enemies.
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class Stage4
    extends Stage
{


    private static Map      map      = new Map(
                                         "IWWWIWDDWIWWWI",
                                         "WOOOOOOOOOOOOW",
                                         "OOOOOOOOOOOOOO",
                                         "OOOOOOOOOOOOOO",
                                         "OII~~~~~~~~~~O",
                                         "OID~~Q~Q~Q~Q~O",
                                         "OII~~~~~~~~~~O",
                                         "O~~Q~Q~~IOI~~O",
                                         "O~~~~~~~III~~O",
                                         "O~~Q~~~~~~~~~O",
                                         "OOOOOOOOOOOOOO",
                                         "OOOOOOOOOOOOOO",
                                         "WOOOOOOOOOOOOW",
                                         "IWWWIWWWWIWWWI");
    private static Location startLoc = new Location(7, 1);


    /**
     * Create a new Stage4 object.
     *
     * @param tileSize
     *            The size of each individual tile.
     */
    public Stage4(float tileSize)
    {
        super(map, startLoc);
        getEnemyMap().addEnemy(
            new Bug(
                tileSize,
                this,
                new Location(0, 3),
                new Location(13, 3),
                new Location(13, 10),
                new Location(0, 10),
                new Location(0, 3)));
        getEnemyMap().addEnemy(
            new Bug(
                tileSize,
                this,
                new Location(13, 3),
                new Location(13, 10),
                new Location(0, 10),
                new Location(0, 3),
                new Location(13, 3)));
        getEnemyMap().addEnemy(
            new Bug(
                tileSize,
                this,
                new Location(13, 10),
                new Location(0, 10),
                new Location(0, 3),
                new Location(13, 3),
                new Location(13, 10)));
        getEnemyMap().addEnemy(
            new Bug(
                tileSize,
                this,
                new Location(0, 10),
                new Location(0, 3),
                new Location(13, 3),
                new Location(13, 10),
                new Location(0, 10)));
        getEnemyMap().addEnemy(
            new Floater(
                tileSize,
                this,
                new Location(3, 7),
                new Location(9, 7),
                new Location(9, 6),
                new Location(9, 7),
                new Location(12, 7),
                new Location(3, 7)));
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
        return new Stage4(tileSize);
    }
}
