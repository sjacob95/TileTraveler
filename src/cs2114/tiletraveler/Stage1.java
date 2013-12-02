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
public class DemoStage1
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
     * Create a new DemoStage1 object.
     */
    public DemoStage1()
    {
        super(map, startLoc);
    }
}
