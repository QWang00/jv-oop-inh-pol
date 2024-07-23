package org.northcoders.shapes;

public class Circle extends Shape{
    public Circle(int radius) {
        this.radius = radius;
    }

    public int radius;


    @Override
    public double calculateArea() {
        return (Math.PI * (radius * radius));
    }

}
