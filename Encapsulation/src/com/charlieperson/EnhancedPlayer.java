package com.charlieperson;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        if(health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.name = name;
        this.hitPoints = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player knocked out!");
        } else {
            System.out.println("Player has taken damage- health is now " + this.hitPoints);
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
