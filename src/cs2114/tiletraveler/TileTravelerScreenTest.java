package cs2114.tiletraveler;

import android.os.Looper;
import android.os.Handler;
import android.view.KeyEvent;
import android.app.Instrumentation.ActivityMonitor;
import android.app.Activity;
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

    private Button   up;
    private Button   down;
    private Button   left;
    private Button   right;
    private Button   centerScreen;

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
        // intentionally empty set up methods
    }


    /**
     * Ensures that the stage1Clicked() method functions as expected.
     */
    public void testStage1Clicked()
    {

        final TileTravelerScreen activity = getActivity();
        Handler refresh = new Handler(Looper.getMainLooper());
        refresh.post(new Runnable() {
            public void run()
            {
                activity.stage8Clicked();
                activity.stage7Clicked();
                activity.stage6Clicked();
                activity.stage5Clicked();
                activity.stage4Clicked();
                activity.stage3Clicked();
                activity.stage2Clicked();
                activity.stage1Clicked();

            }

        });
        assertTrue(getScreen().getCurrentStage() instanceof Stage1);

    }


    public void testAct()
    {
        // click(up);

    }

}
