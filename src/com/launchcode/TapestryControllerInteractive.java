package com.launchcode;

import com.launchcode.pattern.*;

import java.util.Scanner;

public class TapestryControllerInteractive {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Tapestry Controller");
        System.out.println(" Please choose a number to select the patten from the following list \n" +
                "1. Cross Stitch Wiggle Pattern\n" +
                "2. Zig Zag Lines Pattern \n" +
                "3. Bauble Pattern\n" +
                "4. Blocky Bauble Pattern\n");

        int userChoice = keyboard.nextInt();

        PatternActionLogic patternActionLogic= new PatternActionLogic();
        patternActionLogic.patternBand(userChoice);




    }
}
