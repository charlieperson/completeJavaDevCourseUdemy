package com.charlieperson;

/**
 * Created by charlieperson on 12/27/16.
 */
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out!");
        } else {
            System.out.println("Player has taken damage- health is now " + this.health);
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
