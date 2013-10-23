package cs2114.tiletraveler;

import sofia.app.ShapeScreen;
import android.widget.TextView;
import sofia.graphics.RectangleShape;
import sofia.graphics.Color;

// -------------------------------------------------------------------------
/**
 *  Screen class to set up the tile traveler game screen
 *
 *  @author Luciano Biondi (lbiondi)
 *  @author Jacob Stenzel (sjacob95)
 *  @version 2013.10.22
 */
public class TileTravelerScreen
    extends ShapeScreen
{
    private float tileSize;
    private TextView status;
    private Map active;
    private static final int SCREENDIM = 5;   //tile size of one side in a single view

    /**
     * the map location currently at the bottom left of the screen
     */
    private Location origin = new Location(0, 0);

    public void initialize()
    {
        getCoordinateSystem().flipY();
        tileSize = Math.min(getWidth(), getHeight()) / SCREENDIM;
        active = new Stage1();
        drawScreen();
    }

    public void drawScreen()
    {
        clear();
        RectangleShape background =
            new RectangleShape(0, 0, getWidth(), getHeight());
        background.setFillColor(Color.black);
        add(background);
        for (int y = origin.y(); y - origin.y() < SCREENDIM; y++)
        {
            for (int x = origin.x(); x - origin.x() < SCREENDIM; x++)
            {
                drawTile(x, y);
            }
        }
    }

    public void drawTile(int x, int y)
    {
        Tile tile = active.getTile(x, y);
        switch(tile)
        {
            case DOOR:
                add(new Door(x - origin.x(), y - origin.y(), tileSize));
                break;

            case FLOOR:
                add(new Floor(x - origin.x(), y - origin.y(), tileSize));
                break;

            case LILY:
                add(new Lily(x - origin.x(), y - origin.y(), tileSize));
                break;

            case PILLAR:
                add(new Pillar(x - origin.x(), y - origin.y(), tileSize));
                break;

            case WALL:
                add(new Door(x - origin.x(), y - origin.y(), tileSize));
                break;

            case WATER:
                add(new Door(x - origin.x(), y - origin.y(), tileSize));
                break;
        }
    }

    public float getTileSize()
    {
        return tileSize;
    }
}
