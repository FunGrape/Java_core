package com.javalessons.lesson4.Array3;
import java.util.Scanner;

class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] original = new int[15];
            int[] expanded = new int[30];
            System.out.println("Введіть 15 цілих чисел:");
            for (int i = 0; i < original.length; i++) {
                System.out.print("Елемент " + (i + 1) + ": ");
                original[i] = scanner.nextInt();
            }

            for (int i = 0; i < original.length; i++) {
                expanded[i] = original[i];
            }

            for (int i = 0; i < original.length; i++) {
                expanded[i + 15] = original[i] * 2;
            }

            System.out.println("Початковий масив: ");
            for (int num : original) {
                System.out.print(num + " ");
            }

            System.out.println("Розширений масив: ");
            for (int num : expanded) {
                System.out.print(num + " ");
            }
        }
    }