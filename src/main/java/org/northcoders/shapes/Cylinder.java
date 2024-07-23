package org.northcoders.shapes;

public class Cylinder extends Shape3D{
    public double height;

    public Cylinder(double height, Circle base) {

        this.height = height;
        this.base = base;


    }



    @Override
    public double calculateVolume() {
        return 0;
    }
}
