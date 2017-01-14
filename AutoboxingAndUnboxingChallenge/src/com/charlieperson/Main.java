package com.charlieperson;

public class Main {

    public static void main(String[] args) {
	    Bank bOfA = new Bank("Bank of America");
	    Branch bitchAss = new Branch("bitchAss");
	    bOfA.addBranch(bitchAss);
		System.out.println(bOfA.getBranches());
	    Customer charlie = new Customer("Charlie");
		System.out.println(charlie.getName());
	    bOfA.addCustomer(bitchAss, charlie);
	    bitchAss.addCustomer(charlie);
		System.out.println(bitchAss.getCustomers());
    }
}
