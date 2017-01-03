package com.charlieperson;

public class HealthyBurger extends Hamburger {
    private int numOfAddOns = 0;

    public HealthyBurger(String meat) {
        super("brown rye", meat);
    }

    private boolean validateAddOn() {
        if(this.numOfAddOns >= 2) {
            System.out.println("Sorry dude- only two add ons for the healthy burgers");
            return false;
        } else {
            this.numOfAddOns += 1;
            return true;
        }
    }

    @Override
    public void addLettuce() {
        if(validateAddOn()) super.addLettuce();
    }

    @Override
    public void addTomato() {
        if(validateAddOn()) super.addTomato();
    }

    @Override
    public void addOnion() {
        if(validateAddOn()) super.addOnion();
    }

    @Override
    public void addBacon() {
        if(validateAddOn()) super.addBacon();
    }

    @Override
    public void addCheese() {
        if(validateAddOn()) super.addCheese();
    }
}
