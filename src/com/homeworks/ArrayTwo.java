package com.homeworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class ArrayTwo {
    public static void main(String[] args) {
        //String[] numbers = new String[]{"One", "Two", "Three", "Four", "Five"};
        //for (int i = 0; i < numbers.length; i++) {
        //    System.out.println(numbers[i]);
        //}

        //String[][] array = new String[][]{{"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", " ", "!"}, {"l", "m", "n", "o", "p", "q", "r", "s", "t", "v", "u", "w"}};
        //System.out.print(array[0][9] + array[1][10] + array[1][6] + array[1][6] + array[1][6] + array[1][6] + array[1][11] + array[0][0] + array[0][11] + "\n");

        ArrayNewRec arrayNew = new ArrayNewRec();
        try {
            arrayNew.newRecord();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class ArrayNewRec {
    public void newRecord() throws FileNotFoundException {
        File file = new File("src/com/homeworks/recorded.txt");
        PrintWriter printWriter = new PrintWriter(file);
        String[] array = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "4", "!"};
        for (int i = 0; i < array.length; i++) {
            printWriter.print(array[i] + " ");
        }
        printWriter.close();
    }
}
