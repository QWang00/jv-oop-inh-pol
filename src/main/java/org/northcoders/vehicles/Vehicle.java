package org.northcoders.vehicles;



public abstract class Vehicle {
    private String make;
    private String model;
    private int speed;
    public Engine engine;

    public Vehicle(String make, String model){
        this.make = make;
        this.model = model;

    }

    public void start(){
        engine.start();
    }

    public void drive(){
        if(engine.isRunning()){
            accelerate();
        } else{
            System.out.println(make + " " + model + " is not running.");
        }
    }

    protected abstract void accelerate();
}
