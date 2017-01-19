package com.charlieperson;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Playlist playlist = new Playlist("Monkey Town");
        ArrayList<Song> songList = new ArrayList<Song>();
        songList.add(new Song("Your song", 3.43));
        songList.add(new Song("Who let the dogs out?", 3.43));
        songList.add(new Song("Whatever", 5.32));
	    songList.add(new Song("Burnin' down the house", 3.32));
	    Album shakeIt = new Album("Shake It", "Stevie Ray", songList);
	    shakeIt.printSongs();
	    playlist.addAlbum(shakeIt);
	    playlist.printAlbums();
	    playlist.addToQueue("Shake It", "Your song");
	    playlist.addToQueue("not an album name", "Whatever");
	    playlist.addToQueue("Shake It", "Not a valid song name");
	    playlist.printQueue();
    }
}
