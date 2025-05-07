package com.javalessons.lesson3.Loops2;

import java.util.Scanner;

class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int a = scanner.nextInt();

        long factorial = 1;
        for(int i = 1; i <= a; i++)
            factorial *= i;

        System.out.println("Факторіал " + a + " дорівнює " + factorial);
    }
}