package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom(new TV(), new Lamp(), new Painting("Flowers", "Van Gough"));
        livingRoom.watchSomeTV();
        livingRoom.hitTheLights();
        livingRoom.hitTheLights();
    }
}
