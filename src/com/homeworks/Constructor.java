package com.homeworks;

public class Constructor {
    public static void main(String[] args) {
        HumanTwo humanTwo = new HumanTwo();
        //вызывается первый конструктор
        humanTwo.HumanTwo();
        //вызывается второй конструктор
        humanTwo.HumanTwo("Tom",23);
    }
}

class HumanTwo {
    String name;
    int age;
    //constructor
    public void HumanTwo(){
        this.name = "Standart";
        this.age = 44;
        System.out.println("первый конструктор");
        System.out.println(name + " " + age);
    }
    public void HumanTwo(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("второй конструктор");
        System.out.println(name + " " + age);
    }
}
