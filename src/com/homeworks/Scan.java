package com.homeworks;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ввести номер:");
        int sEnter = s.nextInt();
        if (sEnter <= 20) {
            System.out.println("У вас менее 20р");
        } else if (sEnter >= 20 && sEnter < 40){
            System.out.println("У вас более 20р, но менее 40р");
        }else {
            System.out.println("У вас более 40р, либо 40р");
        }
    }
}
