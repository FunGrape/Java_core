package com.javalessons.lesson5;

public class Main {
        public static void main(String[] args) {
            Point center = new Point(0, 0);

            try {
                Circle circle = new Circle(5, center);
                System.out.println("Площа кола: " + circle.getArea());
                System.out.println("Периметр кола: " + circle.getPerimeter());
            } catch (IllegalArgumentException e) {
                System.out.println("Помилка: " + e.getMessage());
            }

            try {
                Circle invalidCircle = new Circle(-2, center);
            } catch (IllegalArgumentException e) {
                System.out.println("Очікувана помилка: " + e.getMessage());
            }

            Point a = new Point(0, 0);
            Point b = new Point(4, 0);
            Point c = new Point(0, 3);

            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Площа трикутника: " + triangle.getArea());
            System.out.println("Периметр трикутника: " + triangle.getPerimeter());
        }
    }