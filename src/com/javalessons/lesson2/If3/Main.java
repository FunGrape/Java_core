package com.javalessons.lesson2.If3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть довжину першої сторони: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть довжину другої сторони: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть довжину третьої сторони: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Трикутник з такими сторонами існує.");
        } else {
            System.out.println("Трикутник з такими сторонами не існує.");
        }
    }
}
