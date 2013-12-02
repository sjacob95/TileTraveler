package cs2114.tiletraveler;

/**
 * // -------------------------------------------------------------------------
/**
 *  A logic map filled with Enemies
 *
 * @author Luciano Biondi (lbiondi)
 * @author Ezra Richards  (MrZchuck)
 * @author Jacob Stenzel  (sjacob95)
 * @version 2013.12.08
 */
public class EnemyMap
{
    private Enemy[][] enemyMap;
    private int      mapDim;


    /**
     * Create a new Map object which represents a map using tiles
     *
     * @param mapDim - the desired dimensions of the Map
     */
    public EnemyMap(int mapDim)
    {
        enemyMap = new Enemy[mapDim][mapDim];
        this.mapDim = mapDim;
    }


    /**
     * Gets the 2d array that represents map
     *
     * @return Enemy[][] that represents map
     */
    public Enemy[][] get()
    {
        return enemyMap;
    }

    /**
     * Adds an enemy (Overwrites preexisting Enemies)
     * @param enemy - the desired enemy
     */
    public void addEnemy(Enemy enemy)
    {
        enemyMap[enemy.getLocation().y()][enemy.getLocation().x()] = enemy;
    }

    /**
     * @return the Enemy at a given Location
     * @param x - the x coordinate of the Enemy to be returned
     * @param y - the y coordinate of the Enemy to be returned
     */
    public Enemy getEnemy(int x, int y)
    {
        if(x >= mapDim || x < 0 || y >= mapDim || y < 0)
            return null;
        return enemyMap[y][x];
    }

    /**
     * @return the Enemy at a given Location
     * @param loc - the Location of the Enemy to be returned
     */
    public Enemy getEnemy(Location loc)
    {
        int x = loc.x();
        int y = loc.y();
        if(x >= mapDim || x < 0 || y >= mapDim || y < 0)
            return null;
        return enemyMap[y][x];
    }

    /**
     * @return the side length of the map in tiles
     */
    public int getMapDim()
    {
        return mapDim;
    }
}
