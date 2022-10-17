package com.homeworks;

public class StringBuilderLesson {
    public static void main(String[] args) {
        String x = "hello";
        x.toUpperCase();//не работает
        x = x.toUpperCase();//работает. Сама строка не меняется а переопределяется методом
        System.out.println(x);
        //--------------------------------------------------------------------------------
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);
        //stringBuilder------------------------------------------------------------------
        StringBuilder sb = new StringBuilder();
        sb.append("Mama");
        sb.append(" Mila");
        sb.append(" Ramu");
        sb.append(" Lala").append(" Mala").append(" Kala");
        System.out.println(sb.toString());
        //форматирование строк------------------------------------------------------------
        System.out.printf("I have Number %s\n","ONE");//%s добавляет тип строка
        System.out.printf("I have Number %d\n",1);//%d добавляет тип строка
        System.out.printf("I have Number %10d\n",1987);//%10d добавляет тип строка и ширину в 10 символов
        System.out.printf("I have Number %-10d",1987);//%10d добавляет тип строка и ширину в 10 символов показывая справа
    }
}
