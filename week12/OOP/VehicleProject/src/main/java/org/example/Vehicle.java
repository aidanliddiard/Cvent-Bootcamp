package org.example;

public abstract class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private double averageMpg;
    private boolean electric;

    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double averageMpg, boolean electric) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.averageMpg = averageMpg;
        this.electric = electric;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers < 1) {
            throw new IllegalArgumentException("Passengers must be greater than 1");
        }
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        if (cargoCapacity < 0) {
            throw new IllegalArgumentException("Cargo capacity can't be negative");
        }
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        if (fuelCapacity < 0) {
            throw new IllegalArgumentException("Fuel capacity can't be negative");
        }
        this.fuelCapacity = fuelCapacity;
    }

    public double getAverageMpg() {
        return averageMpg;
    }

    public void setAverageMpg(double averageMpg) {
        if (averageMpg < 0) {
            throw new IllegalArgumentException("Average mpg can't be negative");
        }
        this.averageMpg = averageMpg;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    //abstract method
    public abstract void drive();

}
