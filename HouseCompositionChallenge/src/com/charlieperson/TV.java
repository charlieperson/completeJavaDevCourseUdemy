package com.charlieperson;

public class TV {
    private boolean pluggedIn;
    private boolean on;
    private int channel;
    private int volume;

    TV() {
        this.pluggedIn = false;
        this.on = false;
    }

    public void plugIn() {
        this.pluggedIn = true;
        System.out.println("TV has been plugged in");
    }

    public void pressPowerButton() {
        if(pluggedIn) {
            if(this.on) {
                this.on = false;
                System.out.println("Power has been turned off");
            } else {
                this.on = true;
                System.out.println("Power has been turned on");
            }
        } else {
            this.on = false;
            System.out.println("TV must be plugged in before it can be turned on");
        }
    }

    public void changeChannel(int channel) {
        if(pluggedIn) {
            this.channel = channel;
            System.out.println("You are now watching channel " + this.channel);
        } else {
            System.out.println("TV must be plugged in before you can change the channel");
        }
    }

    public void changeVolume(int amount) {
        if(pluggedIn) {
            if(this.volume + amount <= 0) {
                this.volume = 0;
            } else if(this.volume + amount >= 100) {
                this.volume = 100;
            } else {
                this.volume = this.volume + amount;
            }
            System.out.println("Volume is now at " + this.volume);

        } else {
            System.out.println("TV must be plugged in before you can change the volume");
        }
    }
}
