package model.vierGewinnt;

public class VierGewinntModel {

    int[][] feld = new int[6][7];

    int globalcounter;
    int aktuellerSpieler = 1;

    /*
    0 = leer
    1 = Spieler 1
    2 = Spieler 2
    */

    public void spielen(int counter, int userRow) {

        if (feld[0][userRow - 1] != 0) {
            System.out.println("Diese Spalte ist voll");
            return;
        }

        if (feld[counter][userRow - 1] == 0) {

            feld[counter][userRow - 1] = aktuellerSpieler;
            globalcounter++;

            if (vertikal(aktuellerSpieler)
                    || horizontal(aktuellerSpieler)
                    || diagonal(aktuellerSpieler)) {

                System.out.println("Spieler "
                        + aktuellerSpieler
                        + " gewinnt!");
            }
            else {
                switchPlayer();
            }

            return;
        }

        spielen(counter - 1, userRow);
    }


    public boolean vertikal(int spieler) {

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 7; col++) {

                if (feld[row][col] == spieler
                        && feld[row + 1][col] == spieler
                        && feld[row + 2][col] == spieler
                        && feld[row + 3][col] == spieler) {

                    return true;
                }
            }
        }

        return false;
    }
    public boolean horizontal(int spieler) {

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 4; col++) {

                if (feld[row][col] == spieler
                        && feld[row][col + 1] == spieler
                        && feld[row][col + 2] == spieler
                        && feld[row][col + 3] == spieler) {

                    return true;
                }
            }
        }

        return false;
    }
    public boolean diagonal(int spieler) {

        // links oben -> rechts unten
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {

                if (feld[row][col] == spieler
                        && feld[row + 1][col + 1] == spieler
                        && feld[row + 2][col + 2] == spieler
                        && feld[row + 3][col + 3] == spieler) {

                    return true;
                }
            }
        }
        // links unten -> rechts oben
        for (int row = 3; row < 6; row++) {
            for (int col = 0; col < 4; col++) {

                if (feld[row][col] == spieler
                        && feld[row - 1][col + 1] == spieler
                        && feld[row - 2][col + 2] == spieler
                        && feld[row - 3][col + 3] == spieler) {

                    return true;
                }
            }
        }

        return false;
    }


    public void switchPlayer() {

        if (aktuellerSpieler == 1) {
            aktuellerSpieler = 2;
        } else {
            aktuellerSpieler = 1;
        }

    }
}