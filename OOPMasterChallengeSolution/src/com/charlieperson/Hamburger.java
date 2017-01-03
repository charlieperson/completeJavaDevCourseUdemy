package com.charlieperson;

/**
 * Created by charlieperson on 1/3/17.
 */
public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1price;

    private String addition2Name;
    private double addition2price;

    private String addition3Name;
    private double addition3price;

    private String addition4Name;
    private double addition4price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1price = price;
    }

    public void addAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2price = price;
    }

    public void addAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3price = price;
    }

    public void addAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4price = price;
    }

    public double itemizeBurger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " burger on a " + this.breadRollType + " roll with " + this.meat +  ", comes out to " + this.price);
        if(this.addition1Name != null) {
            this.price += this.addition1price;
            System.out.println("Added " + this.addition1Name + " for an additional " + this.addition1price);
        }
        if(this.addition2Name != null) {
            this.price += this.addition2price;
            System.out.println("Added " + this.addition2Name + " for an additional " + this.addition2price);
        }
        if(this.addition3Name != null) {
            this.price += this.addition3price;
            System.out.println("Added " + this.addition3Name + " for an additional " + this.addition3price);
        }
        if(this.addition4Name != null) {
            this.price += this.addition4price;
            System.out.println("Added " + this.addition4Name + " for an additional " + this.addition4price);
        }

        return price;
    }
}


































