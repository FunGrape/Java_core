package com.javalessons.lesson5;

public class Circle {
        private double radius;
        private Point center;

        public Circle(double radius, Point center) {
            if (radius <= 0) {
                throw new IllegalArgumentException("Радіус має бути додатнім.");
            }
            this.radius = radius;
            this.center = center;
        }

        public double getRadius() {
        return radius;
        }

        public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радіус має бути додатнім.");
        }
        this.radius = radius;
        }

        public Point getCenter() {
        return center;
        }

        public void setCenter(Point center) {
        this.center = center;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }