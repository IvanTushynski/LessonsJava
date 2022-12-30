package com.homeworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Record_To_File {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("src/com/homeworks/recorded");
        //PrintWriter printWriter = new PrintWriter(file);
        //int attack = 10000;
        //int level = 22220;
        //int hp = 63330;

        //printWriter.println(attack + " " + level + " " + hp);
        //printWriter.close();
        RecordNew recordNew = new RecordNew();
        recordNew.newRecord(20,3,124);
    }
}

class RecordNew {
    private int attack;
    private int level;
    private int hp;

    public void newRecord(int attack,int level, int hp) throws FileNotFoundException {
        File file = new File("src/com/homeworks/recorded");
        PrintWriter printWriter = new PrintWriter(file);
        this.attack = attack;
        this.level = level;
        this.hp = hp;
        printWriter.println(attack + " " + level + " " + hp);
        printWriter.close();
    }
}
