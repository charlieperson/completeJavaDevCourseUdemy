package com.charlieperson;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
	    Album album1 = new Album("Boo Boo", "MoneyTown");
	    album1.addSong("Waa Waa Pedal", 3.21);
	    album1.addSong("Ayyyy", 4.56);
	    album1.addSong("MmmmHmmm", 1.49);
	    album1.addSong("Get it now!", 5.19);
        album1.addSong("Rubber!", 3.14);
        album1.addSong("Duck", 4.19);
        album1.addSong("Rabbit Hole", 5.25);
        album1.addSong("", 2.49);

        albums.add(album1);

        Album album2 = new Album("Mister big", "Lovely");
        album2.addSong("Lego", 3.21);
        album2.addSong("You got this", 4.56);
        album2.addSong("Yes you can", 1.49);
        album2.addSong("I love you", 5.19);
        album2.addSong("Yes sir!", 5.19);
        album2.addSong("All day", 5.19);
        album2.addSong("All night", 5.19);
        album2.addSong("Go for it", 5.19);

        albums.add(album2);

        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addToPlaylist("Ayyyy", playlist);
        albums.get(0).addToPlaylist("Get it now!", playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist("All night", playlist);

        play(playlist);

    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in playlist.");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        printMenu();

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Thanks for listening");
                    quit = true;
                    break;

                case 1:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("This is the beginning of this playlist.");
                        forward = true;
                    }
                    break;
                case 2:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("You've reached the end of this playlist.");
                        forward = false;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the end of the list.");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;

            }
        }
    }

    public static void printMenu() {
        System.out.println("0 - quit");
        System.out.println("1 - play next song");
        System.out.println("2 - play previous song");
        System.out.println("3 - replay current song");
        System.out.println("4 - print playlist");
        System.out.println("5 - print available actions");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("===============");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===============");
    }


}
