package com.charlieperson;

public class Main {

    public static void main(String[] args) {
	    Account chucksAccount = new Account();
        Account onlyThree = new Account("Fred", "Fred@fred.com", "412-3212-3424");
        System.out.println(onlyThree.getBalance());
        System.out.println(chucksAccount.getAccountNumber());
        System.out.println(chucksAccount.getEmail());
        chucksAccount.deposit(44.34);
        chucksAccount.withdrawal(50);
        chucksAccount.withdrawal(10);
        Account newAccount = new Account(543432, 77.0, "Dirty Harry", "harry@examp.com", "512-789-5432");
        System.out.println(newAccount.getAccountNumber());
    }
}
