package com.homeworks;

import java.io.InputStream;
import java.util.Scanner;

public class Scan {
    public Scan(InputStream in) {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ввести номер:");
        int sEnter = s.nextInt();
        if (sEnter <= 20) {
            System.out.println("Вы ввели число: " + sEnter + "." + " " +"У вас менее 20р");
        } else if (sEnter >= 20 && sEnter < 40){
            System.out.println("Вы ввели число: " + sEnter + "."  + " " + "У вас более 20р, но менее 40р");
        }else {
            System.out.println("Вы ввели число: " + sEnter + "."  + " " + "У вас более 40р, либо 40р");
        }
    }
}
