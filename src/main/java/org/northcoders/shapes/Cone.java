package org.northcoders.shapes;

public class Cone extends Shape3D{
   public double height;

    public Cone(Circle base, double height) {
        this.height = height;
        this.base = base;

    }

    @Override
    public double calculateVolume() {
        return base.calculateArea()*height / 3;
    }
}
