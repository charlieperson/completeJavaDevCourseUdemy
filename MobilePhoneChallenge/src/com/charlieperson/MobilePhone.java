package com.charlieperson;

import java.util.ArrayList;

/**
 * Created by charlieperson on 1/11/17.
 */
public class MobilePhone {
    private ContactList contactList = new ContactList();

    public void viewContacts() {
        contactList.displayContacts();
    }

    public void createContact(String name, String number) {
        ContactList.addContact(name, number);
    }

    public void updateExistingContact(String oldName) {
        System.out.println("Would you like to update this");
    }

    public void removeContact(String name) {
        ContactList.removeContact(name);
    }
}
