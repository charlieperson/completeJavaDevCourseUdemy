package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        Bank capitalOne = new Bank("Capital One");
        capitalOne.addBranch("Reggie Miller");
        capitalOne.addCustomer("Reggie Miller", "Chuck P", 100);
        capitalOne.addCustomerTransaction("Reggie Miller", "Chuck P", 500);
        capitalOne.addCustomer("Reggie Miller", "Jessica", 300);
        capitalOne.listCustomers("Reggie Miller");
    }
}
