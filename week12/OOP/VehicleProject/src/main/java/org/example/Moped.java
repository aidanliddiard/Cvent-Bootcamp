package org.example;

public class Moped extends Vehicle {
    private String frame;
    private String engine;


    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double averageMpg, boolean electric, String frame, String engine) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, averageMpg, electric);
        this.frame = frame;
        this.engine = engine;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Moped driving.");
    }
}
