package com.homeworks;

public class Classes_And_Objects {
    //может быть только один
    //имя класса должно соответствовать названию файла
    public static void main(String[] args) {
        Person ivan = new Person();
        Person dasha = new Person();

        ivan.name = "Ivan";
        ivan.age = 20;
        dasha.name = "Dasha";
        dasha.age = 30;
        //System.out.println(ivan.name + " ----- " + dasha.name);
        //System.out.println(ivan.age + " ----- " + dasha.age);
    }
}

class Person {
    //у класса могут быть. данные(поля)
    String name;
    int age;
    //действия которые он может совершать(методы)
    void Speak() {
        System.out.println("Меня зовут " + name + ", " + "Мне " + age + " Лет");
    }
}
