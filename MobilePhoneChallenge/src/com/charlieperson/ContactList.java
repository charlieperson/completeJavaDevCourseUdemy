package com.charlieperson;

import java.util.ArrayList;

public class ContactList {
    private static ArrayList<Contact> contacts = new ArrayList<Contact>();

    public static void displayContacts() {
        if(contacts.size() == 0) System.out.println("No contacts");
        for(int i=0; i<contacts.size(); i++) {
            Contact current = contacts.get(i);
            System.out.println((i+1) + ". " + current.getName() + " - " + current.getNumber());
        }
    }

    public static void addContact(String name, String number) {
        Contact contact = new Contact(name, number);
        contacts.add(contact);
    }

    public static void removeContact(String name) {
        int index = findContactIndex(name);
        if(index != -1) {
            contacts.remove(index);
        } else {
            System.out.println("That contact does not exist...");
        }
    }

    private static int findContactIndex(String name) {
        int index = -1;
        for(int i=0; i<contacts.size(); i++) {
            if(contacts.get(i).getName().equals(name)) index = i;
        }
        return index;
    }
}
