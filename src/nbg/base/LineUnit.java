package nbg.base;

import java.util.ArrayList;

public abstract class LineUnit extends Unit
{
    /**
     * Direction to where the LineUnit points.
     *
     * @see Direction
     */
    private String direction;

    protected LineUnit(int x0, int y0, int x1, int y1, ArrayList<int[]> points, String direction)
    {
        super(x0, y0, x1, y1, points);
        this.direction = direction;
    }

    public LineUnit(int x0, int y0, int x1, int y1, String direction)
    {
        super(x0, y0, x1, y1);
        this.direction = direction;
    }

    /**
     * This constructor will create an Unit with same initial and final point.
     *
     * @param x0 Unit abscissa.
     * @param y0 Unit ordinate.
     */
    public LineUnit(int x0, int y0, String direction)
    {
        super(x0, y0);
        this.direction = direction;
    }

    /**
     * This constructor will create an Unit with same initial and final point.
     * Also, the direction of this Unit will be UP.
     *
     * @param x0 Unit abscissa.
     * @param y0 Unit ordinate.
     */
    public LineUnit(int x0, int y0)
    {
        super(x0, y0);
        this.direction = Direction.UP;
    }

    public String getDirection()
    {
        return direction;
    }

    public void setDirection(String direction)
    {
        this.direction = direction;
    }
}
