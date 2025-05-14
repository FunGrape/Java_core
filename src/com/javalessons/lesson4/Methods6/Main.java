package com.javalessons.lesson4.Methods6;

class Main {
        public static void main(String[] args) {
            String text = "Київ є столицею України.";

            int wordCount = countWords(text);
            System.out.println("Кількість слів: " + wordCount);
        }

        public static int countWords(String text) {
            String[] words = text.split(" ");
            return words.length;
        }
    }
