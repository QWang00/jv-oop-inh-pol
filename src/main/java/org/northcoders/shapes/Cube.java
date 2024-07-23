package org.northcoders.shapes;

public class Cube extends Shape3D{
    // TODO: here we made a extra field but may need to change
    public int size;
    public Cube(int size) {
        this.size = size;
        new Cube(new Rectangle(size, size));
    }
    private Cube(Rectangle base){

    }

    @Override
    public double calculateVolume() {
        return Math.pow(size, 3);
    }
}
