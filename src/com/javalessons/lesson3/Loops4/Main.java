package com.javalessons.lesson3.Loops4;

class Main {
    public static void main(String[] args) {
        System.out.println("Прості числа від 1 до 100:");

        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
