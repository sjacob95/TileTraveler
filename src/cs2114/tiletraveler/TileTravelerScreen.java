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
 *  @version 2013.10.21
 */
public class TileTravelerScreen
    extends ShapeScreen
{
    private float tileSize;
    private TextView status;
    private RectangleShape[][] map;

    public void initialize()
    {
        tileSize = Math.min(getWidth(), getHeight()) / 5;
        map = (new Map(tileSize)).get();
        RectangleShape background =
            new RectangleShape(0, 0, getWidth(), getHeight());
        background.setFillColor(Color.black);
        for (int r = 0; r < 5; r++)
        {
            for (int c = 0; c < 5; c++)
            {
                add(map[r][c]);
            }
        }
    }
}
