package com.tasks;

public class SplitToCamelCase {
    public static void main(String[] args) {
        Split split = new Split();
        split.toCamelCase("the-stealth-warrior");
        System.out.println(split.s);

    }
}

class Split{

    public String s = "the-stealth-warrior";

    public void toCamelCase(String s){
        String[] parts = s.split("_");
        String camelCaseString = "";
        for (String part : parts){
            camelCaseString = camelCaseString + toProperCase(part);
        }
    }

    static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() +
                s.substring(1).toLowerCase();
    }
}
