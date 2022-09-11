package com.lessons;

public class Ariphmetics {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int answer;
        double answerTwo;

        a = 6;
        b = 8;
        c = 6;

        answer = a * b;
        System.out.println(answer);

        answer = a + b;
        System.out.println(answer);

        answer = b%3;
        System.out.println(answer);

        answerTwo = ((float)a + (float)b) / (float)c;
        System.out.println(answerTwo);

        answer = a + b%3;
        System.out.println(answer);

        answer = c + c * a + a;
        System.out.println(answer);

        boolean isMoreThatOne = answer > 42? true:false;
        System.out.println(isMoreThatOne);
        
        if (answer > 42) {
            System.out.println("Число больше 42 и равно:" + answer);
        } else {
            System.out.println("к сожаления число меньше 42 и равно:" + answer);
        }


    }
}
