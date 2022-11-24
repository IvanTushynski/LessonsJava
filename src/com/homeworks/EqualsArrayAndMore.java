package com.homeworks;

import java.util.Scanner;

public class EqualsArrayAndMore {
    public static void main(String[] args) {

        int[]array = new int[50];
        printArray(array);//переменная, с которой будет работать метод.

    }

    public static void printArray(int[] arr){//принимаемый параметр, не как не зависит ни от чего.
        for (int i = 0; i < arr.length / 2; i++){
            arr[i] = 5;
            System.out.print(arr[i] + " ");
        }

        for (int i = arr.length / 2; i < arr.length; i++){
            arr[i] = 10;
            System.out.print(arr[i] + " ");
        }
    }


}

class Calculator{
    public void calculatorActivate(){
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        int a, b;

        a = intScanner.nextInt();
        String operator = stringScanner.nextLine();
        b = intScanner.nextInt();

        if (operator.equals("+")) {
            System.out.println("=");
            System.out.println(a + b);
        } else if (operator.equals("-")) {
            System.out.println("=");
            System.out.println(a - b);
        } else if (operator.equals("*")) {
            System.out.println("=");
            System.out.println(a * b);
        } else if (operator.equals("/")) {
            System.out.println("=");
            System.out.println(a / b);
        } else if (operator.equals("%")) {
            System.out.println("=");
            System.out.println((a / 100) * b);
        }
    }
}
