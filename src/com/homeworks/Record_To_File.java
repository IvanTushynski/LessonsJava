package com.homeworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Record_To_File {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/homeworks/recorded");
        PrintWriter printWriter = new PrintWriter(file);
        int attack = 10000;
        int level = 22220;
        int hp = 63330;

        printWriter.println(attack + " " + level + " " + hp);
        printWriter.close();
    }
}
