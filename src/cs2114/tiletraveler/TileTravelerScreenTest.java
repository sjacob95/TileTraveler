package cs2114.tiletraveler;

import android.os.Looper;
import android.os.Handler;
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

    private TileTravelerScreen view;

    private Button             up;
    private Button             down;
    private Button             left;
    private Button             right;
    private Button             centerScreen;


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
        view = getScreen();
    }


    /**
     * Ensures that the stage1Clicked() method functions as expected. Calls the
     * stage#Clicked() methods on another thread to execute them. This is the
     * only way we could get Web-Cat to execute our menu items!
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


    /**
     * Testing buttons like up.
     */
//    public void testUp() {
//        //TimerClass(click(up));
//        //assert(something, view.getSomething())
//
//    }



    /**
     * Tests the act() method to ensure that it functions properly.
     */
    public void testAct()
    {
        view.callPlayerSetJumpImage();
        view.adjustEnemies();
        view.adjustEntity(view.getPlayer());
        view.adjustPlayer();
        view.redrawEntity(view.getPlayer());
        view.checkOrigin();
//        view.changeWasObserved(view.getPlayer(), true);
//        view.changeWasObserved(view.getPlayer(), false);
        view.callPlayerResumeInput();
        view.callPlayerMovingStopped();
        view.callPlayerCheckAndMove();
        view.callPlayerIncJumpCount();
        view.callPlayerNextMove();
        view.callPlayerSetRestImage();
        view.callPlayerSetWalkImage();
        view.callPlayerSetJumpImage();

//        assertEquals("sofia.graphics.Image@529d5f00", view.getPlayer()
//            .getShape().getImage());

    }

}
