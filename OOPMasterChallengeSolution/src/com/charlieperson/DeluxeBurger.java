package com.charlieperson;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Bacon and Sausage", 10.55, "Mighty Wheat");
        super.addAddition1("Chips", 4.50);
        super.addAddition2("Drink", 4.50);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("I'm sorry- you can't add additions to a deluxe burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("I'm sorry- you can't add additions to a deluxe burger");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("I'm sorry- you can't add additions to a deluxe burger");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("I'm sorry- you can't add additions to a deluxe burger");
    }
}
