package com.homeworks.workInterfacenAndSetters;

public class Mage extends Heroes implements Mechanics {

    public void mageStats(){
        setName("Mage");
        setAttack(14);
        setDefence(6);
        setLevel(1);
        //-----------------------
        getName();
        getAttack();
        getDefence();
        getLevel();
    }
    @Override
    public void LevelUp() {

    }

    @Override
    public void ExperienceGive() {

    }
}
