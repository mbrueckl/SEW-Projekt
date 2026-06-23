package model.schereSteinPapier;

import java.util.Random;

public class STPModel {

    public STPModel() {

    }
    private Random rd = new Random();
    private int botChoice;

    public int ergebnis(int userinput){
        //1 = Schere
        //2 = Stein
        //3 = Papier
        botChoice = rd.nextInt(3)+1;

        //Unentschieden = 0
        //Verloren = -1
        //Gewonnen = 1
        //ERROR = 67
        if (userinput == botChoice){
            //System.out.println("Unentschieden!");
            return 0;
        }
        else if (userinput == 1) {
            if (botChoice == 2){
                //System.out.println("Du hast Verloren?");
                return -1;
            } else if (botChoice == 3) {
                //System.out.println("Du hast Gewonnen!");
                return 1;
            }
        }
        else if (userinput == 2) {
            if (botChoice == 1){
                //System.out.println("Du hast Gewonnen!");
                return 1;
            }else if (botChoice == 3) {
                //System.out.println("Du hast Verloren?");
                return -1;
            }
        }
        else if (userinput == 3) {
            if (botChoice == 1){
                //System.out.println("Du hast Verloren?");
                return -1;
            }else if (botChoice == 2) {
                //System.out.println("Du hast Gewonnen!");
                return 1;
            }
        }
        return 67;
    }

    public int getBotChoice() {
        return botChoice;
    }
}
