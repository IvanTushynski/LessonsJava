package com.homeworks;

public class Multidimensional_Arrays {
    public static void main(String[] args) {
        int[][] num = {{1,2,3,6,4,8,2,488,327},
                       {4,5,6,6,2,78,0,3432},
                       {7,8,9,456,3,462,-345}}; //шахматная доска первая[] читается вниз ---- вторая[] читается вправо
        System.out.println(num[1][7] / (num[2][3] + num[1][0]));
        System.out.println(num[2][3]);
        }
    }
