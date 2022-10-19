package com.homeworks.workInterfacenAndSetters;

public class Enemies {

    private String enemyName;
    private int enemyAttack;
    private int enemyDefence;

    public void setEnemyName(String enemyName){
        this.enemyName = enemyName;
    }

    public String getEnemyName(){
        return enemyName;
    }

    public void setEnemyAttack(int enemyAttack){
        this.enemyAttack = enemyAttack;
    }

    public int getEnemyAttack(){
        return enemyAttack;
    }

    public void setEnemyDefence(int enemyDefence){
        this.enemyDefence = enemyDefence;
    }

    public int getEnemyDefence(){
        return enemyDefence;
    }

}
