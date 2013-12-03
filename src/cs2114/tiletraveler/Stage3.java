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
public class Stage3
    extends Stage
{

    private static Map      map      =
                                         new Map(
                                             "                                             WWWWWWWWWWWWWWWWWWWWWWWWWWWWW              WWW",
                                             "                                             WWWWWWWWWWWWWWWWWWWWWWWWWWWWW              WWW",
                                             "                                             WWWWWWWWWWWWWWWWWWWWWWWWWWWWW              WWW",
                                             "                                             WWWWWWWWWWWWWWWWWWWWWWWWWWWWW              WWW",
                                             "                                             WWWWWWWWWWWWWWWWWWWWWWWWWWWWW              WWW",
                                             "                                             WWWWWWWWWWWWWWWWWWWWWWWWWWWWW              WWW",
                                             "                                             WWWWWWWWWWWWWWWWWWWWWWWWWWWWW              WWW",
                                             "                                             WWWWWWWWWWWWWWWWWWWWWWWWWWWWW              WWW",
                                             "                                             WWWWWWWWWWWWWWWWWWWWWWWWWWWWW              WWW",
                                             "                                             WWWWWWWWWWWWWWDWWWWWWWWWWWWWW              WDW",
                                             "IWWWWIWWWWIWWWWIWWWWIWWWIWWWWIWWWWIWWWWIWWWWI       OOOOOOOOOOOOOOO                     WOW",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW        OOOOOOOOOOOOO                      WOW",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW         OOOOOOOOOOO                       WOW",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW           WOOOOOW                         WOW",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW           WOOOOOW                         WOW",
                                             "IOOOO               OOOOO               OOOOI           WOOOOOW                         WOW",
                                             "WOOOO               OOOOO               OOOOW           WOOOOOW                         WOW",
                                             "WOOOO               OOOOO               OOOOW           WOOOOOW                         WOW",
                                             "WOOOO                                   OOOOWWWWWWWWWWWWIOOOOOIWWWWWWWWWWWWWWWWWWWWWWWWWWOWW",
                                             "WOOOO                OOO               ~~~~~~~~~~~~~~~~~~~~~~~~~~OOOOO~OOOOOOOO~OOO~~~~~~Q~~~",
                                             "IOOOO                                  ~~~~~~~~~~~~~~~~~~~~Q~Q~Q~Q~~~~~~~~~~~~~~~~~~~~~~~~~~~",
                                             "WOOOO                OOO               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Q~~~~~~~Q~~~",
                                             "WOOOO                                  ~~~~~~~~~~~~~~~~~~~~Q~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
                                             "WOOOO                OOO               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~OOOOOOOOOO~~",
                                             "WOOOO               OIOIO               OOOOWWWWWWWWWWWWIOOOOOIWWWWWWWWWWWWWWWWWWWWWWWWWWWWW",
                                             "IOOOO               OOOOO               OOOOI           WOOOOOW           WOOOWWWWWWWWWOOOW",
                                             "WOOOO               OIOIO               OOOOW           WOOOOOW           WOOOWWWWWWWWWOOOW",
                                             "WOOOO                OOO                OOOOW           WOOOOOW           WOOOOWWWDWWWOOOOW",
                                             "WOOOO                                   OOOOW           WOOOOOW           WOOOOOOOOOOOOOOOW",
                                             "WOOOO              IOOOOOI              OOOOW           WOOOOOW           WOOOOOOOOOOOOOOOW",
                                             "IOOOOOOO      OOO  OOOOOOO  OOO      OOOOOOOIWWWWWIWWWWWIOOOOOIWWWWWIWWWWWIOOOOO     OOOOOW",
                                             "WOOOOOOO O O OIOIO OO~~~OO OIOIO O O OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO     OOOOOW",
                                             "WOOOOOOO O O OOOOO OO~~~OO OOOOO O O OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO     OOOOOW",
                                             "WOOOOOOO O O OIOIO OO~~~OO OIOIO O O OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO     OOOOOW",
                                             "IOOOOOOO      OOO  OOOOOOO  OOO      OOOOOOOIWWWWWIWWWWWIOOOOOIWWWWWIWWWWWIOOOOO     OOOOOW",
                                             "WOOOO              IOOOOOI              OOOOW           WOOOOOW           WOOOOOOOOOOOOOOOW",
                                             "WOOOO                                   OOOOW           WOOOOOW           WOOOOOOOOOOOOOOOW",
                                             "WOOOO                OOO                OOOOW           WOOOOOW           WOOOOOOOOOOOOOOOW",
                                             "WOOOO               OIOIO               OOOOW           WOOOOOW           WOOOOOOOOOOOOOOOW",
                                             "IOOOO               OOOOO               OOOOI           WOOOOO            WOOOOOOOOOOOOOOOW",
                                             "WOOOO               OIOIO               OOOOW           WOOOO             WWWWWWWWWWWWWWWWW",
                                             "WOOOO                OOO                OOOOW           WO OO",
                                             "WOOOO                                   OOOOW           W  OO  ",
                                             "WOOOO                OOO                OOOOW               O  ",
                                             "IOOOO                                   OOOOI                  ",
                                             "WOOOO                OOO                OOOOW               O  ",
                                             "WOOOO                                   OOOOW                  ",
                                             "WOOOO               OOOOO               OOOOW               O  ",
                                             "WOOOO               OOOOO               OOOOW                  ",
                                             "IOOOO               OOOOO               OOOOI               O  ",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW                  ",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW              OOO ",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW             OIOIO",
                                             "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW            OOOOOOO",
                                             "IWWWWIWWWWIWWWWIWWWWIWWWIWWWWIWWWWIWWWWIWWWWI             OIOIO ",
                                             "                                                           OOO  ");

    private static Location startLoc = new Location(1, 23);


    // ----------------------------------------------------------
    /**
     * Create a new Stage3 object.
     *
     * @param tileSize The size of one Tile in pixels
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
            new Floater(
                tileSize,
                this,
                new Location(10, 25),
                new Location(10, 21),
                new Location(12, 21),
                new Location(12, 25),
                new Location(10, 25)));
        getEnemyMap().addEnemy(
            new Floater(
                tileSize,
                this,
                new Location(24, 35),
                new Location(20, 35),
                new Location(20, 37),
                new Location(24, 37),
                new Location(24, 35)));
        getEnemyMap().addEnemy(
            new Floater(
                tileSize,
                this,
                new Location(24, 33),
                new Location(20, 33),
                new Location(20, 35),
                new Location(24, 35),
                new Location(24, 33)));
        getEnemyMap().addEnemy(
            new Floater(
                tileSize,
                this,
                new Location(34, 25),
                new Location(34, 21),
                new Location(36, 21),
                new Location(36, 25),
                new Location(34, 25)));
        getEnemyMap().addEnemy(
            new Floater(
                tileSize,
                this,
                new Location(32, 25),
                new Location(32, 21),
                new Location(34, 21),
                new Location(34, 25),
                new Location(32, 25)));
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
            new Floater(
                tileSize,
                this,
                new Location(24, 11),
                new Location(20, 11),
                new Location(20, 13),
                new Location(24, 13),
                new Location(24, 11)));
        getEnemyMap().addEnemy(
            new Floater(
                tileSize,
                this,
                new Location(24, 35),
                new Location(20, 35),
                new Location(20, 37),
                new Location(24, 37),
                new Location(24, 35)));
    }


    public Stage reset(float tileSize)
    {
        return new Stage3(tileSize);
    }
}
