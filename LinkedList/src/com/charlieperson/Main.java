package com.charlieperson;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Chuck", 342.43);
	    Customer anotherCustomer;
	    anotherCustomer = customer;
	    anotherCustomer.setBalance(32.3);
        System.out.println("balance for customer " + customer.getName() + " is " + customer.getBalance());

		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(3);
		intList.add(3423);
		intList.add(5688);

		for(int i=0; i<intList.size(); i++) {
			System.out.println(i + " = " + intList.get(i));
		}

		intList.add(1,2);
		System.out.println(intList);
	}
}
