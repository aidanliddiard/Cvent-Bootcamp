package org.example;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        setYear(year);
        setOdometer(odometer);
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Year must be positive");
        }
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        if (odometer < 0) {
            throw new IllegalArgumentException("Odometer must be positive");
        }
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = getOriginalCost();
        switch(year) {
            case 0, 1, 2, 3:
                value -= value * .03 * year;
                break;
            case 4, 5, 6:
                value -= value * .06 * year;
                break;
            case 7, 8, 9, 10:
                value -= value * .08 * year;
                break;
            default:
                value = 1000;
                break;
        }
        if (odometer > 100000 && !makeModel.contains("Honda") && !makeModel.contains("Toyota") ) {
            value *= -.25;
        }
        return value;
    }


}
