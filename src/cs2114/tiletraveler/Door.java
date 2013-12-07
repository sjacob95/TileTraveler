package cs2114.tiletraveler;

import sofia.graphics.RectangleShape;

// -------------------------------------------------------------------------
/**
 * This class will represent a tile that is a door
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class Door
    extends RectangleShape
{
    /**
     * Creates a door tile at location
     *
     * @param x
     *            the x-coordinate of top left
     * @param y
     *            the y-coordinate of top left
     * @param cellSize
     *            size of tile
     */
    public Door(float x, float y, float cellSize)
    {
        super(x * cellSize, y * cellSize, (x + 1) * cellSize, (y + 1)
            * cellSize);
        setImage("door.png");
    }
}
