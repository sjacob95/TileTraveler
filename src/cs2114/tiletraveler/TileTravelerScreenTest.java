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
// getInstrumentation().invokeMenuActionSync(activity, R.id.stage1, 0);
// assertTrue(getScreen().getCurrentStage() instanceof Stage1);
// getInstrumentation().invokeMenuActionSync(activity, R.id.stage2, 0);
// assertTrue(getScreen().getCurrentStage() instanceof Stage2);
// getInstrumentation().invokeMenuActionSync(activity, R.id.stage3, 0);
// assertTrue(getScreen().getCurrentStage() instanceof Stage3);
// getInstrumentation().invokeMenuActionSync(activity, R.id.stage4, 0);
// assertTrue(getScreen().getCurrentStage() instanceof Stage4);
// getInstrumentation().invokeMenuActionSync(activity, R.id.stage5, 0);
// assertTrue(getScreen().getCurrentStage() instanceof Stage5);
// getInstrumentation().invokeMenuActionSync(activity, R.id.stage6, 0);
// assertTrue(getScreen().getCurrentStage() instanceof Stage6);
// getInstrumentation().invokeMenuActionSync(activity, R.id.stage7, 0);
// assertTrue(getScreen().getCurrentStage() instanceof Stage7);
        Handler refresh = new Handler(Looper.getMainLooper());
        refresh.post(new Runnable() {
            public void run()
            {
                activity.stage1Clicked();
                activity.stage2Clicked();
                activity.stage3Clicked();
                activity.stage4Clicked();
                activity.stage5Clicked();
                activity.stage6Clicked();
                activity.stage7Clicked();
            }
        });

    }


    public void testAct()
    {
        // click(up);

    }

}
