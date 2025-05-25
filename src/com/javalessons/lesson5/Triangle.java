package com.javalessons.lesson5;

public class Triangle {
        Point a, b, c;

        Triangle(Point a, Point b, Point c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getPerimeter() {
            return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
        }

        public double getArea() {
            double ab = a.distanceTo(b);
            double bc = b.distanceTo(c);
            double ca = c.distanceTo(a);
            double s = getPerimeter() / 2.0;
            return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
        }
    }