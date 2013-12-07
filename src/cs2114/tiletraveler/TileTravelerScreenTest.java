package cs2114.tiletraveler;

import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;

/**
 * Class to tests the methods in TileTravlerScreen.
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class TileTravelerScreenTest
    extends student.AndroidTestCase<TileTravelerScreen>
{
    private Menu tile_traveler_screen;
    private MenuItem stage1;

    /**
     * Create a new TileTravelerScreenTest object.
     */
    public TileTravelerScreenTest()
    {
        super(TileTravelerScreen.class);
    }


    /**
     * Set up the screen.
     */
    public void setUp()
    {
        // intentionally empty setUp() method.
    }


    /**
     * Ensures that the stage1Clicked() method functions as expected.
     */
    public void testStage1Clicked()
    {
//        tile_traveler_screen.performIdentifierAction(stage1.getItemId(), 0);
        assertTrue(getScreen().getCurrentStage() instanceof Stage1);
    }

}
