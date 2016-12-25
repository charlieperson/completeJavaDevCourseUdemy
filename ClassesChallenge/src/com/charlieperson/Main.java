package com.charlieperson;

public class Main {

    public static void main(String[] args) {
//	    Account chucksAccount = new Account();
//        Account onlyThree = new Account("Fred", "Fred@fred.com", "412-3212-3424");
//        System.out.println(onlyThree.getBalance());
//        System.out.println(chucksAccount.getAccountNumber());
//        System.out.println(chucksAccount.getEmail());
//        chucksAccount.deposit(44.34);
//        chucksAccount.withdrawal(50);
//        chucksAccount.withdrawal(10);
//        Account newAccount = new Account(543432, 77.0, "Dirty Harry", "harry@examp.com", "512-789-5432");
//        System.out.println(newAccount.getAccountNumber());

        VipCustomer mrBigShot = new VipCustomer();
        System.out.println(mrBigShot.getCreditLimit());
        System.out.println(mrBigShot.getEmailAddress());
        System.out.println("-------------------------");
        VipCustomer coupleOfParamsGuy = new VipCustomer("Coka-Cola", 100000);
        System.out.println(coupleOfParamsGuy.getEmailAddress());
        System.out.println(coupleOfParamsGuy.getName());
        System.out.println(coupleOfParamsGuy.getCreditLimit());
        System.out.println("-------------------------");
        VipCustomer allOfEm = new VipCustomer("This guy", 234, "anotha@email.com");
        System.out.println(allOfEm.getCreditLimit());
        System.out.println(allOfEm.getEmailAddress());
        System.out.println(allOfEm.getName());
    }
}
