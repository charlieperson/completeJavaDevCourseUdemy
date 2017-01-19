package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        Bank capitalOne = new Bank("Capital One");
        capitalOne.addBranch("Reggie Miller");
        capitalOne.addCustomer("Reggie Miller", "Chuck P", 100);
        capitalOne.addCustomerTransaction("Reggie Miller", "Chuck P", 500);
        capitalOne.addCustomer("Reggie Miller", "Jessica", 300);
        capitalOne.listCustomers("Reggie Miller");

        capitalOne.addBranch("Melbourne");
        if(!capitalOne.addBranch("Melbourne")) {
            System.out.println("branch is already there boss");
        }

        if(!capitalOne.addCustomer("Reggie Miller", "Chuck P", 100)) {
            System.out.println("customer already exists boss");
        }

        if(!capitalOne.addCustomerTransaction("Reggie Miller", "some dude..", 24423)) {
            System.out.println("that dude aint in this branch boss");
        }

    }
}
