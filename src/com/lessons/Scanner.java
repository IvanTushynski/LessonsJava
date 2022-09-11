package com.lessons;

public class Scanner {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int number = scan.nextInt();
        if (number < 10) {
        System.out.println ("Вы ввели число " + number);
        } else {
            System.out.println("Число не должно превышить 10!");
        }
    }

}
