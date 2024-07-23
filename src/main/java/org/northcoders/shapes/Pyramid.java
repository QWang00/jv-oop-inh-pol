package org.northcoders.shapes;

public class Pyramid extends Shape3D{
    public double height;

    public Pyramid(Shape base, double height) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return base.calculateArea()*height /3;
    }
}
