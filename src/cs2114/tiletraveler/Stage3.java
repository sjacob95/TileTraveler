package cs2114.tiletraveler;

// -------------------------------------------------------------------------
/**
 * A demo stage designed to show how a map that is too large for the screen
 * functions when the screen's edge is reached
 * Map design looks weird to please Web Cat Spacing issues
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class Stage3
    extends Stage
{

    private static Map      map      =
                                         new Map(
                                             "                              " +
                                             "               WWWWWWWWWWWWWWW" +
                                             "WWWWWWWWWWWWWW              WWW",
                                             "                              " +
                                             "               WWWWWWWWWWWWWWW" +
                                             "WWWWWWWWWWWWWW              WWW",
                                             "                              " +
                                             "               WWWWWWWWWWWWWWW" +
                                             "WWWWWWWWWWWWWW              WWW",
                                             "                              " +
                                             "               WWWWWWWWWWWWWWW" +
                                             "WWWWWWWWWWWWWW              WWW",
                                             "                              " +
                                             "               WWWWWWWWWWWWWWW" +
                                             "WWWWWWWWWWWWWW              WWW",
                                             "                              " +
                                             "               WWWWWWWWWWWWWWW" +
                                             "WWWWWWWWWWWWWW              WWW",
                                             "                              " +
                                             "               WWWWWWWWWWWWWWW" +
                                             "WWWWWWWWWWWWWW              WWW",
                                             "                              " +
                                             "               WWWWWWWWWWWWWWW" +
                                             "WWWWWWWWWWWWWW              WWW",
                                             "                              " +
                                             "               WWWWWWWWWWWWWWW" +
                                             "WWWWWWWWWWWWWW              WWW",
                                             "                              " +
                                             "               WWWWWWWWWWWWWWD" +
                                             "WWWWWWWWWWWWWW              WDW",
                                             "IWWWWIWWWWIWWWWIWWWWIWWWIWWWWI" +
                                             "WWWWIWWWWIWWWWI       OOOOOOOO" +
                                             "OOOOOOO                     WOW",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                                             "OOOOOOOOOOOOOOW        OOOOOOO" +
                                             "OOOOOO                      WOW",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                                             "OOOOOOOOOOOOOOW         OOOOOO" +
                                             "OOOOO                       WOW",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                                             "OOOOOOOOOOOOOOW           WOOO" +
                                             "OOW                         WOW",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                                             "OOOOOOOOOOOOOOW           WOOO" +
                                             "OOW                         WOW",
                                             "IOOOO               OOOOO     " +
                                             "          OOOOI           WOOO" +
                                             "OOW                         WOW",
                                             "WOOOO               OOOOO     " +
                                             "          OOOOW           WOOO" +
                                             "OOW                         WOW",
                                             "WOOOO               OOOOO     " +
                                             "          OOOOW           WOOO" +
                                             "OOW                         WOW",
                                             "WOOOO                         " +
                                             "          OOOOWWWWWWWWWWWWIOOO" +
                                             "OOIWWWWWWWWWWWWWWWWWWWWWWWWWWOWW",
                                             "WOOOO                OOO      " +
                                             "         ~~~~~~~~~~~~~~~~~~~~~~" +
                                             "~~~~OOOOO~OOOOOOOO~OOO~~~~~~Q~~~",
                                             "IOOOO                          " +
                                             "        ~~~~~~~~~~~~~~~~~~~~Q~Q" +
                                             "~Q~Q~~~~~~~~~~~~~~~~~~~~~~~~~~~",
                                             "WOOOO                OOO       " +
                                             "        ~~~~~~~~~~~~~~~~~~~~~~~" +
                                             "~~~~~~~~~~~~~~~~~~~Q~~~~~~~Q~~~",
                                             "WOOOO                          " +
                                             "        ~~~~~~~~~~~~~~~~~~~~Q~~" +
                                             "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
                                             "WOOOO                OOO       " +
                                             "        ~~~~~~~~~~~~~~~~~~~~~~~" +
                                             "~~~~~~~~~~~~~~~~~~~OOOOOOOOOO~~",
                                             "WOOOO               OIOIO      " +
                                             "         OOOOWWWWWWWWWWWWIOOOOO" +
                                             "IWWWWWWWWWWWWWWWWWWWWWWWWWWWWW",
                                             "IOOOO               OOOOO      " +
                                             "         OOOOI           WOOOOO" +
                                             "W           WOOOWWWWWWWWWOOOW",
                                             "WOOOO               OIOIO      " +
                                             "         OOOOW           WOOOOO" +
                                             "W           WOOOWWWWWWWWWOOOW",
                                             "WOOOO                OOO       " +
                                             "         OOOOW           WOOOOO" +
                                             "W           WOOOOWWWDWWWOOOOW",
                                             "WOOOO                          " +
                                             "         OOOOW           WOOOOO" +
                                             "W           WOOOOOOOOOOOOOOOW",
                                             "WOOOO              IOOOOOI     " +
                                             "         OOOOW           WOOOOO" +
                                             "W           WOOOOOOOOOOOOOOOW",
                                             "IOOOOOOO      OOO  OOOOOOO  OOO" +
                                             "      OOOOOOOIWWWWWIWWWWWIOOOOO" +
                                             "IWWWWWIWWWWWIOOOOO     OOOOOW",
                                             "WOOOOOOO O O OIOIO OO~~~OO OIOI" +
                                             "O O O OOOOOOOOOOOOOOOOOOOOOOOOO" +
                                             "OOOOOOOOOOOOOOOOOO     OOOOOW",
                                             "WOOOOOOO O O OOOOO OO~~~OO OOOO" +
                                             "O O O OOOOOOOOOOOOOOOOOOOOOOOOO" +
                                             "OOOOOOOOOOOOOOOOOO     OOOOOW",
                                             "WOOOOOOO O O OIOIO OO~~~OO OIOI" +
                                             "O O O OOOOOOOOOOOOOOOOOOOOOOOOO" +
                                             "OOOOOOOOOOOOOOOOOO     OOOOOW",
                                             "IOOOOOOO      OOO  OOOOOOO  OOO" +
                                             "      OOOOOOOIWWWWWIWWWWWIOOOOO" +
                                             "IWWWWWIWWWWWIOOOOO     OOOOOW",
                                             "WOOOO              IOOOOOI     " +
                                             "         OOOOW           WOOOOO" +
                                             "W           WOOOOOOOOOOOOOOOW",
                                             "WOOOO                          " +
                                             "         OOOOW           WOOOOO" +
                                             "W           WOOOOOOOOOOOOOOOW",
                                             "WOOOO                OOO       " +
                                             "         OOOOW           WOOOOO" +
                                             "W           WOOOOOOOOOOOOOOOW",
                                             "WOOOO               OIOIO      " +
                                             "         OOOOW           WOOOOO" +
                                             "W           WOOOOOOOOOOOOOOOW",
                                             "IOOOO               OOOOO      " +
                                             "         OOOOI           WOOOOO" +
                                             "            WOOOOOOOOOOOOOOOW",
                                             "WOOOO               OIOIO      " +
                                             "         OOOOW           WOOOO " +
                                             "            WWWWWWWWWWWWWWWWW",
                                             "WOOOO                OOO       " +
                                             "         OOOOW           WO OO",
                                             "WOOOO                          " +
                                             "         OOOOW           W  OO  ",
                                             "WOOOO                OOO       " +
                                             "         OOOOW               O  ",
                                             "IOOOO                          " +
                                             "         OOOOI                  ",
                                             "WOOOO                OOO       " +
                                             "         OOOOW               O  ",
                                             "WOOOO                          " +
                                             "         OOOOW                  ",
                                             "WOOOO               OOOOO      " +
                                             "         OOOOW               O  ",
                                             "WOOOO               OOOOO      " +
                                             "         OOOOW                  ",
                                             "IOOOO               OOOOO      " +
                                             "         OOOOI               O  ",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                                             "OOOOOOOOOOOOOW                  ",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                                             "OOOOOOOOOOOOOW              OOO ",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                                             "OOOOOOOOOOOOOW             OIOIO",
                                             "WOOOOOOOOOOOOOOOOOOOOO" +
                                             "OOOOOOOOOOOOOOOOOOOOOOW " +
                                             "           OOOOOOO",
                                             "IWWWWIWWWWIWWWWIWWWWIWWWIWW" +
                                             "WWIWWWWIWWWWIWWWWI " +
                                             "            OIOIO ",
                                             "                           " +
                                             "                     " +
                                             "           OOO  ");

    private static Location startLoc = new Location(1, 23);


    // ----------------------------------------------------------
    /**
     * Create a new Stage3 object.
     *
     * @param tileSize
     *            The size of one Tile in pixels
     */
    public Stage3(float tileSize)
    {
        super(map, startLoc);
        getEnemyMap().addEnemy(
            new Floater(
                tileSize,
                this,
                new Location(8, 25),
                new Location(8, 21),
                new Location(10, 21),
                new Location(10, 25),
                new Location(8, 25)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(10, 25), new Location(
                10,
                21), new Location(12, 21), new Location(12, 25), new Location(
                     10, 25)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(24, 35), new Location(
                20,
                35), new Location(20, 37), new Location(24, 37), new Location(
                    24, 35)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(24, 33), new Location(
                20,
                33), new Location(20, 35), new Location(24, 35), new Location(
                    24, 33)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(34, 25), new Location(
                34,
                21), new Location(36, 21), new Location(36, 25), new Location(
                    34, 25)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(32, 25), new Location(
                32,
                21), new Location(34, 21), new Location(34, 25), new Location(
                    32, 25)));
        getEnemyMap().addEnemy(
            new Floater(
                tileSize,
                this,
                new Location(24, 9),
                new Location(20, 9),
                new Location(20, 11),
                new Location(24, 11),
                new Location(24, 9)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(24, 11), new Location(
                20,
                11), new Location(20, 13), new Location(24, 13), new Location(
                    24, 11)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(24, 35), new Location(
                20,
                35), new Location(20, 37), new Location(24, 37), new Location(
                    24, 35)));
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
        return new Stage3(tileSize);
    }
}
