package nbg.base;

import java.util.ArrayList;

public abstract class Unit
{
    /**
     * Unit initial abscissa.
     */
    private int x0;

    /**
     * Unit initial ordinate.
     */
    private int y0;

    /**
     * Unit initial abscissa.
     */
    private int x1;

    /**
     * Unit initial ordinate.
     */
    private int y1;

    /**
     * This is a list that each Unit can use to say what points it occupies in the board.
     */
    protected ArrayList<int[]> points;

    protected Unit(int x0, int y0, int x1, int y1, ArrayList<int[]> points)
    {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.points = points;
    }

    public Unit(int x0, int y0, int x1, int y1)
    {
        this(x0, y0, x1, y1, new ArrayList<>());
    }

    /**
     * This constructor will create an Unit with same initial and final point.
     *
     * @param x0 Unit abscissa.
     * @param y0 Unit ordinate.
     */
    public Unit(int x0, int y0)
    {
        this(x0, y0, x0, y0);
    }

    public int getX0()
    {
        return x0;
    }

    public void setX0(int x0)
    {
        this.x0 = x0;
    }

    public int getY0()
    {
        return y0;
    }

    public void setY0(int y0)
    {
        this.y0 = y0;
    }

    public int getX1()
    {
        return x1;
    }

    public void setX1(int x1)
    {
        this.x1 = x1;
    }

    public int getY1()
    {
        return y1;
    }

    public void setY1(int y1)
    {
        this.y1 = y1;
    }

    /**
     * Generate a list will all points this unit occupies in the board.
     *
     * @return a list will all points this unit occupies in the board.
     */
    public abstract ArrayList<int[]> getPoints();

    protected void setPoints(ArrayList<int[]> points)
    {
        this.points = points;
    }

    /**
     * Checks if this Unit has common points with the received one.
     *
     * @param unit Unit to check collision with.
     *
     * @return {@code true} if the units collide. {@code false} otherwise.
     */
    public abstract boolean collidesWith(Unit unit);
}
