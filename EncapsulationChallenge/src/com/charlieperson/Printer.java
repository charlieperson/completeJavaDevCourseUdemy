package com.charlieperson;

public class Printer {
    private int tonerLevel = 0;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(boolean duplex) {
        this.duplex = duplex;
    }

    public void fillToner(int amount) {
        if (this.tonerLevel >= 100) {
            System.out.println("Toner is already full.");
        } else if (this.tonerLevel + amount >= 100) {
            this.tonerLevel = 100;
            System.out.println("Toner filled to " + this.tonerLevel);
        } else {
            this.tonerLevel += amount;
            System.out.println("Toner filled to " + this.tonerLevel);
        }
    }

    public void print(int numberOfPages) {
        if(!this.duplex){
            for(int i=0; i<numberOfPages; i++) {
                if(this.tonerLevel >= 1) {
                    this.tonerLevel -= 1;
                    this.pagesPrinted += 1;
                    System.out.println("Just printed a one-sided page!");
                    System.out.println("Toner level: " + this.tonerLevel);
                    System.out.println("Total pages printed: " + this.pagesPrinted);
                } else {
                    System.out.println("Sorry mate- not enough toner for this one-sided page!");
                    break;
                }
            }
        } else {
            for(int i=0; i<numberOfPages; i+=2) {
                if(this.tonerLevel >= 2) {
                    this.tonerLevel -= 2;
                    this.pagesPrinted += 1;
                    System.out.println("Just printed a two sided page!");
                    System.out.println("Toner level: " + this.tonerLevel);
                    System.out.println("Total pages printed: " + this.pagesPrinted);
                } else {
                    System.out.println("Sorry mate- not enough toner for this two-sided page!");
                    break;
                }
            }
        }


    }
 }
