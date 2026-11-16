package com.pluralsight;

public class Vehicle {

    private String model;
    private String color;
    private int topSpeed;
    private int fuelCapacity;
    private int numberofPassengers;

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getNumberofPassengers() {
        return numberofPassengers;
    }

    public void setNumberofPassengers(int numberofPassengers) {
        this.numberofPassengers = numberofPassengers;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private int cargoCapacity;

    public static void startEngine() {
        return;
    }
    public static void stoptEngine() {
        System.out.println("stroom");
    }
    public static void accelerate(){
        System.out.println("vroom vroom");
    }
    public static void brake() {

    }
}
