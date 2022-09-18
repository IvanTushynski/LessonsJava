package com.tasks;

public class Max_Number {
    //вывести максимальное число из массива при помощи for each
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int maxNum = num[0];
        for (int i:num
             ) {
            if (i > maxNum)
                maxNum = i;
        }
        System.out.println(maxNum);
    }
}
