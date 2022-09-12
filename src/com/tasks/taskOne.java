package com.tasks;

import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.println("Введите сумму:");
        int cred = 20000;

        System.out.println("Введите процент:");
        int percent = scan.nextInt();

        for (int i = 1; i < 7; i++) {

            cred = cred - (cred/100*percent);
            int credTwo = percent - cred;
            System.out.println(credTwo + " " + cred);
            //System.out.println("График платежей:" + "\nМесяц " + i + "\nОстаток:" + cred + "\nПроцент:" + percent + "%" + "\n------------");
        }
    }
}