package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        groceryList.addItem("Strawberries");
        groceryList.addItem("Whatever");
        groceryList.addItem("Peanut Butter");
        groceryList.printGroceryList();
        groceryList.modifyGroceryItem(1, "Popcorn");
        groceryList.printGroceryList();
        groceryList.removeGroceryItem(0);
        groceryList.printGroceryList();
        groceryList.findItem("hmmm");
        groceryList.findItem("Peanut Butter");
    }
}
