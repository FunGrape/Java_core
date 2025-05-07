package com.javalessons.lesson3.Loops3;

class Main {
    public static void main(String args[]){
        int multiplier = 5;

        System.out.println("Таблиця множення на 5: ");
        for (int i = 1; i <= 10; i++){
            int result = i * multiplier;
            System.out.println(i + " x " + multiplier + " = " + result);
        }
    }
}