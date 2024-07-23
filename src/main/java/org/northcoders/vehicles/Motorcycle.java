package org.northcoders.vehicles;



public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String make, String model, boolean hasSidecar) {
        super(make, model);
        this.engine = new MotorcycleEngine(true, 5, 2);
        this.hasSidecar = hasSidecar;
    }

    @Override
    protected void accelerate() {

    }
}
