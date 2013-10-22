package cs2114.tiletraveler;

import sofia.graphics.RectangleShape;

// -------------------------------------------------------------------------
/**
 *  Creates 2D array representation of tiletraveler map
 *
 *  @author Luciano Biondi (lbiondi)
 *  @version 2013.10.21
 */
public class Map
{
    private RectangleShape[][] map;

    /**
     * Create a new Map object which represents a map using tiles
     *
     * @param cellSize is size of tile
     */
    public Map(float cellSize)
    {
        map = new RectangleShape[5][5];
        map[0][0] = new Wall(new Location(0, 0), cellSize);
        map[1][0] = new Wall(new Location(1, 0), cellSize);
        map[2][0] = new Door(new Location(2, 0), cellSize);
        map[3][0] = new Wall(new Location(3, 0), cellSize);
        map[4][0] = new Wall(new Location(4, 0), cellSize);
        map[0][1] = new Wall(new Location(0, 1), cellSize);
        map[2][1] = new Floor(new Location(2, 1), cellSize);
        map[4][1] = new Wall(new Location(4, 1), cellSize);
        map[0][2] = new Wall(new Location(0, 2), cellSize);
        map[2][2] = new Floor(new Location(2, 2), cellSize);
        map[4][2] = new Wall(new Location(4, 2), cellSize);
        map[0][3] = new Wall(new Location(0, 3), cellSize);
        map[1][3] = new Floor(new Location(1, 3), cellSize);
        map[2][3] = new Floor(new Location(2, 3), cellSize);
        map[3][3] = new Floor(new Location(3, 3), cellSize);
        map[4][3] = new Wall(new Location(4, 3), cellSize);
        map[0][4] = new Wall(new Location(0, 4), cellSize);
        map[1][4] = new Wall(new Location(1, 4), cellSize);
        map[2][4] = new Wall(new Location(2, 4), cellSize);
        map[3][4] = new Wall(new Location(3, 4), cellSize);
        map[4][4] = new Wall(new Location(4, 4), cellSize);
    }

    /**
     * Gets the 2d array that represents map
     * @return RectangleShape[][] that represents map
     */
    public RectangleShape[][] get()
    {
        return map;
    }
}
