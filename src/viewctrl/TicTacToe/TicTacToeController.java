package viewctrl.TicTacToe;

import model.CollectionHandling;
import model.TicTacToe.TicTacToeModel;

public class TicTacToeController {
    private TicTacToeModel model;
    private CollectionHandling collectionHandling;
    private char currentPlayer;

    public TicTacToeController() {
        model = new TicTacToeModel();
        collectionHandling = new CollectionHandling();
        currentPlayer = 'O';
    }

    public void inputField(int row, int section){
        if (model.fieldPlace(row, section, currentPlayer)){
            switchPlayer();
        }
    }

    public void outputFields(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(model.getBoard()[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void switchPlayer(){
        if (currentPlayer == 'O'){
            currentPlayer = 'X';
        }else {
            currentPlayer = 'O';
        }
    }



}
