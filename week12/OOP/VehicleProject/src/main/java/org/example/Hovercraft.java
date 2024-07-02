package org.example;

public class Hovercraft extends Vehicle{
    private double maxHeight;
    private String planetOrigin;
    private String propulsion;
    private String frame;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double averageMpg, boolean electric, double maxHeight, String planetOrigin, String propulsion, String frame) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, averageMpg, electric);
        this.maxHeight = maxHeight;
        this.planetOrigin = planetOrigin;
        this.propulsion = propulsion;
        this.frame = frame;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        if (maxHeight < 0) {
            throw new IllegalArgumentException("Max height can't be negative");
        }
        this.maxHeight = maxHeight;
    }

    public String getPlanetOrigin() {
        return planetOrigin;
    }

    public void setPlanetOrigin(String planetOrigin) {
        this.planetOrigin = planetOrigin;
    }

    public String getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public void drive() {
        System.out.println("Hovercraft driving.");
    }
}
