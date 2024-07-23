package org.northcoders.vehicles;



public class Engine {
    public boolean running;
    public int horsepower;
    public String fuelType;
    static String[] allFuelType = {"Unleaded", "Leaded", "Diesel"};

    public boolean isRunning() {
        return running;
    }


    public Engine(boolean running, int horsepower, int index) {
        this.running = running;
        this.horsepower = horsepower;
        this.fuelType = allFuelType[index];
    }

    public void start(){
        running = true;
    }
}
