package org.northcoders.shapes;

public class Cube extends Shape3D{
    // Here I am not initializing size as it's not Shape3D fields
    //public int size;
    public Cube(int size) {
        //this.size = size;
        // Here I set base to a new Rectangle
        // as 'base' is the field of Shape3D
        //new Cube(new Rectangle(size, size));
        this.base = new Rectangle(size, size);
    }
    private Cube(Rectangle base){

    }

    @Override
    public double calculateVolume() {
        return Math.pow(size, 3);
    }
}
