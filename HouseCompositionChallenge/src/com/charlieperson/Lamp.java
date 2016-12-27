package com.charlieperson;

public class Lamp {
    private boolean on;

    public void switchLight() {
        this.on = !this.on;
        String onOrOff = this.on ? "on" : "off";
        System.out.println("You've turned the lights " + onOrOff);
    }
}
