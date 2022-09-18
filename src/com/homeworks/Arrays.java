package com.homeworks;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[21];       //numbers ссылается на ->  [массив] Ссылочный тип данных

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i*10;
            System.out.println(numbers[i]);
        }

        int[] numbersOne = {1,2,3};
        for (int i = 0; i < numbersOne.length; i++){
            System.out.println(numbersOne[i]);
        }


        //System.out.println(numbers[0]); //0 1 2 3 4
    }
}
