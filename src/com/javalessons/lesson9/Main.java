package com.javalessons.lesson9;

public class Main {
    public static void main(String[] args){
        calculation(25);
        calculation(-280);
    }

    public static double calculation(double temperature){
        try {
            if(temperature < -273.15){
                throw new IllegalArgumentException("Температура не може бути нижчою.");
            }
            double temperature_f = temperature * 9/5 + 32;
            System.out.println("Температура у Фаренгейтах: " + temperature_f);
            return temperature_f;
        } catch (IllegalArgumentException e){
            System.out.println("Помилка: " + e.getMessage());
            return Double.NaN;
        } finally {
            System.out.println("Конвертація завершена.");
        }
    }
}
