package com.charlieperson;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
        System.out.println("New bank created");
    }

    public boolean addBranch(Branch branch) {
        for(Iterator<Branch> i = this.branches.iterator(); i.hasNext();) {
            if(i == branch) {
                System.out.println("Branch already exists...");
                return false;
            }
        }
        this.branches.add(branch);
        return true;
    }

    public void addTransaction(Branch branch, Customer customer, Double transaction) {
        for(Iterator<Branch> i = this.branches.iterator(); i.hasNext();) {
            if(i == branch) {
                branch.addTransaction(customer, transaction);
            }
        }
        System.out.println();
    }

    public void addCustomer(Branch branch, Customer customer) {
        for(Iterator<Branch> i = this.branches.iterator(); i.hasNext();) {
            if(i == branch) {
                if(branch.addCustomer(customer)) {
                    System.out.println(customer.getName() + " added successfully to " + branch.getName());
                } else {
                    System.out.println("Customer already in the system!");
                }
            }
        }
    }

    public void displayCustomers(Branch branch) {
        for(Iterator<Branch> i = this.branches.iterator(); i.hasNext();) {
            if(i == branch) {
                System.out.println(branch.getCustomers());
            }
        }

        System.out.println("Sorry- that branch doesn't exist");
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
