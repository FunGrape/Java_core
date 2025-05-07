package com.javalessons.lesson1.Task3;

import java.util.Scanner;

class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть радіус кола: ");
        double radius = scan.nextInt();

        double length = 2 * 3.14 * radius;
        System.out.print("Довжина кола: " + length);
    }
}
