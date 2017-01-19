package com.charlieperson;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Stockholm");
        addInOrder(placesToVisit, "Miami");
        addInOrder(placesToVisit, "Austin");
        addInOrder(placesToVisit, "Gainsville");
        addInOrder(placesToVisit, "Chicago");
        addInOrder(placesToVisit, "Chicago");
        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("===============");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                System.out.println(newCity + " is not new....");
                return false;
            } else if(comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
//                move on to next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        displayOptions();
        System.out.println("You are now in " + listIterator.next());
        while(!quit) {
            System.out.println("What would you like to do?");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayOptions();
                    break;
                case 2:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("You are now in " + listIterator.next());
                    } else {
                        System.out.println("This is the end of the list...");
                    }
                    break;
                case 3:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("You are now in " + listIterator.previous());
                    } else {
                        System.out.println("This is the beginning of the list...");
                    }
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }

    }

    private static void displayOptions() {
        System.out.println("1- print options");
        System.out.println("2- go forward");
        System.out.println("3- go back");
        System.out.println("quit");
    }


}
