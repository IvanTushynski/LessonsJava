package com.homeworks.workInterfacenAndSetters;

public class Warrior extends Heroes implements Mechanics{

    public void warriorStats(){
        setName("Warrior");
        setAttack(12);
        setDefence(8);
        setLevel(1);
        //-----------------------
        getName();
        getAttack();
        getDefence();
        getLevel();
    }

    @Override
    public void LevelUp() {
        if (getLevel() == 1){
            setAttack(12);
            setDefence(8);
        } else if (getLevel() == 2) {
            setAttack(14);
            setDefence(10);
        }
    }

    @Override
    public void ExperienceGive() {

    }
}
