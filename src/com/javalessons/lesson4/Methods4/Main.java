package com.javalessons.lesson4.Methods4;

class Main {
        public static void main(String[] args) {
            int height = 2;
            int width = 10;

            draw(height, width);
        }

        public static void draw(int height, int width) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }