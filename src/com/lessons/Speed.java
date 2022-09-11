package com.lessons;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        int maxSpeed = 30; //km/h
        int SpeedGrade = 20; //km/h
        int PricePerGrade = 500; //RUB
        int criminalSpeed = 180; // km/h
        //------------------------------

        System.out.print("Ввести скорость автомобиля: ");

        //Ввод данных в консоли
        Scanner scan = new Scanner(System.in);
        int oncomingSpeed = scan.nextInt();
        System.out.println("Скорость автомобиля:" + oncomingSpeed + "км/ч");
        
        //манипуляции в зависимости от скорости
        if (oncomingSpeed >= criminalSpeed) {
            System.out.println("Лишение прав!");
        } else if (oncomingSpeed > maxSpeed) {
            int overSpeed = oncomingSpeed - maxSpeed;
            int gradesCount = overSpeed / SpeedGrade;
            int fine = PricePerGrade * gradesCount;
            System.out.println("Превышение на:" + overSpeed + "км/ч");
            System.out.println("Сумма штрафа:" + fine + "Руб.");
        } else {
            System.out.println("Превышение отсутствует...");
        }


    }
}
