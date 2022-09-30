package com.tasks;

import javax.swing.plaf.nimbus.State;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Save_Load_Game {
    public static void main(String[] args) throws FileNotFoundException {

        States states = new States();
        states.attack = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Save-1/Load-2");
        int loadSave = scanner.nextInt();
        //сохранение
        if (loadSave == 1) {
            File file = new File("src/com/tasks/saves");
            PrintWriter printWriter = new PrintWriter(file);

            printWriter.println(states.attack);
            printWriter.close();
            //сохранение
        } else if (loadSave == 2) {
            FileReader fileReader = new FileReader("src/com/tasks/saves");
            Scanner scannerLoad = new Scanner(fileReader);

            int attack = scannerLoad.nextInt();
            states.attack = attack;
            scannerLoad.close();
        }

        
        System.out.println(states.attack);
    }
}

class States{

    public int attack;
}
