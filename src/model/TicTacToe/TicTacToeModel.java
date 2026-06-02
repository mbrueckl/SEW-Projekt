package model.TicTacToe;
import java.util.HashMap;

public class TicTacToeModel {
    private final char[][] board = new char[3][3];

    public TicTacToeModel() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public boolean fieldPlace(int row, int section, char player){
        if (board[row][section] != '-'){
            return false;
        }

        board[row][section] = player;
        return true;
    }

    public boolean isWin(){
        return false;
    }


    public char[][] getBoard() {
        return board;
    }
}
