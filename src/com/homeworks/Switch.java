package com.homeworks;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        /*System.out.println("Угадай цифру:");
        int age = sca.nextInt();
        switch (age) {
            case 0 :
                System.out.println("Угадана Цифра 0");
                break;
            case  7 :
                System.out.println("Угадана Цифра 7");
                break;
            case  18 :
                System.out.println("Угадана Цифра 18");
                break;
            default: System.out.println("Это не та цифра");
        }*/

        System.out.println("What is Milk?");
        String milk = sca.nextLine();
        switch (milk) {
            case "Cow" :
                System.out.println("Cow Milk");
                break;
            case "goat" :
                System.out.println("Goat Milk");
                break;
            default:
                System.out.println("Another Milk");
        }

    }
}
