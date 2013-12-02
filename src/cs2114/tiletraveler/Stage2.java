package cs2114.tiletraveler;

// -------------------------------------------------------------------------
/**
 * A demo stage designed to show how a map that is too large for the screen
 * functions when the screen's edge is reached
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public class DemoStage2
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
     * Create a new DemoStage2 object.
     */
    public DemoStage2()
    {
        super(map, startLoc);
    }
}
