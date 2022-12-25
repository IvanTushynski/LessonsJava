package com.homeworks;

import java.util.Scanner;

public class Getters_And_Setters {
    public static void main(String[] args) {
        Cars cars = new Cars();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name Of Car!");
        int nameCar = scanner.nextInt();
        if (nameCar == 1){
            cars.setName(1);
            cars.setPrice(100);
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
        if (name <= 10) {
            this.name = name;
            System.out.println(name + " NAME");
        } else {
            System.out.println("Name Very Long!");
        }
    }

    public void setPrice(int price) {
        if (price <= 10000) {
            this.price = price;
            System.out.println(price + " PRICE");
        } else {
            System.out.println("Price Very Long!");
        }
    }

    public int getName() {
        return name;
    }
}
