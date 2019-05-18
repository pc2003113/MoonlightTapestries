package com.launchcode;

import com.launchcode.pattern.*;

import java.lang.invoke.SwitchPoint;

public class PatternActionLogic {

   public void patternBand(int userChoice){

       Pattern p=null;

       switch (userChoice){
           case 1:
               p=new CrossStitchWigglePattern();
               break;
           case 2:
               p=new ZigZagLinesPattern();
               break;
           case 3:
               p=new BaublePattern();
               break;
           case 4:
               p=new BlockyBaublePattern();
               break;
           default:
               System.out.println("invalid choice");
               break;
       }

       printBand(p);


   }

    public void printBand(Pattern p) {
        for(int m=1;m<=3;m++){
            for(int n=1;n<=8;n++){
                p.pattern();

            }
            System.out.println("");
        }

        System.out.println("\n");

        for(int m=1;m<=8;m++){
            for(int n=1;n<=6;n++){
                p.pattern();

            }
            System.out.println("");
        }
    }


}
