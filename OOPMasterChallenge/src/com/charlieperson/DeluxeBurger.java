package com.charlieperson;

public class DeluxeBurger extends Hamburger {
    private int basePrice = 333333;

    public DeluxeBurger(String breadRoll, String meat) {
        super(breadRoll, meat);
        this.addDrink();
        this.addChips();
    }

    public int getTotal() {
        return calculateAddOns() + this.getBasePrice();
    }

    @Override
    public void addLettuce() {
        System.out.println("Sorry mate- no add ons with the deluxe!!");
    }

    @Override
    public void addTomato() {
        System.out.println("Sorry mate- no add ons with the deluxe!!");
    }

    @Override
    public void addOnion() {
        System.out.println("Sorry mate- no add ons with the deluxe!!");
    }

    @Override
    public void addBacon() {
        System.out.println("Sorry mate- no add ons with the deluxe!!");
    }

    @Override
    public void addCheese() {
        System.out.println("Sorry mate- no add ons with the deluxe!!");
    }

    @Override
    public int getBasePrice() {
        return basePrice;
    }
}
