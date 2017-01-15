package com.charlieperson;

public class Main {

    public static void main(String[] args) {
	    Bank bOfA = new Bank("Bank of America");
	    Branch moneyBags = new Branch("money bags");
	    bOfA.addBranch(moneyBags);
		System.out.println(bOfA.getBranches().get(0).getName());
	    Customer charlie = new Customer("Charlie");
	    bOfA.addCustomer(moneyBags, charlie);
		moneyBags.addCustomer(charlie);
		System.out.println(moneyBags.getCustomers().get(0).getName() + " has arrived!");
    }
}
