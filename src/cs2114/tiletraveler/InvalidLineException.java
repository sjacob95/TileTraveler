package cs2114.tiletraveler;

// -------------------------------------------------------------------------
/**
 * An Exception thrown one attempts to create a line between two points that are
 * not directly north, south, east, or west of each other
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class InvalidLineException
    extends RuntimeException
{
    // ----------------------------------------------------------
    /**
     * Create a new InvalidLineException object.
     *
     * @param loc1
     *            - first Location
     * @param loc2
     *            - second Location
     */
    public InvalidLineException(Location loc1, Location loc2)
    {
        super(loc1.toString() + " and " + loc2 + " do not form a valid line");
    }
}
