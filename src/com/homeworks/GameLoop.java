package com.homeworks;

import java.io.*;
import java.util.Scanner;

public class GameLoop {
    public static void main(String[] args) throws IOException {

        gameBattle gameBattle = new gameBattle();
        playerStats playerStatsOne = new playerStats();

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i > 0; i++){
            int gameMenu = scanner.nextInt();
            if (gameMenu == 1){
                gameBattle.battleOne();
            } else if (gameMenu == 2) {
                playerStatsOne.stateLook();
            } else if (gameMenu == 3) {
                FileReader fileReader = new FileReader("src/com/homeworks/recorded");
                Scanner scannerOne = new Scanner(fileReader);

                int attackScan = scannerOne.nextInt();
                int defenceScan = scannerOne.nextInt();
                playerStatsOne.attack = attackScan;
                playerStatsOne.defence = defenceScan;
                System.out.println(playerStatsOne.attack + " " + playerStatsOne.defence);
                fileReader.close();
            } else if (gameMenu == 4) {
                break;
            }
        }

    }
}
class gameSaves{

}

class playerStats {
    int attack = 1;
    int defence = 1;

    public void stateLook() throws IOException {
        FileReader fileReader = new FileReader("src/com/homeworks/recorded");
        Scanner scanner = new Scanner(fileReader);

        int attackScan = scanner.nextInt();
        int defenceScan = scanner.nextInt();
        attack = attackScan;
        defence = defenceScan;
        System.out.println(attack + " " + defence);
        fileReader.close();
    }
}

class gameBattle{
    playerStats plStats = new playerStats();
    public void battleOne() throws FileNotFoundException {
        for (int i = 0; i < 3; i++){
                plStats.attack++;
                plStats.defence++;
                File file = new File("src/com/homeworks/recorded");
                PrintWriter printWriter = new PrintWriter(file);

                printWriter.println(plStats.attack + " " + plStats.defence);
                printWriter.close();
            }
        }
    }
