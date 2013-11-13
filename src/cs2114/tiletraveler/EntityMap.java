package cs2114.tiletraveler;

/**
 * // -------------------------------------------------------------------------
/**
 *  Creates a logic map filled with Entities
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public class EntityMap
{
    private Entity[][] entityMap;
    private int      mapDim;


    /**
     * Create a new Map object which represents a map using tiles
     *
     * @param mapDim - the desired dimensions of the Map
     */
    public EntityMap(int mapDim)
    {
        entityMap = new Entity[mapDim][mapDim];
        this.mapDim = mapDim;
    }


    /**
     * Gets the 2d array that represents map
     *
     * @return Tile[][] that represents map
     */
    public Entity[][] get()
    {
        return entityMap;
    }

    /**
     * sets the Tile at a Location to the Tile specified
     * @param loc - the Location to be set
     * @param entity - the desired entity
     */
    public void setEntity(Location loc, Entity entity)
    {
        entityMap[loc.y()][loc.x()] = entity;
    }

    /**
     * sets the Entity at a Location to the Entity specified
     * @param x - the the x coordinate of the Location to be set
     * @param y - the the y coordinate of the Location to be set
     * @param entity - the desired entity
     */
    public void setEntity(int x, int y, Entity entity)
    {
        entityMap[y][x] = entity;
    }

    /**
     * @return the Entity at a given Location
     * @param x - the x coordinate of the Entity to be returned
     * @param y - the y coordinate of the Entity to be returned
     */
    public Entity getEntity(int x, int y)
    {
        if(x >= mapDim || x < 0 || y >= mapDim || y < 0)
            return null;
        return entityMap[y][x];
    }

    /**
     * @return the Entity at a given Location
     * @param loc - the Location of the Entity to be returned
     */
    public Entity getEntity(Location loc)
    {
        int x = loc.x();
        int y = loc.y();
        if(x >= mapDim || x < 0 || y >= mapDim || y < 0)
            return null;
        return entityMap[y][x];
    }

    /**
     * @return the side length of the map in tiles
     */
    public int getMapDim()
    {
        return mapDim;
    }
}
