package cs2114.tiletraveler;

/**
 * // -------------------------------------------------------------------------
 * /** An Exception that is thrown when the Path class tries to create a path
 * from less than two Locations
 *
 * @author Jacob Stenzel (sjacob95)
 * @version Oct 30, 2013
 */
public class IncompletePathException
    extends RuntimeException
{
    // ----------------------------------------------------------
    /**
     * Create a new IncompletePathException object.
     */
    public IncompletePathException()
    {
        super("The path contains fewer than two points");
    }
}
