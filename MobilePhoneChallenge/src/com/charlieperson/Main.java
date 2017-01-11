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
                case 4:
                    establishWhichContactToModify();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print your contact list.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To remove a contact.");
        System.out.println("\t 4 - To modify a contact.");
        System.out.println("\t 5 - Search for a contact.");
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

    public static void establishWhichContactToModify() {
        System.out.println("Which contact would you like to modify?");
        scanner.nextLine();
        String name = scanner.nextLine();
        if(isValidContact(name)){
            System.out.println("Okay. Would you like to modify " + name + "'s name or number?");
            String nameOrNumber = chooseNameOrNumber();
            modifyContact(name, nameOrNumber);
        } else {
            System.out.println("Sorry- that's not a valid contact.");
        }
    }

    public static void modifyContact(String name, String nameOrNumber) {
        System.out.println("Please enter the new " + nameOrNumber + " for " + name);
        String newNameOrNumber = scanner.nextLine();
        if(nameOrNumber.equals("name")) {
            mobilePhone.updateName(name, newNameOrNumber);
        } else {
            mobilePhone.updateNumber(name, newNameOrNumber);
        }
    }

    public static void searchForContact() {
        System.out.println("What's the name of the contact you'd like to search for?");
        scanner.nextLine();
        String name = scanner.nextLine();
        if(mobilePhone.searchForContact(name) != null) {
            System.out.println(name + "'s number is " + mobilePhone.searchForContact(name));
        } else {
            System.out.println("Not a valid contact.");
        }
    }

    private static boolean isValidContact(String name) {
        return mobilePhone.isValidContact(name);
    }

    private static String chooseNameOrNumber() {
        boolean valid = false;
        String nameOrNumber = "invalid";

        while(!valid) {
            nameOrNumber = scanner.nextLine();
            if(nameOrNumber.equals("name") || nameOrNumber.equals("number")) {
                valid = true;
            } else {
                System.out.println("Sorry... that's invalid. Please write either name or number. Try again.");
            }
        }
        return nameOrNumber;
    }
}
