package org.northcoders.shapes;

public class Sphere extends Shape3D{
    public Sphere(Circle base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(((Circle) base).getRadius(),3 )* Math.PI * 4 /3 ;
    }
}
