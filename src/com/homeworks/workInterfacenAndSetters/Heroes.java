package com.homeworks.workInterfacenAndSetters;

public class Heroes{
    private String name;
    private int attack;
    private int defence;
    private int level;

    public void setName(String name){
            this.name = name;
        System.out.println(name + " Name");
    }

    public String getName(){
        return name;
    }

    public void setAttack(int attack){
        attack = level * 2;
        if (attack >= 1) {
            this.attack = attack;
            System.out.println(attack + " Attack");
        }
    }

    public int getAttack(){
        return attack;
    }

    public void setDefence(int defence){
        if (defence >= 1) {
            this.defence = defence;
            System.out.println(defence + " Attack");
        }
    }

    public int getDefence(){
        return defence;
    }

    public void setLevel(int level){
        if (level >= 1 && level < 20) {
            this.level = level;
            System.out.println(level + "Level");
        }
    }

    public int getLevel(){
        return level;
    }

}
