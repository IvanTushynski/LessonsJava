package com.homeworks;

public class Array_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        numbers[0] = 10;
        numbers[1] = 11;

        String[] strings = new String[3];
        strings[0] = "hello";
        strings[1] = "bye";
        strings[2] = "nice to meet you";
        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }

        //for each

        for (String string:strings //тип данных, переменная, массив.
             ) {
            System.out.println(string);
        }

        int[] number = {1,2,3};
        int sum = 0;
        for (int x:number
             ) {
            sum = sum+x;
            System.out.println(sum);//каждую итерацию добавляет сумму предидущих чисел(1 + (1+2) + (1+2+3))
        }

        int value = 0; //выделяет память компьютера - макс 32 бита
        String s; //в данный момент не выделяет памяти вообще и равно null
        s = "lalalalalala"; //а теперь выделяет память под написанные буквы
    }
}
