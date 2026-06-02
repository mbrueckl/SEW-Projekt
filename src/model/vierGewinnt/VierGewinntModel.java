package model.vierGewinnt;

public class VierGewinntModel {
    int[][] feld = new int[6][7];
    int globalcounter;
    /*
[0][0] [0][1] [0][2] [0][3] [0][4] [0][5] [0][6]
[1][0] [1][1] [1][2] [1][3] [1][4] [1][5] [1][6]
[2][0] [2][1] [2][2] [2][3] [2][4] [2][5] [2][6]
[3][0] [3][1] [3][2] [3][3] [3][4] [3][5] [3][6]
[4][0] [4][1] [4][2] [4][3] [4][4] [4][5] [4][6]
[5][0] [5][1] [5][2] [5][3] [5][4] [5][5] [5][6]
    */

    public void spielen(int counter, int userRow){
        //WICHTIG: Counter im Controller auf 5 und UserRow user input usen

        //leeres Feld = 0
        //Player 1 = 1
        //Player 2 = 2
        if (feld[0][userRow - 1] != 0){
            System.out.println("Diese Row ist voll");
            globalcounter--;
        }
        else if (feld[counter][userRow - 1] == 0){
            if (globalcounter % 2 == 0){
                feld[counter][userRow - 1] = 1;
            } else if (globalcounter % 2 > 0) {
                feld[counter][userRow - 1] = 2;
            }else {
                spielen(counter - 1, userRow);
            }
        }
        globalcounter++;
        if (globalcounter >= 8){

        }
    }

}
