package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, "Red", 10.0F, "Diesel");
        Car car = new Car("Hyundai", 4, "Red", 10.0F, "Diesel");
        car.displayInfo();
    }
}