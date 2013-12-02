package cs2114.tiletraveler;

/**
 * // -------------------------------------------------------------------------
 * /** An Exception that is thrown when the Path class tries to create a path
 * that is outside of the map's boundaries
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class OutsideMapException
    extends RuntimeException
{
    // ----------------------------------------------------------
    /**
     * Create a new OutsideMapException object.
     *
     * @param loc
     *            The offending point
     * @param map
     *            The Map
     */
    public OutsideMapException(Location loc, Map map)
    {
        super("The point" + loc.toString()
            + " does not lie entirely on the map of size " + map.getMapDim()
            + " + " + map.getMapDim());
    }
}
