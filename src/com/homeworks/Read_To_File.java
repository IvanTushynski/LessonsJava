package com.homeworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_To_File {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/com/homeworks/recorded");
        Scanner scanner = new Scanner(fileReader);

        int attack = scanner.nextInt();
        int level = scanner.nextInt();
        int hp = scanner.nextInt();
        System.out.println("Attack " + attack);
        System.out.println("Level " + level);
        System.out.println("Hp " + hp);

        fileReader.close();
    }
}
