package org.example;

public class SemiTruck extends Vehicle {
    private int axles;
    private boolean trailer;
    private boolean oversizeLoad;
    private double length;
    private double weight;


    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double averageMpg, boolean electric, int axles, boolean trailer, boolean oversizeLoad, double length, double weight) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, averageMpg, electric);
        this.axles = axles;
        this.trailer = trailer;
        this.oversizeLoad = oversizeLoad;
        this.length = length;
        this.weight = weight;
    }

    public int getAxles() {
        return axles;
    }

    public void setAxles(int axles) {
        if (axles < 0) {
            throw new IllegalArgumentException("Axles can't be negative");
        }
        this.axles = axles;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    public boolean isOversizeLoad() {
        return oversizeLoad;
    }

    public void setOversizeLoad(boolean oversizeLoad) {
        this.oversizeLoad = oversizeLoad;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length can't be negative");
        }
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight can't be negative");
        }
        this.weight = weight;
    }

    @Override
    public void drive() {
        System.out.println("Semi truck driving.");
    }
}
