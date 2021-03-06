package cs2114.tiletraveler;

import android.os.Looper;
import android.os.Handler;

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

        Handler refresh = new Handler(Looper.getMainLooper());
        refresh.post(new Runnable() {
            public void run()
            {
                view.stage8Clicked();
                view.stage7Clicked();
                view.stage6Clicked();
                view.stage5Clicked();
                view.stage4Clicked();
                view.stage3Clicked();
                view.stage2Clicked();
                view.stage1Clicked();
                view.resetClicked();

            }

        });
        assertTrue(getScreen().getCurrentStage() instanceof Stage1);
    }


    /**
     * Tests the act() method to ensure that it functions properly.
     */
    public void testAct()
    {
        view.adjustPlayer();
        assertEquals(true, view.getPlayer().isAlive());
        view.callPlayerSetJumpImage();
        view.adjustEnemies();
        view.adjustEntity(view.getPlayer());
        assertEquals(true, view.getPlayer().isAlive());
        view.redrawEntity(view.getPlayer());
        view.checkOrigin();
        view.callPlayerResumeInput();
        assertEquals(true, view.getPlayer().isAlive());
        view.callPlayerMovingStopped();
        assertEquals(false, view.getPlayer().isMoving());
        view.callPlayerCheckAndMove();
        view.callPlayerIncJumpCount();
        view.callPlayerNextMove();
        view.callPlayerSetRestImage();
        view.callPlayerSetWalkImage();
        view.callPlayerSetJumpImage();
        view.getPlayer().setAlive(false);
        view.adjustPlayer();

    }

    /**
     * Tests the upClicked() method
     */
    public void testUpClicked()
    {
        view.upClicked();
        assertEquals(Direction.NORTH, view.getPlayer().getDirection());
    }

    /**
     * Tests the downClicked() method
     */
    public void testDownClicked()
    {
        view.downClicked();
        assertEquals(Direction.NORTH, view.getPlayer().getDirection());
    }


    /**
     * Tests the leftClicked() method
     */
    public void testLeftClicked()
    {
        view.leftClicked();
        assertEquals(Direction.NORTH, view.getPlayer().getDirection());
    }


    /**
     * Tests the rightClicked() method
     */
    public void testRightClicked()
    {
        view.rightClicked();
        assertEquals(Direction.NORTH, view.getPlayer().getDirection());
    }


    /**
     * Tests the centerScreenClicked()method
     */
    public void testCenterScreenClicked()
    {
        view.getPlayer().setAlive(false);
        view.centerScreenClicked();
        assertFalse(view.getPlayer().isAlive());
    }


    /**
     * Tests the checkOrigin() method
     */
    public void testCheckOrigin()
    {
        view.getPlayer().setLocation(new Location(0, 100));
        view.checkOrigin();
        view.getPlayer().setLocation(new Location(0, -100));
        view.checkOrigin();
        view.getPlayer().setLocation(new Location(100, 0));
        view.checkOrigin();
        view.getPlayer().setLocation(new Location(-100, 0));
        view.checkOrigin();
        assertEquals(new Location(-100, 0), view.getPlayer().getLocation());
        view.getPlayer().setAlive(false);
        view.checkOrigin();
    }


    /**
     * Tests to ensure the changeWasObserved() method was executed properly.
     */
    public void testChangeWasObserved()
    {

        Handler refresh = new Handler(Looper.getMainLooper());
        refresh.post(new Runnable() {
            public void run()
            {
                view.changeWasObserved(view.getPlayer(), true);
                view.changeWasObserved(view.getPlayer(), false);
                view.changeWasObserved(view.getPlayer(), "nextMove", 0);
                assertTrue(view.getPlayer().isAlive());
                view.changeWasObserved(view.getPlayer(), 1, 0, 50);
            }

        });
    }

}
