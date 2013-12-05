package cs2114.tiletraveler;

import sofia.graphics.RectangleShape;

// -------------------------------------------------------------------------
/**
 * This class will represent a tile that is water
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public class Water
    extends RectangleShape
{
    /**
     * Creates a water tile at location
     *
     * @param x
     *            the x-coordinate of top left
     * @param y
     *            the y-coordinate of top left
     * @param cellSize
     *            size of tile
     */
    public Water(float x, float y, float cellSize)
    {
        super(x * cellSize, y * cellSize, (x + 1) * cellSize, (y + 1)
            * cellSize);
        setImage("water.png");
    }


    /**
     * Create a new Wall object.
     *
     * @param loc
     *            location of tile
     * @param cellSize
     *            size of tile
     */
    public Water(Location loc, float cellSize)
    {
        super(
            loc.x() * cellSize,
            loc.y() * cellSize,
            (loc.x() + 1) * cellSize,
            (loc.y() + 1) * cellSize);
        setImage("water.png");
    }
}
