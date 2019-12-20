package nbg.game;

import nbg.base.Unit;
import nbg.drawings.BoardDrawable;
import nbg.drawings.Layer;

import java.util.ArrayList;

public class Board
{
    public static final int DEFAULT_NUM_LINES = 10;
    public static final int DEFAULT_NUM_COLUMNS = 10;

    private int numLines;
    private int numColumns;
    private ArrayList<Unit> units;
    private ArrayList<Layer<Character>> contentLayers;
    private ArrayList<Layer<BoardDrawable>> drawableLayers;

    public Board(int numLines, int numColumns, ArrayList<Unit> units)
    {
        this.numLines = numLines;
        this.numColumns = numColumns;
        this.units = units;
        this.contentLayers = new ArrayList<>();
        this.drawableLayers = new ArrayList<>();

        units.forEach(this::addUnit);
    }

    /**
     * Starts the board with {@link #DEFAULT_NUM_LINES} and {@link #DEFAULT_NUM_COLUMNS}.
     *
     * @param units Units in the board.
     */
    public Board(ArrayList<Unit> units)
    {
        this(DEFAULT_NUM_LINES, DEFAULT_NUM_COLUMNS, units);
    }

    public Board()
    {
        this(new ArrayList<>());
    }

    public int getNumLines()
    {
        return numLines;
    }

    public int getNumColumns()
    {
        return numColumns;
    }

    public ArrayList<Unit> getUnits()
    {
        return units;
    }

    public String addUnit(Unit unit)
    {
        return null;
    }

    public void addDrawable(BoardDrawable drawable, int layer, int x, int y)
    {
    }

    public void addDrawableUnit(Unit unit, int layer, int x, int y)
    {
    }

    public BoardDrawable removeDrawable(int layer, int x, int y)
    {
        return null;
    }

    public boolean isWithinLimits(Unit unit)
    {
        return false;
    }

    public boolean collidesWithSomeone(Unit unit)
    {
        return false;
    }
}
