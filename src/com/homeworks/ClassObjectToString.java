package com.homeworks;

public class ClassObjectToString {
    public static void main(String[] args) {
        //toString вызывает хэшкод вызываемого обьекта!!!
        Dogs dogs = new Dogs("Mailo",12,14);
        System.out.println(dogs.toString());
        DogsTwo dogs2 = new DogsTwo("Filli",13,8);
        System.out.println(dogs2.toString());
    }
}

class Dogs{
    private String name;
    private int age;
    private int weight;

    public Dogs(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}

class DogsTwo{
    private String name;
    private int age;
    private int weight;

    public DogsTwo(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String toString(){
        return name + " " + age + " " + weight;
    }
}

