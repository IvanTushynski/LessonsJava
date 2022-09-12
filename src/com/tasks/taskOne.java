package com.tasks;

import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите сумму:");
        int cred = scan.nextInt();

        System.out.println("Введите процент:");
        int percent = scan.nextInt();

        for (int i = 1; i < 7; i++) {

            cred -=(cred/100*percent);
            System.out.println("График платежей:" + "\nМесяц " + i + "\nОстаток:" + cred + "\nПроцент:" + percent + "%" + "\n------------");
        }
    }
}