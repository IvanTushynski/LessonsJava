package com.homeworks.interfaces;

public class Animal implements Info {
    public int id;

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("im sleeping...");
    }

    public void showInfo() {
        System.out.println("ID is " + this.id);
    }
}


