package com.homeworks;

public class Random {
    public static void main(String[] args) {
        //рандомное число
        int a = 2 + (int) (Math.random()*10);
        System.out.println(a);

        int[] exp = new int[]{1,2,3,4,5,6,7,8,9};
        int check = (int)Math.floor(Math.random() * exp.length);
        System.out.println(check);

        int[] exp2 = new int[]{1,2,3,4,5,6,7,8,9};
        int check2 = (int)Math.floor(Math.random() * exp2.length);
        System.out.println(check2);
    }
}
