package com.homeworks;

public class Getters_And_Setters {
    public static void main(String[] args) {
        People person = new People();
        person.name = "Dasha";
        person.years = 33;
        System.out.println(person.name + " " + person.years);
    }
}

class People {
    String name;
    int years;

}
