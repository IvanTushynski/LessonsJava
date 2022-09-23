package com.tasks;

import java.util.Scanner;

public class FruitMachine {
    public static void main(String[] args) {
        Scanner fruitScan = new Scanner(System.in);
        FruitApple machineApple = new FruitApple();
        FruitBanana machineBanana = new FruitBanana();
        FruitPear machinePear = new FruitPear();

        //Вводные данные по фруктам
        //яблоки
        System.out.println("Enter Amount Of Apples:");
        machineApple.fruitsAppleAmount = fruitScan.nextInt();
        System.out.println("Enter Price To Apples:");
        machineApple.priceApple = fruitScan.nextInt();

        //бананы
        System.out.println("Enter Amount Of Bananas:");
        machineBanana.fruitsBananaAmount = fruitScan.nextInt();
        System.out.println("Enter Price To Bananas:");
        machineBanana.priceBanana = fruitScan.nextInt();

        //груши
        System.out.println("Enter Amount Of Pears:");
        machinePear.fruitsPearAmount = fruitScan.nextInt();
        System.out.println("Enter Price To Apples:");
        machinePear.pricePear = fruitScan.nextInt();

        //Цикл покупки фруктов
        for (int i = 1; i > 0; i++) {
            if (machineApple.fruitsAppleAmount >= 1){
                System.out.println("Enter Amount Of Fruits To Buy:");
                machineApple.fruitAppleBuy = fruitScan.nextInt();
                machineApple.ai();
            }else {
                System.out.println("Fruit Machine Empty. Please Reload Fruits!");
                break;
            }
        }
    }
}
//яблоки
class FruitApple {
    int fruitsAppleAmount;
    int fruitAppleBuy;
    int priceApple;
    void ai() {
        for (int i = 0; i < 1; i++) {
            if (fruitsAppleAmount >= 1) {
                fruitsAppleAmount = fruitsAppleAmount - fruitAppleBuy;
                int fruitApplePrice = priceApple * fruitAppleBuy;
                System.out.println(fruitAppleBuy + " Apples To Buy\n" + fruitsAppleAmount + " Apples Left" + "\nPrice :" + fruitApplePrice + "$" + "\n-------------");
            } else {
                break;
            }
        }
    }
}
//бананы
class FruitBanana {
    int fruitsBananaAmount;
    int fruitBananaBuy;
    int priceBanana;
    void ai() {
        for (int i = 0; i < 1; i++) {
            if (fruitsBananaAmount >= 1) {
                fruitsBananaAmount = fruitsBananaAmount - fruitBananaBuy;
                int fruitBananaPrice = priceBanana * fruitBananaBuy;
                System.out.println(fruitBananaBuy + " Bananas To Buy\n" + fruitsBananaAmount + " Bananas Left" + "\nPrice :" + fruitBananaPrice + "$" + "\n-------------");
            } else {
                break;
            }
        }
    }
}
//груши
class FruitPear {
    int fruitsPearAmount;
    int fruitPearBuy;
    int pricePear;
    void ai() {
        for (int i = 0; i < 1; i++) {
            if (fruitsPearAmount >= 1) {
                fruitsPearAmount = fruitsPearAmount - fruitPearBuy;
                int fruitPearPrice = pricePear * fruitPearBuy;
                System.out.println(fruitPearBuy + " Pears To Buy\n" + fruitsPearAmount + " Pears Left" + "\nPrice :" + fruitPearPrice + "$" + "\n-------------");
            } else {
                break;
            }
        }
    }
}