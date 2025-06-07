package com.javalessons.lesson9;

public class Main {
    public static void main(String[] args){
        try {
            double temperatureF = calculation(25);
            System.out.println("Температура в Фаренгейтах: " + temperatureF);
        } catch (IllegalArgumentException e ) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Конвертація завершена.");
        }
        try {
            double temperatureF2 = calculation(-280);
            System.out.println("Температура в Фаренгейтах:" + temperatureF2);
        } catch(IllegalArgumentException e){
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Конвертація завершена.");
        }
    }

    public static double calculation(double temperature){
            if(temperature < -273.15){
                throw new IllegalArgumentException("Температура не може бути нижчою.");
            }
            return temperature * 9/5 + 32;
    }
}
