package cs2114.tiletraveler;

// -------------------------------------------------------------------------
/**
 *  Location class to keep track of grid
 *
 *  @author Luciano Biondi (lbiondi)
 *  @version 2013.10.21
 */
public class Location
{
    private int xCoor;
    private int yCoor;

    // ----------------------------------------------------------
    /**
     * Create a new Location object.
     * @param x x coordinate of location
     * @param y y coordinate of location
     */
    public Location(int x, int y)
    {
        xCoor = x;
        yCoor = y;
    }

    // ----------------------------------------------------------
    /**
     * Get the x of location
     * @return xCoor x coordinate of location
     */
    public int x()
    {
        return xCoor;
    }

    // ----------------------------------------------------------
    /**
     * Get the y of location
     * @return yCoor y coordinate of location
     */
    public int y()
    {
        return yCoor;
    }
}
