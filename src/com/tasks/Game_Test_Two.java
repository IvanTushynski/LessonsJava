package com.tasks;

import java.util.Scanner;

public class Game_Test_Two {
    public static void main(String[] args) {
        int playerAttack = 2;
        int playerDefence = 1;
        int playerStatesAtt = 0;
        int playerStatesWithSwordOne;
        int playerStatesDef = 0;
        int calculatorCirclelevel = 1;

        while (calculatorCirclelevel > 0){
            Scanner scanLevel = new Scanner(System.in);
            System.out.println("Enter First Number\n");
            int playerLevel = scanLevel.nextInt();
            System.out.println("First Number is:" + playerLevel +"\n----------");

            System.out.println("Enter Second Number\n");
            int playerLevel2 = scanLevel.nextInt();
            System.out.println("Second Number is:" + playerLevel2 +"\n----------");

            System.out.println("Enter Plus\n");
            String playerLevel3 = scanLevel.nextLine();
            System.out.println(playerLevel3 +"\n----------");

            System.out.println("Enter Plus\n");
            String playerLevel4 = scanLevel.nextLine();
            System.out.println(playerLevel4 +"\n----------");

            calculatorCirclelevel++;
        }
    }
}
