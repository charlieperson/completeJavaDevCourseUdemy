package com.charlieperson;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

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
	    playlist.addToQueue("Shake It", "Whatever");
	    playlist.addToQueue("Shake It", "Burnin' down the house");
		playlist.addToQueue("Shake It", "Who let the dogs out?");
	    playlist.printQueue();
	    startListening(playlist);
    }

    public static void startListening(Playlist playlist) {
    	printInstructions();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<Song> listIterator = playlist.getQueue().listIterator();

		while(!quit) {
			System.out.println("What would you like to do?");
			int choice = scanner.nextInt();
			switch(choice) {
				case 1:
					printInstructions();
					break;
				case 2:
					if(!listIterator.hasNext()) goingForward = false;
					if(goingForward) {
						goingForward = false;
						listIterator.previous();
					}
					if(listIterator.hasPrevious()) {
						System.out.println("You are now listening to " + listIterator.previous().getTitle());
					} else {
						System.out.println("This is the first song in the playlist");
					}
					break;
				case 3:
					if(!listIterator.hasPrevious()) goingForward = true;
					if(!goingForward) {
							goingForward = true;
							listIterator.next();
						}
					if(listIterator.hasNext()) {
							System.out.println("You are now listening to " + listIterator.next().getTitle());
						} else {
							System.out.println("You've reached the end of the playlist");
						}
					break;
				case 4:
					if(listIterator.hasPrevious()) {
						listIterator.previous();
						System.out.println("Replaying " + listIterator.next().getTitle());
					} else {
						System.out.println("Replaying " + listIterator.next().getTitle());
					}
					break;
				case 5:
					System.out.println("Current song has been removed.");
					listIterator.remove();
					break;
				case 6:
					quit = true;
					break;
			}
		}

	}

	public static void printInstructions() {
		System.out.println("1- print instructions");
		System.out.println("2- play next song in queue");
		System.out.println("3- play previous song");
		System.out.println("4- replay current song");
		System.out.println("5- remove current song");
		System.out.println("6- stop listening");
	}
}
