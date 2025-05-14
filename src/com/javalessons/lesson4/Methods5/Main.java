package com.javalessons.lesson4.Methods5;
import java.util.Scanner;

class Main {
        public static void main(String[] args) {
            int[] array = {4, 8, 15, 23, 42};
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть число: ");
            int target = scanner.nextInt();

            int index = Search(array, target);

            if (index != -1)
                System.out.println("Елемент знайдено за індексом: " + index);
            else
                System.out.println("-1");
        }

        public static int Search(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }