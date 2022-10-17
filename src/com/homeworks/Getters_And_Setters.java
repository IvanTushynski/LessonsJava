package com.homeworks;

import java.util.Scanner;

public class Getters_And_Setters {
    public static void main(String[] args) {
        Cars cars = new Cars();
        Scanner scanner = new Scanner(System.in);
        int nameCar = scanner.nextInt();
        if (nameCar == 1){
            cars.setName(1);
        } else if (nameCar == 2) {
            cars.setName(2);
        }else {
            System.out.println("Wrong Name!!!");
        }
    }
}

class Cars {
    private int name;
    private int price;
    private float weight;
    private short mileage;

    public void setName(int name) {
        if (name <= 1) {
            this.name = name;
            System.out.println(name);
        } else {
            System.out.println("Name Very Long!");
        }
    }

    public int getName() {
        return name;
    }
}
