package com.charlieperson;

public class Vehicle {
    private String color;

    Vehicle(String color) {
        this.color = color;
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() called. Vehicle is moving at " + speed);
    }
}
