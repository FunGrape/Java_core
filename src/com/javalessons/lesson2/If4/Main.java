package com.javalessons.lesson2.If4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть радіус круга: ");
        double radius = scanner.nextDouble();

        System.out.print("Введіть координату x точки: ");
        double x = scanner.nextDouble();

        System.out.print("Введіть координату y точки: ");
        double y = scanner.nextDouble();

        double distance = Math.sqrt(x * x + y * y);

        if (distance <= radius) {
            System.out.println("Точка знаходиться всередині круга або на його межі.");
        } else {
            System.out.println("Точка знаходиться поза кругом.");
        }
    }
}
