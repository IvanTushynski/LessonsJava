package com.homeworks;

public class Classes_And_Objects {
    //может быть только один
    //имя класса должно соответствовать названию файла
    public static void main(String[] args) {
        Person ivan = new Person();
        Person dasha = new Person();
        String s1 = "stringName";
        //ivan.setName(ivan.name1);
        ivan.setName(s1);
        ivan.age = 20;
        //применение методов
        ivan.speak();
        ivan.sayHello();// просто вызывает метод
        int years1 = ivan.calculateYearsToRetirement(); //вызывает метод в переменной
        dasha.name = "Dasha";
        dasha.age = 10;
        //применение методов
        dasha.speak();
        dasha.sayHello();
        int years2 = dasha.calculateYearsToRetirement();
        System.out.println(years1 + " Лет до пенсии");
        System.out.println(years2 + " Лет до пенсии");
    }
}

class Person {
    //у класса могут быть. данные(поля)
    String name;
    String name1 = "Zina";
    int age;
    //действия которые он может совершать(методы)
    void speak() {
        for (int i = 0; i < 1; i++){
        System.out.println("Меня зовут " + name + ", " + "Мне " + age + " Лет");
        }
    }

    void sayHello() {
        if (name == "Ivan"){
        System.out.println("Привет!!!");
        }else {
            System.out.println("Пока");
        }
    }
    //тип возвращаемого метода
    int calculateYearsToRetirement() {
        int years = 65 - age;
        //тип переменной пишется в начале метода
        return years;
        //after return method don`t working.
    }

    void setName(String userName) {
        name = userName;
        name1 = userName;
    }
}
