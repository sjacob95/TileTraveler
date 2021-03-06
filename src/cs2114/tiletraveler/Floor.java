package cs2114.tiletraveler;

import sofia.graphics.RectangleShape;

// -------------------------------------------------------------------------
/**
 * This class will represent a tile that is a floor
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class Floor
    extends RectangleShape
{
    /**
     * Creates a floor tile at location
     *
     * @param x
     *            the x-coordinate of top left
     * @param y
     *            the y-coordinate of top left
     * @param cellSize
     *            size of tile
     */
    public Floor(float x, float y, float cellSize)
    {
        super(x * cellSize, y * cellSize, (x + 1) * cellSize, (y + 1)
            * cellSize);
        setImage("floor.png");
    }
}
