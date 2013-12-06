package cs2114.tiletraveler;

import student.TestCase;

/**
 * Test class for the Player object.
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class PlayerTest
    extends TestCase
{

    private Player   player;
    private Stage    stage;
    private Location startLocation;


    /**
     * Sets up the test area using Stage 1 to test.
     */
    public void setUp()
    {
        stage = new Stage1(10f);
        player = new Player(5f, 6f, 10f, stage);
        player = new Player(startLocation, 10f, stage);
    }


    /**
     * Tests the act() method in the Player class to ensure that it functions as
     * expected.
     */
    public void testAct()
    {
        player.act(Direction.WEST);
        assertEquals(true, player.isMoving());
        assertEquals(Direction.WEST, player.getDirection());
        player.movingStopped();
        assertEquals(true, player.isMoving());
        player.act(Direction.EAST);
        assertEquals(Direction.EAST, player.getDirection());
    }

}
