package org.northcoders.shapes;

public class Prism extends Shape3D{
    public double height;

    public Prism(Shape base, double height) {
        this.height = height;
        this.base = base;

    }


    @Override
    public double calculateVolume() {
        return height * base.calculateArea();
    }
}
