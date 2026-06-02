package model.TicTacToe;

public class TicTacToePlayer {
    private String Player;
    private int field;

    public TicTacToePlayer(String player, int field) {
        Player = player;
        this.field = field;
    }

    public String getPlayer() {
        return Player;
    }
}
