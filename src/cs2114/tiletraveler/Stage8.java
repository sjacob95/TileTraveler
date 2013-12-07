package cs2114.tiletraveler;

// -------------------------------------------------------------------------
/**
 * A demo stage designed to show off the basics of Map and tile creation
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class Stage8
    extends Stage
{

    private static Map      map      = new Map(
                                         "WWWWWWWWWWWWWWWWWWWWWWWWWWWWW"
                                             + "WWWWWWWWW",
                                         "WWWWWWWWWWWWIDIDIDIDIDIDIDWWW"
                                             + "WWWWOOOOW",
                                         "WWWWWWWWWWWWIOIOIOIOIOIOIOWWW"
                                             + "WWWWOWWOW",
                                         "WWWQQQQ~~~QQQQ~~~QQQQ~~~QQQQ~"
                                             + "~~QQQQWOW",
                                         "WWW~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                             + "~~~~~~WOW",
                                         "WWW~~~QQQQQQQ~~~QQQQQQQ~~~QQQ"
                                             + "QQQQ~~WOW",
                                         "WWW~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                             + "~~~~~~WOW",
                                         "WWW~QQQ~~QQQ~~QQQ~~QQQ~~QQQ~~"
                                             + "QQQ~~QWOW",
                                         "WWWWWWWWWWWWOOOOOOOOOOOOOOWWW"
                                             + "WWWWWWWOW",
                                         "WWWI   I    OOOOOOOOOOOOOO   "
                                             + " I   IWOW",
                                         "WWWO   O    OOOOOOOOOOOOOO   "
                                             + " O   OOOW",
                                         "WWWI   I    OOOOOOOOOOOOOO   "
                                             + " I   IWOW",
                                         "WWWO   O    OOOOOOOOOOOOOO   "
                                             + " O   OOOW",
                                         "WWWI   I    OOOOOOOOOOOOOO   "
                                             + " I   IWOW",
                                         "WWWWWWWWWWWWOOOOOOOOOOOOOOWWW"
                                             + "WWWWWWWOW",
                                         "WWWWWWWWWWWW              WWW"
                                             + "WWWWWWWOW",
                                         "WWWWWWWWWWWW              WWW"
                                             + "WWWWWWWOW",
                                         "WWWWWWWWWWWW              WWW"
                                             + "WWWWWWWOW",
                                         "WWWWWWWWWWWWOOOOOOOOOOOOOOOOO"
                                             + "OOOOOOOOW",
                                         "WWWWWWWWWWWWOWWWWWWWWWWWW WWW"
                                             + "WWWWWWWWW",
                                         "WWWWWWWWWWWWOOOOOOOOOOOOW WWW"
                                             + "WWWWWWWWW",
                                         "WWWWWWWWWWWW W WWWWWWWWOOOWWW"
                                             + "WWWWWWWWW",
                                         "WWWWWWWWWWWW WOOOOOOOOOOWOWWW"
                                             + "WWWWWWWWW",
                                         "WWWWWWWWWWWWOWWWWWWWWWWWWOWWW"
                                             + "WWWWWWWWW",
                                         "WWWWWWWWWWWWOOOOOOOOOOOOOOWWW"
                                             + "WWWWWWWWW",
                                         "WOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
                                             + "OOOOOOOOW",
                                         "WOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
                                             + "OOOOOOOOW",
                                         "WOOOOOOOOWWOOOWWWWWWWWWWOOOWW"
                                             + "OOOOOOOOW",
                                         "WOOOOOOOOWWOOOWWWWWWWWWWOOOWW"
                                             + "OOOOOOOOW",
                                         "WOOOOOOOOWWOOOWWOOOOOOOOOOOWW"
                                             + "OOOOOOOOW",
                                         "WOOOOOOOOWWOOOWWOOOOOOOOOOOWW"
                                             + "OOOOOOOOW",
                                         "WOOOOOOOOWWOOOWWOOOOOOOOOOOWW"
                                             + "OOOOOOOOW",
                                         "WOOOOOOOOWWOOOWWWWWWWWWWOOOWW"
                                             + "OOOOOOOOW",
                                         "WOWWOOOOOWWOOOWWWWWWWWWWOOOWW"
                                             + "OOOOOOOOW",
                                         "WOWWOOOOOWWOOOWWOOOOOOOOOOOWW"
                                             + "OOOOOOOOW",
                                         "WOWWWOOOWWWOOOWWOOOOOOOOOOOWW"
                                             + "OOOOOOOOW",
                                         "WOOWWWWWWWOOOOWWWWWWWWWWOOOWW"
                                             + "WWWWWWWOW",
                                         "WOOOWIDIWOOOOOWWIDIIDIWWOOOWW"
                                             + "WIDIWWWOW",
                                         "WOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
                                             + "OOOOOOOOW",
                                         "WOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
                                             + "OOOOOOOOW",
                                         "WWWWWWWWWWWWWWWWWWWWWWWWWWWWW"
                                             + "WWWWWWWWW");

    private static Location startLoc = new Location(19, 26);


    // ----------------------------------------------------------
    /**
     * Create a new Stage1 object.
     *
     * @param tileSize
     *            The size of one Tile in pixels.
     */
    public Stage8(float tileSize)
    {
        super(map, startLoc);

        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(3, 34), new Location(
                18,
                34)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(19, 34), new Location(
                34,
                34)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(8, 36), new Location(
                18,
                36), new Location(3, 36), new Location(8, 36)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(24, 36), new Location(
                34,
                36), new Location(19, 36), new Location(24, 36)));

        getEnemyMap().addEnemy(
            new Bug(
                tileSize,
                this,
                new Location(1, 1),
                new Location(36, 1),
                new Location(36, 15),
                new Location(1, 15),
                new Location(1, 1)));
        getEnemyMap().addEnemy(
            new Bug(
                tileSize,
                this,
                new Location(36, 1),
                new Location(36, 15),
                new Location(1, 15),
                new Location(1, 1),
                new Location(36, 1)));
        getEnemyMap().addEnemy(
            new Bug(
                tileSize,
                this,
                new Location(36, 15),
                new Location(1, 15),
                new Location(1, 1),
                new Location(36, 1),
                new Location(36, 15)));
        getEnemyMap().addEnemy(
            new Bug(
                tileSize,
                this,
                new Location(1, 15),
                new Location(1, 1),
                new Location(36, 1),
                new Location(36, 15),
                new Location(1, 15)));

        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(3, 33), new Location(
                34,
                33)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(34, 37), new Location(
                3,
                37)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(15, 35), new Location(
                34,
                35), new Location(3, 35), new Location(15, 35)));

        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(8, 31), new Location(
                29,
                31), new Location(29, 30), new Location(8, 30), new Location(
                8,
                31)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(12, 31), new Location(
                29,
                31), new Location(29, 30), new Location(8, 30), new Location(
                8,
                31), new Location(12, 31)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(16, 31), new Location(
                29,
                31), new Location(29, 30), new Location(8, 30), new Location(
                8,
                31), new Location(16, 31)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(20, 31), new Location(
                29,
                31), new Location(29, 30), new Location(8, 30), new Location(
                8,
                31), new Location(20, 31)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(24, 31), new Location(
                29,
                31), new Location(29, 30), new Location(8, 30), new Location(
                8,
                31), new Location(24, 31)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(28, 31), new Location(
                29,
                31), new Location(29, 30), new Location(8, 30), new Location(
                8,
                31), new Location(28, 31)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(27, 30), new Location(
                8,
                30), new Location(8, 31), new Location(29, 31), new Location(
                29,
                30), new Location(27, 30)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(23, 30), new Location(
                8,
                30), new Location(8, 31), new Location(29, 31), new Location(
                29,
                30), new Location(23, 30)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(19, 30), new Location(
                8,
                30), new Location(8, 31), new Location(29, 31), new Location(
                29,
                30), new Location(19, 30)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(15, 30), new Location(
                8,
                30), new Location(8, 31), new Location(29, 31), new Location(
                29,
                30), new Location(15, 30)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(11, 30), new Location(
                8,
                30), new Location(8, 31), new Location(29, 31), new Location(
                29,
                30), new Location(11, 30)));

        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(8, 28), new Location(
                29,
                28), new Location(29, 27), new Location(8, 27), new Location(
                8,
                28)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(12, 28), new Location(
                29,
                28), new Location(29, 27), new Location(8, 27), new Location(
                8,
                28), new Location(12, 28)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(16, 28), new Location(
                29,
                28), new Location(29, 27), new Location(8, 27), new Location(
                8,
                28), new Location(16, 28)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(20, 28), new Location(
                29,
                28), new Location(29, 27), new Location(8, 27), new Location(
                8,
                28), new Location(20, 28)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(24, 28), new Location(
                29,
                28), new Location(29, 27), new Location(8, 27), new Location(
                8,
                28), new Location(24, 28)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(28, 28), new Location(
                29,
                28), new Location(29, 27), new Location(8, 27), new Location(
                8,
                28), new Location(28, 28)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(27, 27), new Location(
                8,
                27), new Location(8, 28), new Location(29, 28), new Location(
                29,
                27), new Location(27, 27)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(23, 27), new Location(
                8,
                27), new Location(8, 28), new Location(29, 28), new Location(
                29,
                27), new Location(23, 27)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(19, 27), new Location(
                8,
                27), new Location(8, 28), new Location(29, 28), new Location(
                29,
                27), new Location(19, 27)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(15, 27), new Location(
                8,
                27), new Location(8, 28), new Location(29, 28), new Location(
                29,
                27), new Location(15, 27)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(11, 27), new Location(
                8,
                27), new Location(8, 28), new Location(29, 28), new Location(
                29,
                27), new Location(11, 27)));

        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(25, 22), new Location(
                12,
                22), new Location(12, 16), new Location(25, 16), new Location(
                25,
                22)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(12, 22), new Location(
                12,
                16), new Location(25, 16), new Location(25, 22), new Location(
                12,
                22)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(12, 16), new Location(
                25,
                16), new Location(25, 22), new Location(12, 22), new Location(
                12,
                16)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(25, 16), new Location(
                25,
                22), new Location(12, 22), new Location(12, 16), new Location(
                25,
                16)));

        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(23, 20), new Location(
                14,
                20), new Location(14, 18), new Location(23, 18), new Location(
                23,
                20)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(17, 20), new Location(
                14,
                20), new Location(14, 18), new Location(23, 18), new Location(
                23,
                20), new Location(17, 20)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(14, 18), new Location(
                23,
                18), new Location(23, 20), new Location(14, 20), new Location(
                14,
                18)));
        getEnemyMap().addEnemy(
            new Floater(tileSize, this, new Location(20, 18), new Location(
                23,
                18), new Location(23, 20), new Location(14, 20), new Location(
                14,
                18), new Location(20, 18)));

    }


    /**
     * Resets the stage to its original layout.
     */
    public Stage reset(float tileSize)
    {
        return new Stage8(tileSize);
    }
}
