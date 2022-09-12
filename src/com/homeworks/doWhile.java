package com.homeworks;

//что бы не было дублирования кода как в примере ниже

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        //System.out.println("Введите номер телефона: +37525");
       //int value = sca.nextInt();
        //while (value != 9228380){
        //    value = sca.nextInt();
        //    System.out.println("Введите номер телефона: +37525");
        //}
        //System.out.println("Вы ввели свой номер телефона!!!");
        int value;
        do {
            System.out.println("Введите номер телефона: +37525");
            value = sca.nextInt();
        }while (value != 9228380);
        System.out.println("Вы ввели свой номер телефона!!!");
    }
}
