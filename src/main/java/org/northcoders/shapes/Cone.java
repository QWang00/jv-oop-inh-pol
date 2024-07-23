package org.northcoders.shapes;

public class Cone extends Shape3D{
   public double height;

    public Cone(double height, Circle base) {
        this.height = height;
        this.base = base;

    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
