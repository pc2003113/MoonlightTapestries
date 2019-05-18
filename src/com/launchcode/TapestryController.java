package com.launchcode;

import com.launchcode.pattern.*;

import java.util.ArrayList;

public class TapestryController {

    public static void main(String args[]){
        ArrayList<Pattern> patterns = new ArrayList();
        //patterns.add(new CrossStitchWigglePattern());
        Pattern p1= new CrossStitchWigglePattern();
        Pattern p2= new ZigZagLinesPattern();
        Pattern p3= new BaublePattern();
        Pattern p4= new BlockyBaublePattern();
        patterns.add(p1);
        patterns.add(p2);
        patterns.add(p3);
        patterns.add(p4);

        for (int j=0; j<patterns.size();j++){
            Pattern p= patterns.get(j);
            PatternActionLogic patternActionLogic= new PatternActionLogic();
            patternActionLogic.printBand(p);
            System.out.println("");
        }


    }
    /*public static void printBand(Pattern p) {
        for(int m=1;m<=3;m++){
            for(int n=1;n<=8;n++){
                p.pattern();

            }
            System.out.println("");
        }

        System.out.println("\n\n\n");

        for(int m=1;m<=8;m++){
            for(int n=1;n<=6;n++){
                p.pattern();

            }
            System.out.println("");
        }
    }*/





}
