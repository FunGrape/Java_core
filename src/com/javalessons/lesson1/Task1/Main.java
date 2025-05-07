package com.javalessons.lesson1.Task1;

import java.util.Scanner;
class Main {
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your number: ");
            int number = scan.nextInt();

            int FirstDigit = number / 10000;
            int SecondDigit = (number / 1000) % 10;
            int ThirdDigit = (number / 100) % 10;
            int FourthDigit = (number / 10) % 10;
            int FifthDigit = number % 10;

            System.out.println(FirstDigit);
            System.out.println(SecondDigit);
            System.out.println(ThirdDigit);
            System.out.println(FourthDigit);
            System.out.println(FifthDigit);
        }
    }
