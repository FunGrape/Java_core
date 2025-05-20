package com.javalessons.lesson4.Array1;

class Main {
        public static void main(String[] args) {
            int[] array = {0, 5, 2, 4, 7, 1, 3, 19};
            int count = 0;

            for (int number : array) {
                if (number % 2 != 0) {
                    count++;
                }
            }

            System.out.println("Кількість непарних чисел у масиві: " + count);
        }
    }
