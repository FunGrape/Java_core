package com.javalessons.lesson4.Methods1;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок тексту: ");
        String input = scanner.nextLine();

        int count = countBCharacters(input);

        System.out.println("Кількість символів 'b': " + count);

        scanner.close();
    }

    public static int countBCharacters(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b') {
                count++;
            }
        }
        return count;
    }
}
