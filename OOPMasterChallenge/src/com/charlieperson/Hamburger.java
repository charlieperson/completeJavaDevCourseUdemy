package com.charlieperson;

public class Hamburger {
    private int basePrice = 450;
    private String breadRoll;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean bacon;
    private boolean cheese;
    private boolean chips;
    private boolean drink;

    public Hamburger(String breadRoll, String meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
    }

    public void addLettuce() {
        this.lettuce = true;
    }

    public void addTomato() {
        this.tomato = true;
    }

    public void addOnion() {
        this.onion = true;
    }

    public void addBacon() {
        this.bacon = true;
    }

    public void addCheese() {
        this.cheese = true;
    }

    public void addChips() {
        this.chips = true;
    }

    public void addDrink() {
        this.drink = true;
    }

    public int calculateAddOns() {
      int total = 0;
      if(this.lettuce) total += 25;
      if(this.tomato) total += 50;
      if(this.onion) total += 50;
      if(this.bacon) total += 100;
      if(this.cheese) total += 50;
      if(this.drink) total += 100;
      if(this.chips) total += 100;
      return total;
    }

    public int getTotal() {
        return 450 + calculateAddOns();
    }

    public void displayPriceBreakdown() {
        System.out.println("You're " + this.getMeat() + " burger at " + this.getBasePrice() + " on " + this.getBreadRoll() + " with ");
        if(this.isBacon()) System.out.println("bacon at 100, ");
        if(this.isCheese()) System.out.println("cheese at 50, ");
        if(this.isLettuce()) System.out.println("lettuce at 25, ");
        if(this.isOnion()) System.out.println("onion at 50, ");
        if(this.isTomato()) System.out.println("tomato at 50, ");
        if(this.isChips()) System.out.println("chips at 100, ");
        if(this.isDrink()) System.out.println("and a drink at 100,");
        System.out.println(" comes out to a total of " + (getTotal()));
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isDrink() {
        return drink;
    }

    public int getBasePrice() {
        return basePrice;
    }
}
