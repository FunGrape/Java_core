package com.javalessons.lesson2.If2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рік: ");
        int year = scanner.nextInt();
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println(year + " рік — високосний. У році 366 днів.");
        } else {
            System.out.println(year + " рік — не високосний. У році 365 днів.");
        }
    }
}
