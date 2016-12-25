package com.charlieperson;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    VipCustomer() {
        this("Franky Examp", 45, "franky@examp.com");
    }

    VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "default@email.com");
    }

    VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
