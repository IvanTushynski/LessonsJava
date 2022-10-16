package com.tasks;

public class ConstructorGame {
    public static void main(String[] args) {
        Player player = new Player();
        player.setLevel(23);
        player.getAttack();
        System.out.println(player.getAttack());
    }
}


class Player {
    int level;
    int attack;
    int defence;
    int hp;
    int mp;

    public void setLevel(int level){

        this.level = level;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public void setDefence(int defence){
        this.defence = defence;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void setMp(int mp){
        this.mp = mp;
    }

    public int getLevel(){
        return level;
    }

    public int getAttack() {
        attack = level * 4;
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }
}

class Enemy {

}
