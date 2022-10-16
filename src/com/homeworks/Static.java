package com.homeworks;

public class Static {
    public static void main(String[] args) {
        /*
        HumanThree human1 = new HumanThree("Bob",30);
        HumanThree human2 = new HumanThree("Bill",20);
        HumanThree.gender = "Male";
        human1.getFields();
        human2.getFields();
         */
        HumanThree.gender = "Female";
        HumanThree.getFields1();
        System.out.println(Math.pow(2,4));//2 в 4 степени
    }
}

class HumanThree {

    public String name;
    int age;
    public static String gender;//можно обращаться к классу напрямую из другого класса! Значение этой переменной распространяется везде.

    public HumanThree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
    }

    public static void getGender() {
        System.out.println(gender);
    }

    public void getFields() {
        System.out.println(name + " " + age + " " + gender);
    }

    public static void getFields1() {//статический метод может работать только со статическими переменными!!!
        System.out.println(gender);
    }

    //зачем нужны - если методу не нужно знать переменные обьекта.
}
