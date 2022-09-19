package com.tasks;

import java.util.Scanner;

public class PlayerAttack_With_Level {
    public static void main(String[] args) {
            int playerAttack = 2;
            int playerDefence = 1;
            int playerStatesAtt = 0;
            int playerStatesWithSwordOne;
            int playerStatesDef = 0;

            Scanner scanLevel = new Scanner(System.in);
            System.out.println("Enter Player Level\n");
            int playerLevel = scanLevel.nextInt();

            int[][] attackStates = {{2, 4, 6},
                    {20, 40, 60},
                    {200, 400, 600}};
            int[][] defenceStates = {{1, 3, 5},
                    {10, 30, 60},
                    {100, 300, 600}};

            if (playerLevel > 0 && playerLevel < 10) {
                playerStatesAtt = playerLevel + playerAttack + attackStates[0][0];
                playerStatesDef = playerLevel + playerDefence + defenceStates[0][0];
            } else if (playerLevel > 10 && playerLevel < 20) {
                playerStatesAtt = playerLevel + playerAttack + attackStates[0][1];
                playerStatesDef = playerLevel + playerDefence + defenceStates[0][1];
            } else if (playerLevel > 20 && playerLevel < 30) {
                playerStatesAtt = playerLevel + playerAttack + attackStates[0][2];
                playerStatesDef = playerLevel + playerDefence + defenceStates[0][2];
            }


            System.out.println("Attack:" + playerStatesAtt);
            System.out.println("Defence:" + playerStatesDef);


            System.out.println("Enter sword true -1 or false -0");
            int swordOne = scanLevel.nextInt();

            if (swordOne == 1) {
                playerStatesWithSwordOne = playerLevel + playerAttack + attackStates[1][1];
                System.out.println("Attack:" + playerStatesWithSwordOne);
            } else if (swordOne == 0) {
                if (playerLevel > 0 && playerLevel < 10) {
                    playerStatesAtt = playerLevel + playerAttack + attackStates[0][0];
                    playerStatesDef = playerLevel + playerDefence + defenceStates[0][0];
                } else if (playerLevel > 10 && playerLevel < 20) {
                    playerStatesAtt = playerLevel + playerAttack + attackStates[0][1];
                    playerStatesDef = playerLevel + playerDefence + defenceStates[0][1];
                } else if (playerLevel > 20 && playerLevel < 30) {
                    playerStatesAtt = playerLevel + playerAttack + attackStates[0][2];
                    playerStatesDef = playerLevel + playerDefence + defenceStates[0][2];
                }
                System.out.println("Attack:" + playerStatesAtt);
                System.out.println("Defence:" + playerStatesDef);
            } else {
                System.out.println("Incorrect Sword Slot...");
            }
        }
    }

