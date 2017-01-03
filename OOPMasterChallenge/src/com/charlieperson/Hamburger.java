package com.charlieperson;

public class Hamburger {
    private int price;
    private String breadRoll;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean bacon;
    private boolean cheese;

    public Hamburger(String breadRoll, String meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = 450;
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

    private int calculateAddOns() {
      int total = 0;
      if(this.lettuce) total += 25;
      if(this.tomato) total += 50;
      if(this.onion) total += 50;
      if(this.bacon) total += 100;
      if(this.cheese) total += 50;
      return total;
    }

    public int getTotal() {
        System.out.println("Your " + this.meat + " burger on " + this.breadRoll + " with ");
        if(this.bacon) System.out.println(" bacon ");
        if(this.cheese) System.out.println(" cheese ");
        if(this.lettuce) System.out.println(" lettuce ");
        if(this.onion) System.out.println(" onion ");
        System.out.println("comes out to a total of " + (450 + calculateAddOns()));
        return 450 + calculateAddOns();
    }
}
