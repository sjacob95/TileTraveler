package cs2114.tiletraveler;

/**
 * // -------------------------------------------------------------------------
 * /** An Exception that is thrown when a Path moves through
 *
 * @author Jacob Stenzel
 * @version Oct 30, 2013
 */
public class PathObstructionException
    extends RuntimeException
{
    // ----------------------------------------------------------
    /**
     * Create a new PathObstructionException object.
     *
     * @param loc
     *            The offending Location
     * @param tile
     *            The offending Tile
     */
    public PathObstructionException(Location loc, Tile tile)
    {
        super("An obstruction of type " + tile.toString()
            + " was encountered at location " + loc.toString());
    }
}
