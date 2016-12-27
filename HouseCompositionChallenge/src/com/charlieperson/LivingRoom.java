package com.charlieperson;

public class LivingRoom {
    private TV tv;
    private Lamp lamp;
    private Painting painting;

    LivingRoom(TV tv, Lamp lamp, Painting painting) {
        this.painting = painting;
        this.tv = tv;
        this.lamp = lamp;
    }

    public void watchSomeTV() {
        this.tv.plugIn();
        this.tv.pressPowerButton();
        this.tv.changeChannel(44);
        this.tv.changeVolume(30);
    }

    public void hitTheLights() {
        getLamp().switchLight();
    }

    public Lamp getLamp() {
        return lamp;
    }
}
