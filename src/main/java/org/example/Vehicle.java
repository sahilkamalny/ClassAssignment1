package org.example;

public class Vehicle {
    protected int numberOfWheels;
    protected String color;
    protected float engineSize;
    protected String fuelType;

    public Vehicle() {
        numberOfWheels = 0;
        color = "";
        engineSize = 0;
        fuelType = "";
    }

    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }
}