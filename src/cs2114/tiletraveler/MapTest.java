package cs2114.tiletraveler;

import student.TestCase;

/**
 * // -------------------------------------------------------------------------
/**
 *  Tester for the Map class
 *
 *  @author Jacob Stenzel (sjacob95)
 *  @version 2013.10.22
 */
public class MapTest
    extends TestCase
{
    private Map map1;
    private Map map2;

    public void setUp()
    {
        map1 = new Map(5);
        map1.setTile(0, 0, Tile.FLOOR);
        map1.setTile(1, 1, Tile.WALL);
        map1.setTile(2, 2, Tile.PILLAR);
        map1.setTile(3, 1, Tile.LILY);
        map1.setTile(4, 0, Tile.WALL);
        map1.setTile(2, 4, Tile.WATER);

        map2 = new Map("  ~  ",
                       "     ",
                       "  I  ",
                       " W Q ",
                       "O   W");
    }

    public void testGetTile()
    {
        assertEquals(map1.getTile(0, 0), Tile.FLOOR);
        assertEquals(map1.getTile(1, 1), Tile.WALL);
        assertEquals(map1.getTile(2, 2), Tile.PILLAR);
        assertEquals(map1.getTile(3, 1), Tile.LILY);
        assertEquals(map1.getTile(4, 0), Tile.WALL);
        assertEquals(map1.getTile(2, 4), Tile.WATER);
        assertNull(map1.getTile(0, 2));
        assertEquals(map1.getTile(42, 42), Tile.INVALID);

        assertEquals(map1.getTile(new Location(3, 1)), Tile.LILY);
        assertEquals(map1.getTile(new Location(2, 143)), Tile.INVALID);

        setUp();
    }

    public void testSecondaryConstructor()
    {
        assertEquals(map1.getTile(0, 0), Tile.FLOOR);
        assertEquals(map1.getTile(1, 1), Tile.WALL);
        assertEquals(map1.getTile(2, 2), Tile.PILLAR);
        assertEquals(map1.getTile(3, 1), Tile.LILY);
        assertEquals(map1.getTile(4, 0), Tile.WALL);
        assertEquals(map1.getTile(2, 4), Tile.WATER);
        assertNull(map1.getTile(0, 2));
        assertEquals(map1.getTile(42, 42), Tile.INVALID);

        assertEquals(map1.toString(), map2.toString());
    }

}