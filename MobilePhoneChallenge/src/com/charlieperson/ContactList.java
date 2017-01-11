package com.charlieperson;

import java.util.ArrayList;

/**
 * Created by charlieperson on 1/11/17.
 */
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
}
