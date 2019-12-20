package nbg.base;

import java.util.ArrayList;

public class Ship extends LineUnit
{
    // Probably this will not be used
    public static final String AIRCRAFT_CARRIER = "Aircraft Carrier";
    public static final String TANKER = "Tanker";
    public static final String DESTROYER = "Destroyer";
    public static final String SUBMARINE = "Submarine";
    public static final String FLOATER = "Floater";

    private String type;

    public Ship(int x0, int y0, int x1, int y1, String direction, String type)
    {
        super(x0, y0, x1, y1, direction);
        this.type = type;
    }

    /**
     * This constructor will create an Unit with same initial and final point.
     *
     * @param x0 Unit abscissa.
     * @param y0 Unit ordinate.
     */
    public Ship(int x0, int y0, String direction, String type)
    {
        super(x0, y0, direction);
        this.type = type;
    }

    /**
     * This constructor will create an Unit with same initial and final point.
     * Also, the direction of this Unit will be UP.
     *
     * @param x0 Unit abscissa.
     * @param y0 Unit ordinate.
     */
    public Ship(int x0, int y0, String type)
    {
        super(x0, y0);
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    /**
     * Return the size of a Ship with the specified type.
     *
     * @param type Ship type.
     *
     * @return the size of a Ship with the specified type.
     */
    public static int getSize(String type)
    {
        int size = -1;

        switch (type)
        {
            case AIRCRAFT_CARRIER:  size = 5;   break;
            case TANKER:            size = 4;   break;
            case DESTROYER:         size = 3;   break;
            case SUBMARINE:         size = 2;   break;
            case FLOATER:           size = 1;   break;
        }

        return size;
    }

    @Override
    public ArrayList<int[]> getPoints()
    {
        return null;
    }

    @Override
    public boolean collidesWith(Unit unit)
    {
        return false;
    }
}
