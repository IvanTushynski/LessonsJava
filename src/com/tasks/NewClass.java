package com.tasks;

public class NewClass {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                String textOne = "3";
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(textOne);
            } else if (i == 4) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String textOne = "4";
                System.out.print(textOne);
            } else if (i == 5) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String textOne = "5";
                System.out.print(textOne);
            } else if (i == 6) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String textOne = "6";
                System.out.print(textOne);
            }
        }
    }
}
