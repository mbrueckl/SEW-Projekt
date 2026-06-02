package model.SchereSteinPapier;

import java.util.Random;

public class STPModel {
    Random rd = new Random();

    public int ergebnis(int userinput){
        //1 = Schere
        //2 = Stein
        //3 = Papier
        int r = rd.nextInt(3)+1;

        //Unentschieden = 0
        //Verloren = -1
        //Gewonnwn = 1
        //ERROR = 67
        if (userinput == r){
            System.out.println("Unentschieden!");
            return 0;
        }
        else if (userinput == 1) {
            if (r == 2){
                System.out.println("Du hast Verloren?");
                return -1;
            } else if (r == 3) {
                System.out.println("Du hast Gewonnen!");
                return 1;
            }
        }
        else if (userinput == 2) {
            if (r == 1){
                System.out.println("Du hast Gewonnen!");
                return 1;
            }else if (r == 3) {
                System.out.println("Du hast Verloren?");
                return -1;
            }
        }
        else if (userinput == 3) {
            if (r == 1){
                System.out.println("Du hast Verloren?");
                return -1;
            }else if (r == 2) {
                System.out.println("Du hast Gewonnen!");
                return 1;
            }
        }
        return 67;
    }
}
