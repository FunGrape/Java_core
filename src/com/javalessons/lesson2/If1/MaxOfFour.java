package com.javalessons.lesson2.If1;

import java.util.Scanner;

class MaxOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();

        System.out.print("Введіть третє число: ");
        int c = scanner.nextInt();

        System.out.print("Введіть четверте число: ");
        int d = scanner.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        System.out.println("Найбільше число: " + max);
    }
}
