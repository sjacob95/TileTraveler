package cs2114.tiletraveler;

// -------------------------------------------------------------------------
/**
 * A Stage that contains a Map, an array of Entities, and a starting Location
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public class Stage
{

    private Map       map;
    private EntityMap entityMap;
    private Location startLoc;


    // ----------------------------------------------------------
    /**
     * Create a new Stage object.
     *
     * @param map
     *            - the map for the stage to contain
     * @param startLoc - the Location at which the player starts
     *
     */
    public Stage(Map map, Location startLoc)
    {
        this.map = map;
        entityMap = new EntityMap(map.getMapDim());
        this.startLoc = startLoc;
    }


    /**
     * @return the Map
     */
    public Map getMap()
    {
        return map;
    }


    /**
     * Sets the map to a new value
     *
     * @param map
     *            - the Map
     */
    public void setMap(Map map)
    {
        this.map = map;
    }

    /**
     * @return the EntityMap
     */
    public EntityMap getEntityMap()
    {
        return entityMap;
    }

    /**
     * @return the Player's starting Location
     */
    public Location getStartLoc()
    {
        return startLoc;
    }
}
