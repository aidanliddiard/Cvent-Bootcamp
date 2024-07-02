package org.example;

public class Car extends Vehicle{
    private boolean cassetPlayer;
    private boolean handsFree;
    private boolean manual;
    private boolean hatchback;
    private boolean leatherSeat;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double averageMpg, boolean electric, boolean cassetPlayer, boolean handsFree, boolean manual, boolean hatchback, boolean leatherSeat) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, averageMpg, electric);
        this.cassetPlayer = cassetPlayer;
        this.handsFree = handsFree;
        this.manual = manual;
        this.hatchback = hatchback;
        this.leatherSeat = leatherSeat;
    }

    public boolean isCassetPlayer() {
        return cassetPlayer;
    }

    public void setCassetPlayer(boolean cassetPlayer) {
        this.cassetPlayer = cassetPlayer;
    }

    public boolean isHandsFree() {
        return handsFree;
    }

    public void setHandsFree(boolean handsFree) {
        this.handsFree = handsFree;
    }

    public boolean isManual() {
        return manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public boolean isHatchback() {
        return hatchback;
    }

    public void setHatchback(boolean hatchback) {
        this.hatchback = hatchback;
    }

    public boolean isLeatherSeat() {
        return leatherSeat;
    }

    public void setLeatherSeat(boolean leatherSeat) {
        this.leatherSeat = leatherSeat;
    }

    @Override
    public void drive() {
        System.out.println("Car driving.");
    }
}
