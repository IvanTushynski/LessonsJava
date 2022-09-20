package com.tasks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int calculatorCircleLevel = 1;

        while (calculatorCircleLevel > 0){
            Scanner scanLevel = new Scanner(System.in);
            System.out.println("Enter First Number\n");
            int playerLevel = scanLevel.nextInt();
            System.out.println("First Number is:" + playerLevel +"\n-----------------");

            System.out.println("Enter Second Number\n");
            int playerLevel2 = scanLevel.nextInt();
            System.out.println("Second Number is:" + playerLevel2 +"\n-----------------");
            scanLevel.nextLine();//что бы не проскакивал сканнер строки

            System.out.println("Enter Variable\n");
            String playerLevel3 = scanLevel.nextLine();
            System.out.println(playerLevel3 +"\n-----------------");

            if (playerLevel3.equals("+")){
                System.out.println("Answer:" + "[" + ((float)playerLevel + (float)playerLevel2) + "]");
                System.out.println("\n-----------------");
            } else if (playerLevel3.equals("-")) {
                System.out.println("Answer:" + "[" + ((float)playerLevel - (float)playerLevel2) + "]");
                System.out.println("\n-----------------");
            } else if (playerLevel3.equals("/")) {
                System.out.println("Answer:" + "[" + ((float)playerLevel / (float)playerLevel2) + "]");
                System.out.println("\n-----------------");
            } else if (playerLevel3.equals("*")) {
                System.out.println("Answer:" + "[" + ((float) playerLevel * (float)playerLevel2) + "]");
                System.out.println("\n-----------------");
            } else if (playerLevel3.equals("%")) {
                System.out.println("Answer:" + "[" + (((float)playerLevel / 100)*(float)playerLevel2) + "]");
            } else {
                System.out.println("Unknown Variable!!!");
            }

            calculatorCircleLevel++;
        }
    }
}
