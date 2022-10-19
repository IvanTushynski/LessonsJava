package com.homeworks.workInterfacenAndSetters;

public class Heroes implements Mechanics {
    private String name;
    private int attack;
    private int defence;

    private int level;

    public void setName(String name){
            this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAttack(int attack){
        if (attack >= 1) {
            this.attack = attack;
        }
    }

    public int getAttack(){
        return attack;
    }

    public void setDefence(int defence){
        if (defence >= 1) {
            this.defence = defence;
        }
    }

    public int getDefence(){
        return defence;
    }

    public void setLevel(int level){
        if (level >= 1) {
            this.level = level;
        }
    }

    public int getLevel(){
        return level;
    }

    @Override
    public void Battle() {

    }
}
