package nbg.game;

public class Match
{
    private boolean hasIA;
    private int iaLevel;
    private boolean audioEnabled;
    private Player player1;
    private Player player2;

    public Match(boolean hasIA, int iaLevel, boolean audioEnabled, Player player1, Player player2)
    {
        this.hasIA = hasIA;
        this.iaLevel = iaLevel;
        this.audioEnabled = audioEnabled;
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean hasIA()
    {
        return hasIA;
    }

    public int getIALevel()
    {
        return iaLevel;
    }

    public boolean isAudioEnabled()
    {
        return audioEnabled;
    }

    public void setAudioEnabled(boolean audioEnabled)
    {
        this.audioEnabled = audioEnabled;
    }

    public Player getPlayer1()
    {
        return player1;
    }

    public Player getPlayer2()
    {
        return player2;
    }

    public Board startBoardFor(Player player)
    {
        return null;
    }

    public Board startRandomBoardFor(Player player)
    {
        return null;
    }

    public void startBattle()
    {
    }
}
