package com.charlieperson;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;

    public Album() {
        this.songs = new ArrayList<>();
    }

    public Song chooseSong(String title) {
        for(int i=0; i<this.songs.size(); i++) {
            Song currentSong = this.songs.get(i);
            if(currentSong.getTitle().equals(title)) {
                return currentSong;
            }
        }
        System.out.println("Sorry- " + title + " is not on THIS album...");
        return null;
    }


}
