package org.northcoders.shapes;

public class Circle extends Shape{
    public Circle(int radius) {
        this.radius = radius;
    }

    private int radius;

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * (radius * radius));
    }

}
