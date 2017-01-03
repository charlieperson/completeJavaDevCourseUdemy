package com.charlieperson;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("basic", "sausage", 3.56, "white");
	    hamburger.addAddition1("tomato", 0.50);
	    hamburger.itemizeBurger();
    }
}
