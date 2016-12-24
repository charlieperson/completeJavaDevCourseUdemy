package com.charlieperson;

public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this(0, 0.0, "Default Name", "Default email", "000");
    }

    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        System.out.println("$" + amount + " added to balance of $" + this.balance);
        this.balance += amount;
        System.out.println("Balance is now: $" + this.balance);
    }

    public void withdrawal(double amount) {
        if(this.balance - amount > 0) {
            System.out.println("Withdrawing $" + amount + " from $" + this.balance);
            this.balance -= amount;
            System.out.println("Balance is now: $" + this.balance);
        } else {
            System.out.println("Sorry mate- " +
                    "You only have $" + this.balance +
                    " but you tried to take out: $" + amount);
        }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
