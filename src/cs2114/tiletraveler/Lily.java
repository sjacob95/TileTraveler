package cs2114.tiletraveler;

import sofia.graphics.RectangleShape;

// -------------------------------------------------------------------------
/**
 * This class will represent a tile that is a lily
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class Lily
    extends RectangleShape
{
    /**
     * Creates a lily tile at location
     *
     * @param x
     *            the x-coordinate of top left
     * @param y
     *            the y-coordinate of top left
     * @param cellSize
     *            size of tile
     */
    public Lily(float x, float y, float cellSize)
    {
        super(x * cellSize, y * cellSize, (x + 1) * cellSize, (y + 1)
            * cellSize);
        setImage("lily.png");
    }
}
