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
        System.out.println("--------------------");
        machineApple.fruitsAppleAmount = fruitScan.nextInt();
        System.out.println("Enter Price To Apples:");
        System.out.println("--------------------");
        machineApple.priceApple = fruitScan.nextInt();

        //бананы
        System.out.println("Enter Amount Of Bananas:");
        System.out.println("--------------------");
        machineBanana.fruitsBananaAmount = fruitScan.nextInt();
        System.out.println("Enter Price To Bananas:");
        System.out.println("--------------------");
        machineBanana.priceBanana = fruitScan.nextInt();

        //груши
        System.out.println("Enter Amount Of Pears:");
        System.out.println("--------------------");
        machinePear.fruitsPearAmount = fruitScan.nextInt();
        System.out.println("Enter Price To Pears:");
        System.out.println("--------------------");
        machinePear.pricePear = fruitScan.nextInt();

        //Цикл покупки фруктов
        for (int i = 1; i > 0; i++){
            System.out.println("Select Fruit To Buy:" + " 1-Apples"+ " [" + machineApple.fruitsAppleAmount + "] " + machineApple.priceApple + "$");
            System.out.println("--------------------");
            System.out.println("Select Fruit To Buy:" + " 2-Bananas"+ " [" + machineBanana.fruitsBananaAmount + "] " + machineBanana.priceBanana + "$");
            System.out.println("--------------------");
            System.out.println("Select Fruit To Buy:" + " 3-Pears"+ " [" + machinePear.fruitsPearAmount + "] " + machinePear.pricePear + "$");
            System.out.println("--------------------");
            int fruitSelect = fruitScan.nextInt();

            if (fruitSelect == 1){
                if (machineApple.fruitsAppleAmount >= 1){
                    System.out.println("Enter Amount Of Apples To Buy:");
                    machineApple.fruitAppleBuy = fruitScan.nextInt();
                    machineApple.ai();
                }else {
                    System.out.println("Apples Machine Empty. Please Reload Apples!");
                    break;
                }
            } else if (fruitSelect == 2) {
                if (machineBanana.fruitsBananaAmount >= 1){
                    System.out.println("Enter Amount Of Bananas To Buy:");
                    machineBanana.fruitBananaBuy = fruitScan.nextInt();
                    machineBanana.ai();
                }else {
                    System.out.println("Bananas Machine Empty. Please Reload Bananas!");
                    break;
                }
            } else if (fruitSelect == 3) {
                if (machinePear.fruitsPearAmount >= 1){
                    System.out.println("Enter Amount Of Pears To Buy:");
                    machinePear.fruitPearBuy = fruitScan.nextInt();
                    machinePear.ai();
                }else {
                    System.out.println("Pears Machine Empty. Please Reload Pear!");
                    break;
                }
            } else {
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