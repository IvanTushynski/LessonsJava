package com.tasks;

public class ConstructorGame {
    public static void main(String[] args) {
        Player player = new Player();
        //player.getAttack();
        //player.getDefence();
        //player.getHp();
        //player.getMp();
        player.getExperience();
        levelUpMechanic();

    }
    public static void levelUpMechanic(){
        Player player = new Player();
        if (player.experience <= 100 && player.level <= 9) {
            player.level = 1;
        } else if (player.experience > 100 && player.experience <= 200 && player.level <= 9) {
            player.level = 2;
        } else if (player.experience > 200 && player.experience <= 400 && player.level <= 9) {
            player.level = 3;
        } else if (player.experience > 400 && player.experience <= 600 && player.level <= 9) {
            player.level = 4;
        } else if (player.experience > 600 && player.experience <= 900 && player.level <= 9) {
            player.level = 5;
        } else if (player.experience > 900 && player.experience <= 1100 && player.level <= 9) {
            player.level = 6;
        } else if (player.experience > 1200 && player.experience <= 1600 && player.level <= 9) {
            player.level = 7;
        } else if (player.experience > 1600 && player.experience <= 2000 && player.level <= 9) {
            player.level = 8;
        } else if (player.experience > 2200 && player.experience <= 2800 && player.level <= 9) {
            player.level = 9;
        } else if (player.experience > 2800 && player.experience <= 3600 && player.level <= 9) {
            player.level = 10;
        }
        else {
            System.out.println("maximal level");
        }
        System.out.println(player.level + " Level");
    }
}


class Player {
    int level;
    int attack;
    int defence;
    int hp;
    int mp;
    int experience = 30;

    public int setLevel(int level) {
        if (level <= 9){
            this.level = level;
        }else {
            System.out.println("maximal level");
        }
        return level;
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

    public int getExperience(){
        Enemy enemy = new Enemy();
        if (enemy.firstMob == 1){
            int[] exp = new int[]{1,2,3,4,5,6,7,8,9};
            int check = (int)Math.floor(Math.random() * exp.length);
            experience = check + experience;
        } else if (enemy.secondMob == 1) {
            int[] exp = new int[]{5,6,7,8,9,10,11,12,13};
            int check = (int)Math.floor(Math.random() * exp.length);
            experience = check + experience;
        }
        System.out.println(experience);
        return experience;
    }
}

class Enemy {
    int firstMob = 1;
    int secondMob = 0;
    int thirdMob;
}
