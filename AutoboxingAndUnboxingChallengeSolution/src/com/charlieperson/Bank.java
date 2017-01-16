package com.charlieperson;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            System.out.println(branchName + "'s customers and their transactions");
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer currentCustomer = branchCustomers.get(i);
                System.out.println(currentCustomer.getName() + ": " + currentCustomer.getTransactions());
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch currentBranch = this.branches.get(i);
            if(currentBranch.getName().equals(branchName)) {
                return currentBranch;
            }
        }

        return null;
    }


}
