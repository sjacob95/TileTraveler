package cs2114.tiletraveler;

// -------------------------------------------------------------------------
/**
 * Creates 2D array representation of tiletraveler map
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public class Map
{
    private Tile[][] map;
    private int      mapDim;


    /**
     * Create a new Map object which represents a map using tiles
     *
     * @param mapDim - the desired dimensions of the Map
     */
    public Map(int mapDim)
    {
        map = new Tile[mapDim][mapDim];
        this.mapDim = mapDim;
        for(int x = 0; x < mapDim; x++)
        {
            for(int y = 0; y < mapDim; y++)
            {
                setTile(x, y, Tile.EMPTY);
            }
        }
    }


    /**
     * Create a new Map object which represents a map using tiles
     *
     * @param strings - a series of Strings to be converted to a Map
     */
    public Map(String... strings)
    {
        this(calculateMapDim(strings));
        mapDim = calculateMapDim(strings);
        for (int y = strings.length - 1; y >= 0; y--)
        {
            for (int x = 0; x < strings[y].length(); x++)
            {
                setTile(x, strings.length - (y + 1), convertToTile(strings[y].charAt(x)));
            }
        }

    }


    /**
     * Gets the 2d array that represents map
     *
     * @return Tile[][] that represents map
     */
    public Tile[][] get()
    {
        return map;
    }

    /**
     * sets the Tile at a Location to the Tile specified
     * @param x - the the x coordinate of the Location to be set
     * @param y - the the y coordinate of the Location to be set
     * @param tile - the desired Tile
     */
    public void setTile(int x, int y, Tile tile)
    {
        map[y][x] = tile;
    }

    /**
     * sets the Tile at a Location to the Tile specified
     * @param loc - the Location to be set
     * @param tile - the desired Tile
     */
    public void setTile(Location loc, Tile tile)
    {
        map[loc.y()][loc.x()] = tile;
    }

    /**
     * sets the Tile at a Location to the Tile represented by a character
     * @param x - the the x coordinate of the Location to be set
     * @param y - the the y coordinate of the Location to be set
     * @param symbol - the the character representation of the desired Tile
     */
    public void setTile(int x, int y, char symbol)
    {
        map[y][x] = convertToTile(symbol);
    }

    /**
     * sets the Tile at a Location to the Tile represented by a character
     * @param loc - the Location to be set
     * @param symbol - the the character representation of the desired Tile
     */
    public void setTile(Location loc, char symbol)
    {
        map[loc.y()][loc.x()] = convertToTile(symbol);
    }

    /**
     * @return the Tile at a given Location
     * @param x - the x coordinate of the Tile to be returned
     * @param y - the y coordinate of the Tile to be returned
     */
    public Tile getTile(int x, int y)
    {
        if(x >= mapDim || x < 0 || y >= mapDim || y < 0)
            return Tile.INVALID;
        return map[y][x];
    }

    /**
     * @return the Tile at a given Location
     * @param loc - the Location of the Tile to be returned
     */
    public Tile getTile(Location loc)
    {
        int x = loc.x();
        int y = loc.y();
        if(x >= mapDim || x < 0 || y >= mapDim || y < 0)
            return Tile.INVALID;
        return map[y][x];
    }


    /**
     * @param strings
     *            that are to be converted to a Map
     * @return the largest dimension from the given column/row sizes
     */
    public static int calculateMapDim(String... strings)
    {
        int tempDim = Math.max(strings.length - 1, strings[0].length());
        // sets tempDim to the the largest value between the array height and the first row's length
        for (int i = 1; i < strings.length; i++)
        // sets tempDim to the any row that is longer than its current value
        {
            if (strings[i].length() > tempDim)
                tempDim = strings[i].length();
        }
        return tempDim;
    }

    /**
     * Converts a character to the Tile it represents
     * @return the Tile a character represents
     * @param symbol - the character to be converted
     */
    public static Tile convertToTile(char symbol)
    {
        switch (symbol)
        {

            case 'O':
                return Tile.FLOOR;

            case 'D':
                return Tile.DOOR;

            case 'I':
                return Tile.PILLAR;

            case 'Q':
                return Tile.LILY;

            case 'W':
                return Tile.WALL;

            case '~':
                return Tile.WATER;

            default:
                return Tile.EMPTY;
        }
    }

    /**
     * Converts a Tile to a character that represents it
     * @return a character representation of a Tile
     * @param tile - the Tile to be converted
     */
    public static char convertToChar(Tile tile)
    {
        switch (tile)
        {

            case FLOOR:
                return 'O';

            case DOOR:
                return 'D';

            case PILLAR:
                return 'I';

            case LILY:
                return 'Q';

            case WALL:
                return 'W';

            case WATER:
                return '~';

            case EMPTY:
                return ' ';

            default:
                return '?';
        }
    }

    /**
     * @return the side length of the map in tiles
     */
    public int getMapDim()
    {
        return mapDim;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof Map)
        {
            Map newMap = (Map)obj;
            if(newMap.getMapDim() == getMapDim())
            {
                for(int x = 0; x < getMapDim(); x++)
                {
                    for(int y = 0; y < getMapDim(); y++)
                    {
                    if(!getTile(x, y).equals(newMap.getTile(x, y)))
                        {
                            return false;
                        }
                    }
                }
                return true;
            }

        }
        return false;
    }

    public String toString()
    {
        String temp = "";
        for(int y = mapDim - 1; y >= 0; y--)
        {
            temp += '[';
            for(int x = 0; x < mapDim; x++)
            {
                temp += convertToChar(getTile(x, y));
            }
            temp += "]\n";
        }
        return temp.substring(0, temp.length() - 1);
    }

}
