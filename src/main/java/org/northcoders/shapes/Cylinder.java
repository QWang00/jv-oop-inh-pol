package org.northcoders.shapes;

public class Cylinder extends Shape3D{
    public double height;

    public Cylinder(Circle base, double height) {

        this.height = height;
        this.base = base;


    }



    @Override
    public double calculateVolume() {
        return base.calculateArea() * height;
    }
}
