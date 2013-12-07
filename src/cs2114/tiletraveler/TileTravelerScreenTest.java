package cs2114.tiletraveler;

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
        Activity activity = getActivity();
        final View view1 =
            activity.findViewById(cs2114.tiletraveler.R.id.stage1);
        activity.runOnUiThread(new Runnable() {

            @Override
            public void run()
            {
                view1.requestFocus();
                view1.callOnClick();
            }
        });
        assertTrue(getScreen().getCurrentStage() instanceof Stage1);
        final View view2 =
            activity.findViewById(cs2114.tiletraveler.R.id.stage2);
        activity.runOnUiThread(new Runnable() {

            @Override
            public void run()
            {
                view2.requestFocus();
                view2.callOnClick();
                assertTrue(getScreen().getCurrentStage() instanceof Stage2);
            }
        });

        final View view3 =
            activity.findViewById(cs2114.tiletraveler.R.id.stage3);
        activity.runOnUiThread(new Runnable() {

            @Override
            public void run()
            {
                view3.requestFocus();
                view3.callOnClick();
                assertTrue(getScreen().getCurrentStage() instanceof Stage3);
            }
        });

        final View view4 =
            activity.findViewById(cs2114.tiletraveler.R.id.stage4);
        activity.runOnUiThread(new Runnable() {

            @Override
            public void run()
            {
                view4.requestFocus();
                view4.callOnClick();
                assertTrue(getScreen().getCurrentStage() instanceof Stage4);
            }
        });
        final View view5 =
            activity.findViewById(cs2114.tiletraveler.R.id.stage5);
        activity.runOnUiThread(new Runnable() {

            @Override
            public void run()
            {
                view5.requestFocus();
                view5.callOnClick();
                assertTrue(getScreen().getCurrentStage() instanceof Stage5);
            }
        });
        final View view6 =
            activity.findViewById(cs2114.tiletraveler.R.id.stage6);
        activity.runOnUiThread(new Runnable() {

            @Override
            public void run()
            {
                view6.requestFocus();
                view6.callOnClick();
                assertTrue(getScreen().getCurrentStage() instanceof Stage6);
            }
        });
        final View view7 =
            activity.findViewById(cs2114.tiletraveler.R.id.stage7);
        activity.runOnUiThread(new Runnable() {

            @Override
            public void run()
            {
                view7.requestFocus();
                view7.callOnClick();
                assertTrue(getScreen().getCurrentStage() instanceof Stage7);
            }
        });
// final View view8 =
// activity.findViewById(cs2114.tiletraveler.R.id.stage8);
// activity.runOnUiThread(new Runnable() {
//
// @Override
// public void run()
// {
// view4.requestFocus();
// view4.callOnClick();
// assertTrue(getScreen().getCurrentStage() instanceof Stage8);
// }
// });

    }


    public void testAct()
    {
        // click(up);

    }

}
