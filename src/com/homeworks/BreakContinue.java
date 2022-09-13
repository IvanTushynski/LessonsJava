package com.homeworks;

public class BreakContinue {
    public static void main(String[] args) {
        int a = 0;
        while (true) {
            if (a == 20){
                break;
            }
            System.out.println(a);
            a++;
        }
        System.out.println("Цикл окончен");

        for (int i = 0; i <= 20; i++) {
            if (i%2 == 0) {
                continue;
            }
            System.out.println("Нечетное число" + " " + i);
        }
    }
}
