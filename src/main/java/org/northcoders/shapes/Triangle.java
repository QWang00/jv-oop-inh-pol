package org.northcoders.shapes;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
         return ((base * height) / 2.0);
    }
}
