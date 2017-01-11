package com.charlieperson;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        printInstructions();
        boolean quit = false;
        int choice = 0;

        while(!quit) {
            System.out.println("What do you want to do?\n");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    searchForItem();
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
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the item: ");
        groceryList.addItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item number\n");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber-1, newItem);
    }

    public static void deleteItem() {
        System.out.println("Which item number would you like removed?\n");
        int itemNumber = scanner.nextInt();
        groceryList.removeGroceryItem(itemNumber-1);
    }

    public static void searchForItem() {
        System.out.println("Which item would you like to search for?\n");
        String item = scanner.nextLine();
        if(groceryList.findItem(item) != null) {
            System.out.println("found item: " + groceryList.findItem(item));
        } else {
            System.out.println(item + " not found");
        }

    }
}
