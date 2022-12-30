package com.homeworks;

public class StringUpperText {
    public static void main(String[] args) {
        String txt = "Hello";
        txt = txt.toUpperCase();
        System.out.println(txt);
        txt = txt.toLowerCase();
        System.out.println(txt);

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String txt2 = "Hello Everybody";
        System.out.println(txt2.indexOf("e"));
    }
}

