package main;

import model.CollectionHandling;
import viewctrl.TicTacToe.TicTacToeController;

public class main {
    public static void main(String[] args) {
        TicTacToeController ticTacToeController = new TicTacToeController();

        System.out.println("JETZT PLAYER O");
        ticTacToeController.inputField(2, 2);
        System.out.println("JETZT PLAYER X");
        ticTacToeController.inputField(0, 2);
        System.out.println("JETZT PLAYER O");
        ticTacToeController.inputField(0, 2);
        ticTacToeController.inputField(2, 1);
        System.out.println("JETZT PLAYER X");
        ticTacToeController.inputField(1, 2);

        ticTacToeController.outputFields();
    }
}
