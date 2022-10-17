package com.homeworks.interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(20);
        Person person = new Person("Garry");
        animal.sleep();
        person.sayHello();
        //-------------------------------
        animal.showInfo();
        person.showInfo();
        System.out.println("-------------------------------------------------------------");
        Info info1 = new Animal(2);
        Info info2 = new Person("Bill");
        info1.showInfo();
        info2.showInfo();
        System.out.println("-------------------------------------------------------------");
        outputInfo(info1);
        outputInfo(info2);
        System.out.println("-------------------------------------------------------------");
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
