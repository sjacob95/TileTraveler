package cs2114.tiletraveler;

// -------------------------------------------------------------------------
/**
 * A Stage that contains a Map, an array of Entities, and a starting Location
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards (MrZchuck)
 * @author Jacob Stenzel (sjacob95)
 * @version 2013.12.08
 */
public abstract class Stage
{

    private Map      map;
    private Location startLoc;
    private EnemyMap enemyMap;


    // ----------------------------------------------------------
    /**
     * Create a new Stage object.
     *
     * @param map
     *            - the map for the stage to contain
     * @param startLoc
     *            - the Location at which the player starts
     */
    public Stage(Map map, Location startLoc)
    {
        this.map = map;
        this.startLoc = startLoc;
        this.enemyMap = new EnemyMap(map.getMapDim());
    }


    // ----------------------------------------------------------
    /**
     * @param tileSize
     *            The size of a Tile in pixels
     * @return The reset Stage
     */
    public abstract Stage reset(float tileSize);


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
     * @return the EnemyMap
     */
    public EnemyMap getEnemyMap()
    {
        return enemyMap;
    }


    // ----------------------------------------------------------
    /**
     * Changes the EnemyMap to the provided EnemyMap
     *
     * @param enMap
     *            The EnemyMap to be used
     */
    public void setEnemyMap(EnemyMap enMap)
    {
        enemyMap = enMap;
    }


    /**
     * @return the Player's starting Location
     */
    public Location getStartLoc()
    {
        return startLoc;
    }

}
