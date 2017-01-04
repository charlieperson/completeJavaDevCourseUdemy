package com.charlieperson;

public class Main {

    public static void main(String[] args) {
//	    Hamburger hamburger = new Hamburger("basic", "sausage", 3.56, "white");
//	    hamburger.addAddition1("tomato", 0.50);
//	    hamburger.itemizeBurger();

	    HealthyBurger healthyBurger = new HealthyBurger("turkey", 6.55);
	    healthyBurger.addAddition1("Bacon", 0.45);
	    healthyBurger.addAddition2("tomato", .76);

        System.out.println(healthyBurger.itemizeBurger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.itemizeBurger());
        deluxeBurger.addAddition1("munch", 5);

    }
}
