package com.charlieperson;

public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

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
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
