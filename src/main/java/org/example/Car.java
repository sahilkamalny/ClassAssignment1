package org.example;

public class Car extends Vehicle {
    private String brand;

    public Car() {
        brand = "";
        numberOfWheels = 0;
        color = "";
        engineSize = 0;
        fuelType = "";
    }

    public Car(String brand, int numberOfWheels, String color, float engineSize, String fuelType) {
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine size: " + getEngineSize());
        System.out.println("Fuel type: " + getFuelType());
    }
}