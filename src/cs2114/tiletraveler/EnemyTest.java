package cs2114.tiletraveler;
import student.TestCase;

/**
 * // -------------------------------------------------------------------------
/**
 *  Tester for the EnemyMap and MovingEnemy classes
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public class EnemyTest
    extends TestCase
{
    private EnemyMap enemi;
    private Bug bugger;

    /**
     * set up for testing
     */
    public void setUp()
    {
        enemi = new EnemyMap(5);
        bugger = new Bug(10f, new Stage1(10f),
            new Location(1, 1), new Location(1, 3));
    }

    /**
     * test the methods in enemy
     */
    public void testEnemy()
    {
        Enemy[][] test = enemi.get();
        bugger.act();
        bugger.getLastAnimation();
        assertEquals(5, test.length);
        assertNull(enemi.getEnemy(new Location(7, 7)));
        assertNull(enemi.getEnemy(7, 7));
    }
}
