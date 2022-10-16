package com.tasks;

public class ConstructorGame {
    public static void main(String[] args) {
        Player player = new Player();
        player.getLevel();
        player.getAttack();
        player.getDefence();
        player.getHp();
        player.getMp();
    }
}


class Player {
    int level;
    int attack;
    int defence;
    int hp;
    int mp;
    int experience = 2000;

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getLevel() {
            if (experience <= 100) {
                level = 1;
            } else if (experience > 100 && experience <= 200) {
                level = 2;
            } else if (experience > 200 && experience <= 400) {
                level = 3;
            } else if (experience > 400 && experience <= 600) {
                level = 4;
            } else if (experience > 600 && experience <= 900) {
                level = 5;
            } else if (experience > 900 && experience <= 1100) {
                level = 6;
            } else if (experience > 1200 && experience <= 1600) {
                level = 7;
            } else if (experience > 1600 && experience <= 2000) {
                level = 8;
            } else if (experience > 2200 && experience <= 2800) {
                level = 9;
            } else if (experience > 2800 && experience <= 3600) {
                level = 10;
            }
            System.out.println(level + " Level");
        return level;
    }

    public int getAttack() {
        attack = level * 4;
        System.out.println(attack + " Attack");
        return attack;
    }

    public int getDefence() {
        defence = level * 2;
        System.out.println(defence + " Defence");
        return defence;
    }

    public int getHp() {
        hp = level * 6;
        System.out.println(hp + " Hp");
        return hp;
    }

    public int getMp() {
        mp = level * 3;
        System.out.println(mp + " Hp");
        return mp;
    }
}

class Enemy {

}
