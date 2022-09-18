package com.tasks;

public class For_Each_Test {
    public static void main(String[] args) {
        int[] years = {41,56,23,89,44,36,13,7,17,76};
        int yearsOld = oldYears(years);
        printAllYears(years);//выводит принт с методом printAllYears
        System.out.println("\nOlder Man " + yearsOld);
    }
    //метод, пересчитывающий все переменные массива int[] years
    public static void printAllYears(int[] years){
        System.out.print("|");
        for (int numbers:years
             ) {
            System.out.print(numbers + "|");
        }
    }
    //метод выводящий максимальное число из массива int[] years
    public static int oldYears(int[] numbers){
        int maxYear = numbers[0];
        for (int num:numbers
             ) {
            if (num > maxYear){
                maxYear = num;
            }
        }
        return maxYear;
    }
}
