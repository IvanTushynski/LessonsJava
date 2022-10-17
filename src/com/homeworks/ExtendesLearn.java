package com.homeworks;

public class ExtendesLearn {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.eat();
        animals.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showName();
    }
}

class Animals {
    String name = "Garry";
    public void eat() {
        System.out.println("Im Eating...");
    }

    public void sleep() {
        System.out.println("Im Sleep...");
    }

}

class Dog extends Animals {
    public void bark() {
        System.out.println("im Barking...");
    }
    //переопределяет метод из Animals
    public void eat() {
        System.out.println("Im a Dog, im Eating...");
    }

    public void showName(){
        System.out.println(name);
    }
}
