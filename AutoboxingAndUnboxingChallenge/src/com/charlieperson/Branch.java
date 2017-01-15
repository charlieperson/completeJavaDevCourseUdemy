package com.charlieperson;

import java.util.ArrayList;
import java.util.Iterator;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private String name;

    public Branch(String name) {
        this.name = name;
        System.out.println("New branch created!");
    }

    public boolean addCustomer(Customer customer) {
        for (int i=0; i<this.customers.size(); i++) {
            if(this.customers.get(i) == customer) {
                System.out.println("Customer already exists!");
                return false;
            }
        }

        this.customers.add(customer);
        System.out.println("Customer added successfully!");
        return true;
    }

    public boolean addTransaction(Customer customer, Double amount) {
        for(int i=0; i<this.customers.size(); i++) {
            if(this.customers.get(i) == customer) {
                customer.addTransaction(amount);
                System.out.println("Customer transaction added....");
                return true;
            }
        }
        System.out.println("Customer ain't in the system...");
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
