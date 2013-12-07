package cs2114.tiletraveler;

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

    private Button up;
    private Button down;
    private Button left;
    private Button right;
    private Button centerScreen;


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
// Activity activity = getActivity();
// final View view1 =
// activity.findViewById(cs2114.tiletraveler.R.id.stage1);
// final View view2 =
// activity.findViewById(cs2114.tiletraveler.R.id.stage2);
// final View view3 =
// activity.findViewById(cs2114.tiletraveler.R.id.stage3);
// final View view4 =
// activity.findViewById(cs2114.tiletraveler.R.id.stage4);
// final View view5 =
// activity.findViewById(cs2114.tiletraveler.R.id.stage5);
// final View view6 =
// activity.findViewById(cs2114.tiletraveler.R.id.stage6);
// final View view7 =
// activity.findViewById(cs2114.tiletraveler.R.id.stage7);
// // final View view8 =
// // activity.findViewById(cs2114.tiletraveler.R.id.stage8);
// activity.runOnUiThread(new Runnable() {
//
// @Override
// public void run()
// {
// view1.requestFocus();
// view1.callOnClick();
// assertTrue(getScreen().getCurrentStage() instanceof Stage1);
// view2.requestFocus();
// view2.callOnClick();
// assertTrue(getScreen().getCurrentStage() instanceof Stage2);
// view3.requestFocus();
// view3.callOnClick();
// assertTrue(getScreen().getCurrentStage() instanceof Stage3);
// view4.requestFocus();
// view4.callOnClick();
// assertTrue(getScreen().getCurrentStage() instanceof Stage4);
// view5.requestFocus();
// view5.callOnClick();
// assertTrue(getScreen().getCurrentStage() instanceof Stage5);
// view6.requestFocus();
// view6.callOnClick();
// assertTrue(getScreen().getCurrentStage() instanceof Stage6);
// view7.requestFocus();
// view7.callOnClick();
// assertTrue(getScreen().getCurrentStage() instanceof Stage7);
// // view8.requestFocus();
// // view8.callOnClick();
// // assertTrue(getScreen().getCurrentStage() instanceof Stage8);
//
// }
// });
        TileTravelerScreen activity = getActivity();
//
// View view1 = activity.findViewById(cs2114.tiletraveler.R.id.stage1);
// getInstrumentation().invokeMenuActionSync(activity, view1, 0);
// assertTrue(activity.getCurrentStage() instanceof Stage1);

//
        getInstrumentation().invokeMenuActionSync(activity, R.id.stage1, 0);
        assertTrue(getScreen().getCurrentStage() instanceof Stage1);
        getInstrumentation().invokeMenuActionSync(activity, R.id.stage2, 0);
        assertTrue(getScreen().getCurrentStage() instanceof Stage2);
        getInstrumentation().invokeMenuActionSync(activity, R.id.stage3, 0);
        assertTrue(getScreen().getCurrentStage() instanceof Stage3);
        getInstrumentation().invokeMenuActionSync(activity, R.id.stage4, 0);
        assertTrue(getScreen().getCurrentStage() instanceof Stage4);
        getInstrumentation().invokeMenuActionSync(activity, R.id.stage5, 0);
        assertTrue(getScreen().getCurrentStage() instanceof Stage5);
        getInstrumentation().invokeMenuActionSync(activity, R.id.stage6, 0);
        assertTrue(getScreen().getCurrentStage() instanceof Stage6);
        getInstrumentation().invokeMenuActionSync(activity, R.id.stage7, 0);
        assertTrue(getScreen().getCurrentStage() instanceof Stage7);
// getInstrumentation().invokeMenuActionSync(activity,
// cs2114.tiletraveler.R.id.stage8, 0);
// assertTrue(getScreen().getCurrentStage() instanceof Stage8);

    }


    public void testAct()
    {
        // click(up);

    }

}
