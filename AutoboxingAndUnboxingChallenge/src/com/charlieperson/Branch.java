package com.charlieperson;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private String name;

    public Branch(String name) {
        this.name = name;
    }

    public void addCustomer(String name, Double initialTransaction) {
        Customer newCustomer = new Customer(name);
        newCustomer.addTransaction(initialTransaction);
    }

    public boolean addTransaction(Customer customer, Double amount) {
        for(int i=0; i<this.customers.size(); i++) {
            if(this.customers.get(i) == customer) {
                customer.addTransaction(amount);
                return true;
            }
        }
        return false;
    }
}
