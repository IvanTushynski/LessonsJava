package com.homeworks;

public class This {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Anton");
        human.setAge(15);
        human.getInfo();
        //-------------------------------
        Human human2 = new Human();
        human2.setName("Oleg");
        human2.setAge(32);
        human2.getInfo();
    }
}

class Human{
    private String name;
    private int age;
    //setters
    public void setName(String myName){
        this.name = myName;
    }
    public void setAge(int myAge){
        this.age = myAge;
    }
    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name + " " + age);
    }
}
