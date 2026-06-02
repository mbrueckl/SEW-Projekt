package model.SchereSteinPapier;

import java.util.Random;

public class STPModel {
    Random rd = new Random();

    public void ergebnis(int userinput){
        //1 = Schere
        //2 = Stein
        //3 = Papier
        int r = rd.nextInt(3)+1;

        if (userinput == r){
            System.out.println("Unentschieden!");
        } else if (userinput == 1) {
            if (r == 2){
                System.out.println("Du hast Verloren?");
            } else if (r == 3) {
                System.out.println("Du hast Gewonnen!");
            }

        }else if (userinput == 2) {
            if (r == 1){
                System.out.println("Du hast Gewonnen!");
            }else if (r == 3) {
                System.out.println("Du hast Verloren?");

        }
        }else if (userinput == 3) {
            if (r == 1){
                System.out.println("Du hast Verloren?");
            }else if (r == 2) {
                System.out.println("Du hast Verloren?");
            }
        }
    }
}
