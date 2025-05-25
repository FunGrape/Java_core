package com.javalessons.lesson5;

public class Circle {
        double radius;
        Point center;

        Circle(double radius, Point center) {
            if (radius <= 0) {
                throw new IllegalArgumentException("Радіус має бути додатнім.");
            }
            this.radius = radius;
            this.center = center;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }