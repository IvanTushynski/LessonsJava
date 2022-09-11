package com.homeworks;

public class While {
    public static void main(String[] args) {

        boolean t = 5 > 6;
        boolean ty = 5 > 2;
        boolean tu = 5 >= 5;
        System.out.println(t);
        System.out.println(ty);
        System.out.println(tu);

        int value = 0;
        while (value < 10){
            System.out.println("Number" + " " +value);
            value++;//увеличивает value на 1 что бы не было зацикливания(если убрать, будет зацикливание!!!)
        }
        int num = 0;
        int valueTwo = 30;
        while (valueTwo < 40){
            num++;
            valueTwo++;
            System.out.println(num + " " + valueTwo);
        }

    }
}
