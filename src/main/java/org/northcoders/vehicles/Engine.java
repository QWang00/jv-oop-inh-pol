package org.northcoders.vehicles;



public class Engine {
    public boolean running;
    public int horsepower;
    public String fuelType;
    static String[] allFuelType = {"Unleaded", "Leaded", "Diesel"};

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
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
