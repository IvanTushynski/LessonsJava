package com.homeworks.workInterfacenAndSetters;
import com.homeworks.workInterfacenAndSetters.Mage;
import com.homeworks.workInterfacenAndSetters.Warrior;

public class EnemyGoblins extends Enemies implements Mechanics{

    @Override
    public void LevelUp() {
        Warrior warrior = new Warrior();
       if (warrior.getLevel() == 1){
           setEnemyName("Little Goblin");
           setEnemyAttack(8);
           setEnemyDefence(4);
       } else if (warrior.getLevel() == 2) {
           setEnemyName("Goblin");
           setEnemyAttack(12);
           setEnemyDefence(8);
       } else if (warrior.getLevel() == 3) {
           setEnemyName("Big Goblin");
           setEnemyAttack(16);
           setEnemyDefence(10);
       } else if (warrior.getLevel() == 4) {
           setEnemyName("Goblin Captain");
           setEnemyAttack(20);
           setEnemyDefence(12);
       }
    }

    @Override
    public void ExperienceGive() {
        Warrior warrior = new Warrior();
        Experience experience = new Experience();
        int experienceAdd;
        if (warrior.getLevel() == 1){
            experienceAdd = experience.experienceBattle[0][0];
        } else if (warrior.getLevel() == 2) {
            experienceAdd = experience.experienceBattle[1][0];
        } else if (warrior.getLevel() == 3) {
            experienceAdd = experience.experienceBattle[2][0];
        } else if (warrior.getLevel() == 4) {
            experienceAdd = experience.experienceBattle[3][0];
        }
    }
}
