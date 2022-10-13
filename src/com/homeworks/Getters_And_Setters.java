package com.homeworks;

public class Getters_And_Setters {
    public static void main(String[] args) {
        People person = new People();

        int a = 3;
        if (a > 3){
            person.setYears(4);
        } else if (a < 3) {
            person.setYears(2);
        } else if (a == 3) {
            person.setYears(-20);
        }
        System.out.println(person.getYears());
    }
}

class People {
    String name;
    private int years;
    public void setYears(int years){
        if (years >= 1){
            this.years = years;
        }else {
            System.out.println("Wrong Number!");
        }
    }
    public int getYears(){
        return years;
    }

}
