package cs2114.tiletraveler;

import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Tests the Path class
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class PathTest
    extends TestCase
{
    private Location loc1;
    private Location loc2;
    private Location loc3;
    private Location loc4;
    private Location loc5;
    private Location loc6;
    private Path     path1;
    private Path     path2;
    private Tile[]   conditions = { Tile.FLOOR, Tile.EMPTY };
    private Map      map1       = new Map(
                                    "WWWWWWWWWWW",
                                    "WFFFFFFFFFW",
                                    "WFFFFFFFFFW",
                                    "WFF     FFW",
                                    "WFF     FFW",
                                    "WFF     FFW",
                                    "WFF     FFW",
                                    "WFF     FFW",
                                    "WFF     FFW",
                                    "WFFFFFFFFFW",
                                    "WFFFFFFFFFW");

    private Map      map2       = new Map(
                                    "WWWWWWWWWWW",
                                    "WFFFFFFFWFW",
                                    "WFFFFFFFWFW",
                                    "WFF     WFW",
                                    "WFF     WFW",
                                    "WFF     WFW",
                                    "WFF     WFW",
                                    "WFF     WFW",
                                    "WFF     WFW",
                                    "WFFFFFFFWFW");


    /**
     * Sets up the Path for testing.
     */
    public void setUp()
    {
        loc1 = new Location(5, 5);
        loc2 = new Location(2, 5);
        loc3 = new Location(8, 5);
        loc4 = new Location(5, 2);
        loc5 = new Location(5, 8);
        loc6 = new Location(0, 0);
        path1 = new Path(PathSetting.ALLOW, conditions, map1);
        path2 = new Path(PathSetting.DISALLOW, conditions, map2);
    }


    // ----------------------------------------------------------
    /**
     * Tests the vast majority of the Path class
     */
    public void testAll()
    {
        Path path3 =
            new Path(PathSetting.ALLOW, conditions, map1, new Location[] {
                new Location(1, 1), new Location(3, 1), new Location(3, 4) });
        assertEquals(path3.get().size(), 10);
        assertEquals(path3.get().getCurrent(), new Location(1, 1));
        path3.get().next();
        path3.get().next();
        assertEquals(path3.get().getCurrent(), new Location(3, 1));
        path3.get().next();
        path3.get().next();
        path3.get().next();
        assertEquals(path3.get().getCurrent(), new Location(3, 4));
        path3.get().next();
        path3.get().next();
        assertEquals(path3.get().getCurrent(), new Location(3, 2));
        path3.get().next();
        assertEquals(path3.get().getCurrent(), new Location(3, 1));
        path3.get().next();
        assertEquals(path3.get().getCurrent(), new Location(2, 1));
        path3.get().next();
        assertEquals(path3.get().getCurrent(), new Location(1, 1));
        path3.get().next();
        path3.get().next();
        assertEquals(path3.get().getCurrent(), new Location(3, 1));

        Path path4 =
            new Path(PathSetting.ALLOW, conditions, map1, new Location[] {
                new Location(1, 1), new Location(3, 1), new Location(3, 3),
                new Location(1, 3), new Location(1, 1) });
        assertEquals(path4.get().size(), 8);
        assertEquals(path4.get().getCurrent(), new Location(1, 1));
        path4.get().next();
        path4.get().next();
        assertEquals(path4.get().getCurrent(), new Location(3, 1));
        path4.get().next();
        path4.get().next();
        assertEquals(path4.get().getCurrent(), new Location(3, 3));
        path4.get().next();
        path4.get().next();
        assertEquals(path4.get().getCurrent(), new Location(1, 3));
        path4.get().next();
        path4.get().next();
        assertEquals(path4.get().getCurrent(), new Location(1, 1));
        path4.get().next();
        path4.get().next();
        assertEquals(path4.get().getCurrent(), new Location(3, 1));
    }


    // ----------------------------------------------------------
    /**
     * Tests the interpolatePath(Location[]) method
     */
    public void testInterpolatePath()
    {
        Location[] output1 =
        { loc1, new Location(4, 5), new Location(3, 5), loc2 };
        Location[] output2 =
        { loc1, new Location(6, 5), new Location(7, 5), loc3 };
        Location[] output3 =
        { loc1, new Location(5, 4), new Location(5, 3), loc4 };
        Location[] output4 =
        { loc1, new Location(5, 6), new Location(5, 7), loc5 };
        assertEquals(
            arrayToString(path1.interpolatePath(loc1, loc2)),
            arrayToString(output1));
        assertEquals(
            arrayToString(path1.interpolatePath(loc1, loc3)),
            arrayToString(output2));
        assertEquals(
            arrayToString(path1.interpolatePath(loc1, loc4)),
            arrayToString(output3));
        assertEquals(
            arrayToString(path1.interpolatePath(loc1, loc5)),
            arrayToString(output4));

        setUp();

        Location[] input = { loc5, loc1, loc2 };
        Location[] output5 =
        { loc5, new Location(5, 7), new Location(5, 6), loc1,
            new Location(4, 5), new Location(3, 5), loc2 };

        assertEquals(
            path1.interpolatePath(input).toString(),
            arrayToString(output5));
    }


    // ----------------------------------------------------------
    /**
     * Tests the checkObstruction() and checkValidPath() methods
     */
    public void testCheck()
    {
        path1.checkObstruction(loc1);
        Exception thrown = null;
        try
        {
            path1.checkObstruction(loc6);
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertTrue(thrown instanceof PathObstructionException);
        assertEquals(
            thrown.getMessage(),
            "An obstruction of type WALL was encountered at location (0, 0)");
        path2.checkObstruction(loc6);
        thrown = null;
        try
        {
            path2.checkObstruction(loc1);
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertTrue(thrown instanceof PathObstructionException);
        assertEquals(
            thrown.getMessage(),
            "An obstruction of type EMPTY was encountered at location (5, 5)");
        path1.checkValidPath(new Location[] { loc1, loc2 });
        thrown = null;
        try
        {
            path1.checkValidPath(new Location[] { loc3 });
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertTrue(thrown instanceof IncompletePathException);
        assertEquals(
            thrown.getMessage(),
            "The path contains fewer than two points");

    }


    // ----------------------------------------------------------
    /**
     * A helper method for comparing Arrays according to their values rather
     * than their contents' locations in memory
     *
     * @param array
     *            The Array to be returned in String form
     * @return array in String form
     */
    public String arrayToString(Object[] array)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < array.length - 1; i++)
        {
            builder.append(array[i].toString());
            builder.append(", ");
        }
        if (array.length > 0)
        {
            builder.append(array[array.length - 1]);
        }
        builder.append("]");
        return builder.toString();
    }
}
