package com.javalessons.lesson4.Array2;
import java.util.Scanner;

class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть розмір масиву: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Введіть елемент масиву з індексом " + i + ": ");
                array[i] = scanner.nextInt();
            }

            System.out.print("Ваш масив: ");
            for (int num : array)
                System.out.print(num + " ");
        }
    }