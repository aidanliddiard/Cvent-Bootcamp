package org.example;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    private String getRoomType() {
        return roomType;
    }

    private void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    private void getPrice(String roomType, boolean weekend) {
        if (roomType.equals("king")) {
            this.price = 139.00;
        } else if (roomType.equals("double")) {
            this.price = 124.00;
        }
        if (weekend) {
            this.price *= 1.1;
        }
    }

    private int getNumberOfNights() {
        return numberOfNights;
    }

    private void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    private boolean isWeekend() {
        return weekend;
    }

    private void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    private double getReservationTotal(int price, int numberOfNights) {
        double total = 0.0;
        total = numberOfNights * price;
        return total;
    }
}
