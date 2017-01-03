package com.charlieperson;

public class Main {

    public static void main(String[] args) {
//        DeluxeBurger deluxeBurger = new DeluxeBurger("Wheat", "Angus beef");
//        System.out.println(deluxeBurger.getTotal());
            HealthyBurger healthyBurger = new HealthyBurger("pig butt");
            healthyBurger.addLettuce();
            healthyBurger.displayPriceBreakdown();
            Hamburger hamburger = new Hamburger("hawaien", "sausage");
            hamburger.displayPriceBreakdown();
            DeluxeBurger deluxeBurger = new DeluxeBurger("wheat", "string beef");
            deluxeBurger.addCheese();
            deluxeBurger.displayPriceBreakdown();

    }
}
