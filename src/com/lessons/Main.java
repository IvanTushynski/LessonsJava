package com.lessons;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        //int num2[] = new int[10];
        //int num3[] = new int[10];
        for( int hui = 0; hui < num.length; hui++) {
            num[2] = 13;
            System.out.print(num[hui] + " ");
        }

        int i = 100;
        while (i <= 200) {
            System.out.println("Обратный отсчет " + i);
            i += 10;
        }
        int i2 = Arrays.stream(num).sum();
        while (i2 <= 200) {
            System.out.println("Обратный отсчет " + i);
            i += 10;
        }
    }
}