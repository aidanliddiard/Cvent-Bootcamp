package org.example;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        setCondition(condition);
        setSquareFoot(squareFoot);
        setLotSize(lotSize);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        if (condition > 4 || condition < 1) {
            throw new IllegalArgumentException("Condition must be between 1 and 4");
        }
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        if (squareFoot < 0) {
            throw new IllegalArgumentException("Square feet must be positive");
        }
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        if (lotSize < 0) {
            throw new IllegalArgumentException("Lot size must be positive");
        }
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double value = .25 * lotSize;
        switch(condition) {
            case 1:
                value += 180 * squareFoot;
                break;
            case 2:
                value += 130 * squareFoot;
                break;
            case 3:
                value += 90 * squareFoot;
                break;
            case 4:
                value += 80 * squareFoot;
                break;
        }
        return value;
    }

}
