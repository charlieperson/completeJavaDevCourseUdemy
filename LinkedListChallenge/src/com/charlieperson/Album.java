package com.charlieperson;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;
    private String title;
    private String artist;

    public Album(String title, String artist, ArrayList<Song> songs) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>(songs);
    }

    public Song findSong(String songTitle) {
        for(int i=0; i<this.songs.size(); i++) {
            Song currentSong = this.songs.get(i);
            if(currentSong.getTitle().equals(songTitle)) {
                return currentSong;
            }
        }
        System.out.println("Sorry- " + songTitle + " is not on " + this.title);
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void printSongs() {
        System.out.println("======= Songs on " + this.title + " =======");
        for(int i=0; i<this.songs.size(); i++) {
            System.out.println((i+1) + ": " + this.songs.get(i).getTitle());
        }
    }
}
