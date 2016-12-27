package com.charlieperson;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private String manufacturer;
    private boolean automatic;

    public Car(String color, int wheels, int doors, String manufacturer, boolean automatic) {
        super(color);
        this.wheels = wheels;
        this.doors = doors;
        this.manufacturer = manufacturer;
        this.automatic = automatic;
    }

    private void pushDownGasPedal() {
        System.out.println("Car.pushDownGasPedal() called.");
    }

    private void turnWheels() {
        System.out.println("Car.turnWheels() called.");
    }

    private void putInClutch(){
        System.out.println("Car.putInClutch() called");
    }

    public void changeGears() {
        System.out.println("Car.changeGears() called.");
        if(automatic) {
            System.out.println("Automatic- gear changed");
        } else {
            putInClutch();
            System.out.println("Manuel- gear changed");
        }
    }

    public void drive(int speed) {
        pushDownGasPedal();
        turnWheels();
        System.out.println("Car.drive() called.");
        move(speed);
    }

    public void handSteer() {
        System.out.println("Car.handSteer() called.");
    }
}
