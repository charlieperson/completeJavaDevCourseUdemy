package com.charlieperson;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private LinkedList<Song> queue;
    private ArrayList<Album> albums;
    private String title;

    public Playlist(String title) {
        this.title = title;
        this.queue = new LinkedList<>();
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public void addToQueue(String albumName, String songName) {
        Album album = findAlbum(albumName);
       if(album != null) {
           Song song = album.findSong(songName);
           if(song != null) this.queue.add(song);
       }
    }

    public Album findAlbum(String albumName) {
        for(int i=0; i<this.albums.size(); i++) {
            Album current = this.albums.get(i);
            if(current.getTitle().equals(albumName)) {
                return current;
            }
        }
        System.out.println("You don't have the album: " + albumName);
        return null;
    }

    public void printQueue() {
        System.out.println("======= Songs in Queue for " + this.title + " =======");
        for(int i=0; i<this.queue.size(); i++) {
            System.out.println((i+1) + ": " + this.queue.get(i).getTitle());
        }
    }

    public void printAlbums() {
        System.out.println("======= Albums to choose from for " + this.title + " =======");
        for(int i=0; i<this.albums.size(); i++) {
            System.out.println((i+1) + ": " + this.albums.get(i).getTitle());
        }
    }
}
