package com.javalessons.lesson4.Methods2;

class Main {
        public static void main(String[] args) {
            int[] numbers = {3, 17, 8, 25, 10, 4};
            int max = findMax(numbers);
            System.out.println("Максимальне число в масиві: " + max);
        }

        public static int findMax(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
    }
