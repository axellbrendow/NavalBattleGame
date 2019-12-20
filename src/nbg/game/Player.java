package nbg.game;

public class Player
{
    private String name;
    private Board board;

    public Player(String name, Board board)
    {
        this.name = name;
        this.board = board;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Board getBoard()
    {
        return board;
    }

    public void setBoard(Board board)
    {
        this.board = board;
    }
}
