package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        HealthyBurger healthyBurger = new HealthyBurger("Tofu...");
        System.out.println(healthyBurger.getTotal());
        healthyBurger.addBacon();
        System.out.println(healthyBurger.getTotal());
        healthyBurger.addCheese();
        System.out.println(healthyBurger.getTotal());
        healthyBurger.addLettuce();
    }
}
