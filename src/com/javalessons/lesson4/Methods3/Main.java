package com.javalessons.lesson4.Methods3;

class Main {
        public static void main(String[] args) {
            int wholeNumber = 5;
            double realNumber = 5.5;
            String text = "Результат: ";

            String result = concatenateWithSum(wholeNumber, realNumber, text);
            System.out.println(result);
        }

        public static String concatenateWithSum(int intValue, double doubleValue, String str) {
            double sum = intValue + doubleValue;
            return str + sum;
        }
    }
