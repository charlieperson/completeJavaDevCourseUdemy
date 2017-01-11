package com.charlieperson;

import java.util.Scanner;

public class Main {
    private static Scanner scanner  = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        printInstructions();
        boolean quit = false;

        while(!quit) {
            System.out.println("What would you like to do?");
            int choice = scanner.nextInt();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    displayContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print your contact list.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To modify a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact() {
        System.out.println("What's the name of the new contact?");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Number?");
        String number = scanner.nextLine();
        mobilePhone.createContact(name, number);
    }

    public static void displayContacts() {
        mobilePhone.viewContacts();
    }

    public static void removeContact() {
        System.out.println("Which contact would you like to remove?");
        scanner.nextLine();
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }
}
