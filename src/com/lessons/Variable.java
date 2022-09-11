package com.lessons;

public class Variable {
    public static void main(String[] args) {

        int number2 = 20;
        int numberToChange = 10;
        int answerOne = numberToChange * (number2 + numberToChange);
        System.out.println(answerOne);
        double numberTwo = 2.2123;
        float numberThree = (float) 3.234;
        String text = "My Name Ivan";

        int DeyOfWeek = 2;
        if (DeyOfWeek == 1){
            System.out.println("Понедельник");
        }
        else if (DeyOfWeek == 2) {
            System.out.println("Вторник");
        }
        else if (DeyOfWeek == 3) {
            System.out.println("Среда");
        }
        else if (DeyOfWeek == 4) {
            System.out.println("Четверг");
        }
        else if (DeyOfWeek == 5) {
            System.out.println("Пятница");
        }
        else if (DeyOfWeek == 6) {
            System.out.println("Суббота");
        }
        else if (DeyOfWeek == 7) {
            System.out.println("Воскресенье");
        }

        String gender = "woman";

        if ( gender == "woman") {
            System.out.println("Женщина");
        } else if ( gender == "man") {
            System.out.println("Мужчина");
        }

        int yearOld = 30;

        if ( yearOld <= 18) {
            System.out.println("Несовершеннолетний.");
        } else if (yearOld > 18 && yearOld < 50) {
            System.out.println("Совершеннолетний.");
        } else {
            System.out.println("Более 50-ти лет.");
        }

        int price = 20;
        int moneyAmount = 10;
        boolean Milk = true;
        boolean Coffee = true;
        if (moneyAmount >= price && Milk == true && Coffee == true){
            System.out.println("Вы приготовили кофе!");
        }else if (Milk == false){
            System.out.println("Нет молока!");
        } else if (Coffee == false) {
            System.out.println("Нет кофе");
        } else if (moneyAmount < 20) {
            System.out.println("У тебя нету денег сука!");
        }

    }
}
