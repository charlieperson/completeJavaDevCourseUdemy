package com.charlieperson;

import java.util.ArrayList;

public class MobilePhone {
    private ContactList contactList = new ContactList();

    public void viewContacts() {
        contactList.displayContacts();
    }

    public void createContact(String name, String number) {
        ContactList.addContact(name, number);
    }

    public void removeContact(String name) {
        contactList.removeContact(name);
    }

    public boolean isValidContact(String name) {
        return contactList.isValidContact(name);
    }

    public void updateName(String name, String newName) {
        contactList.updateName(name, newName);
    }

    public void updateNumber(String name, String newNumber) {
        contactList.updateNumber(name, newNumber);
    }
}
