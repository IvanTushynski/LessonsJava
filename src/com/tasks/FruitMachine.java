package com.tasks;

import java.util.Scanner;

public class FruitMachine {
    public static void main(String[] args) {
        Scanner fruitScan = new Scanner(System.in);

        FruitApple machineApple = new FruitApple();
        FruitBanana machineBanana = new FruitBanana();
        FruitPear machinePear = new FruitPear();
        myMoney moneyForFruits = new myMoney();

        //Вводные данные по фруктам
        //яблоки
        System.out.println("Load Amount Of Apples:");
        System.out.println("-------------------------");
        machineApple.fruitsAppleAmount = fruitScan.nextInt();
        System.out.println("Enter Price To Apples:");
        System.out.println("-------------------------");
        machineApple.priceApple = fruitScan.nextInt();

        //бананы
        System.out.println("Load Amount Of Bananas:");
        System.out.println("-------------------------");
        machineBanana.fruitsBananaAmount = fruitScan.nextInt();
        System.out.println("Enter Price To Bananas:");
        System.out.println("-------------------------");
        machineBanana.priceBanana = fruitScan.nextInt();

        //груши
        System.out.println("Load Amount Of Pears:");
        System.out.println("-------------------------");
        machinePear.fruitsPearAmount = fruitScan.nextInt();
        System.out.println("Enter Price To Pears:");
        System.out.println("-------------------------");
        machinePear.pricePear = fruitScan.nextInt();
        System.out.println("Fruit Machine Loaded And Ready To Work!!!");

        //Цикл покупки фруктов
        for (int i = 1; i > 0; i++){
            if (moneyForFruits.money <= 0) {
            System.out.println("Not Enough Money... Please Top Up The Balance");
            moneyForFruits.money = fruitScan.nextInt();
            }

            System.out.println("Select Fruit To Buy:" + " 1-Apples"+ " [" + "Amount: " + machineApple.fruitsAppleAmount + "] " + "Price: " + machineApple.priceApple + "$");
            System.out.println("----------------------------------------------");
            System.out.println("Select Fruit To Buy:" + " 2-Bananas"+ " [" + "Amount: " + machineBanana.fruitsBananaAmount + "] "+ "Price: " + machineBanana.priceBanana + "$");
            System.out.println("----------------------------------------------");
            System.out.println("Select Fruit To Buy:" + " 3-Pears"+ " [" + "Amount: 100" + machinePear.fruitsPearAmount + "] "+ "Price: " + machinePear.pricePear + "$");
            System.out.println("----------------------------------------------");
            System.out.println("Your Money: " + moneyForFruits.money + "$");
            int fruitSelect = fruitScan.nextInt();

            if (fruitSelect == 1){
                if (machineApple.fruitsAppleAmount >= 1){
                    System.out.println("Enter Amount Of Apples To Buy:");
                    machineApple.fruitAppleBuy = fruitScan.nextInt();
                    if (machineApple.fruitAppleBuy <= machineApple.fruitsAppleAmount)
                    {
                        moneyForFruits.money = moneyForFruits.money - (machineApple.priceApple * machineApple.fruitAppleBuy);
                        machineApple.ai();
                    }else {
                        System.out.println("Max Apples " + machineApple.fruitsAppleAmount);
                    }
                }else {
                    System.out.println("Apples Machine Empty. Please Reload Apples!!!");
                    //break;
                }
            } else if (fruitSelect == 2) {
                if (machineBanana.fruitsBananaAmount >= 1 && fruitSelect <= machineBanana.fruitsBananaAmount){
                    System.out.println("Enter Amount Of Bananas To Buy:");
                    machineBanana.fruitBananaBuy = fruitScan.nextInt();
                    if (machineBanana.fruitBananaBuy <= machineBanana.fruitsBananaAmount)
                    {
                        moneyForFruits.money = moneyForFruits.money - (machineBanana.priceBanana * machineBanana.fruitBananaBuy);
                        machineBanana.ai();
                    }else {
                        System.out.println("Max Bananas " + machineBanana.fruitsBananaAmount);
                    }
                }else {
                    System.out.println("Bananas Machine Empty. Please Reload Bananas!!!");
                    //break;
                }
            } else if (fruitSelect == 3) {
                if (machinePear.fruitsPearAmount >= 1 && fruitSelect <= machinePear.fruitsPearAmount){
                    System.out.println("Enter Amount Of Pears To Buy:");
                    machinePear.fruitPearBuy = fruitScan.nextInt();
                    if (machinePear.fruitPearBuy <= machinePear.fruitsPearAmount)
                    {
                        moneyForFruits.money = moneyForFruits.money - (machinePear.pricePear * machinePear.fruitPearBuy);
                        machinePear.ai();
                    }else {
                        System.out.println("Max Pears " + machinePear.fruitsPearAmount);
                    }
                }else {
                    System.out.println("Pears Machine Empty. Please Reload Pear!");
                    //break;
                }
            } else {
                System.out.println("!!!Please Select Numbers 1, 2 or 3!!!");
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

class myMoney {
    int money;
}