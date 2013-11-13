package cs2114.tiletraveler;

import sofia.graphics.RectangleShape;

// -------------------------------------------------------------------------
/**
 *  This class will represent a tile that is a wall
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public class Wall extends RectangleShape
{
    /**
     * Creates a wall tile at location
     *
     * @param x the x-coordinate of top left
     * @param y the y-coordinate of top left
     * @param cellSize size of tile
     */
    public Wall(float x, float y, float cellSize)
    {
        super(x*cellSize, y*cellSize, (x+1)*cellSize, (y+1)*cellSize);
        setImage("wall.png");
    }

    /**
     * Create a new Wall object.
     * @param loc location of tile
     * @param cellSize size of tile
     */
    public Wall(Location loc, float cellSize)
    {
        super(loc.x()*cellSize, loc.y()*cellSize,
            (loc.x()+1)*cellSize, (loc.y()+1)*cellSize);
        setImage("wall.png");
    }
}