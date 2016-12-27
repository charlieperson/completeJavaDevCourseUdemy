package com.charlieperson;

public class Ferrari extends Car {
    private boolean turboCharged;
    private boolean butterflyDoors;

    public Ferrari(String color, boolean automatic, boolean turboCharged, boolean butterflyDoors) {
        super(color, 4, 2, "Ferrari", automatic);
        this.turboCharged = turboCharged;
        this.butterflyDoors = butterflyDoors;
    }

    public void fourWheelDrive() {
        System.out.println("Ferrari.fourWheelDrive called.");
    }


}
