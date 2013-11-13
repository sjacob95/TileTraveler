package cs2114.tiletraveler;

import student.TestCase;

/**
 * // -------------------------------------------------------------------------
 * /** Tests the Location class
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public class LocationTest
    extends TestCase
{

    private Location loc1;
    private Location loc2;
    private Location north;
    private Location south;
    private Location east;
    private Location west;


    /**
     * Sets up the testing environment
     */
    public void setUp()
    {
        loc1 = new Location(2, 3);
        loc2 = new Location(4, 5);
        north = new Location(2, 6);
        south = new Location(2, 0);
        east = new Location(5, 3);
        west = new Location(-1, 3);

    }


    /**
     * Tests the x() method
     */
    public void testX()
    {
        assertEquals(loc1.x(), 2);
        setUp();
    }


    /**
     * Tests the y() method
     */
    public void testY()
    {
        assertEquals(loc1.y(), 3);
        setUp();
    }


    /**
     * Tests the getNeightbor() method
     */
    public void testGetNeighbor()
    {
        assertEquals(loc1.getNeighbor(Direction.NORTH), new Location(2, 4));
        assertEquals(loc1.getNeighbor(Direction.SOUTH), new Location(2, 2));
        assertEquals(loc1.getNeighbor(Direction.EAST), new Location(3, 3));
        assertEquals(loc1.getNeighbor(Direction.WEST), new Location(1, 3));
        setUp();
    }


    /**
     * Tests the north() method
     */
    public void testNorth()
    {
        assertEquals(loc1.north(), new Location(2, 4));
        assertEquals(loc1.north(2), new Location(2, 5));
        setUp();
    }


    /**
     * Tests the south() method
     */
    public void testSouth()
    {
        assertEquals(loc1.south(), new Location(2, 2));
        assertEquals(loc1.south(2), new Location(2, 1));
        setUp();
    }


    /**
     * Tests the east() method
     */
    public void testEast()
    {
        assertEquals(loc1.east(), new Location(3, 3));
        assertEquals(loc1.east(2), new Location(4, 3));
        setUp();
    }


    /**
     * Tests the west() method
     */
    public void testWest()
    {
        assertEquals(loc1.west(), new Location(1, 3));
        assertEquals(loc1.west(2), new Location(0, 3));
        setUp();
    }


    /**
     * Tests the convertToDisplacement() method
     */
    public void testConvertToDisplacement()
    {
        assertEquals(
            Location.convertToDisplacement(Direction.NORTH),
            new Location(0, 1));
        assertEquals(
            Location.convertToDisplacement(Direction.SOUTH),
            new Location(0, -1));
        assertEquals(
            Location.convertToDisplacement(Direction.EAST),
            new Location(1, 0));
        assertEquals(
            Location.convertToDisplacement(Direction.WEST),
            new Location(-1, 0));
        setUp();

    }

    /**
     * Tests the isDueNorth() method
     */
    public void testIsDueNorth()
    {
        assertFalse(loc1.isDueNorth(null));
        assertFalse(loc1.isDueNorth(loc2));
        assertFalse(loc1.isDueNorth(south));
        assertTrue(loc1.isDueNorth(north));
    }

    /**
     * Tests the isDueNorth() method
     */
    public void testIsDueSouth()
    {
        assertFalse(loc1.isDueSouth(null));
        assertFalse(loc1.isDueSouth(loc2));
        assertFalse(loc1.isDueSouth(north));
        assertTrue(loc1.isDueSouth(south));
    }

    /**
     * Tests the isDueNorth() method
     */
    public void testIsDueEast()
    {
        assertFalse(loc1.isDueEast(null));
        assertFalse(loc1.isDueEast(loc2));
        assertFalse(loc1.isDueEast(west));
        assertTrue(loc1.isDueEast(east));
    }

    /**
     * Tests the isDueNorth() method
     */
    public void testIsDueWest()
    {
        assertFalse(loc1.isDueWest(null));
        assertFalse(loc1.isDueWest(loc2));
        assertFalse(loc1.isDueWest(east));
        assertTrue(loc1.isDueWest(west));
    }

}
