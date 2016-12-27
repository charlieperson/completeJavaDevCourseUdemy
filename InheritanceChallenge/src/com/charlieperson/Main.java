package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        Ferrari redBeauty = new Ferrari("Red", false, true, true);
        redBeauty.drive(50);
        redBeauty.handSteer();
        redBeauty.changeGears();
    }
}
