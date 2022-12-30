package com.homeworks;

import java.util.Arrays;

public class ArrayTwo {
    public static void main(String[] args) {
        String[] numbers = new String[]{"One", "Two", "Three", "Four", "Five"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[][] array = new String[][]{{"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", " ", "!"}, {"l", "m", "n", "o", "p", "q", "r", "s", "t", "v", "u", "w"}};
        System.out.print(array[0][9] + array[1][10] + array[1][6] + array[1][6] + array[1][6] + array[1][6] + array[1][11] + array[0][0] + array[0][11]);
    }
}
