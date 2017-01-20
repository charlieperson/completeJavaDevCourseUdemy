package com.charlieperson;

public class Main {

    public static void main(String[] args) {
	    ITelephone chucksPhone = new DeskPhone(23482734);
	    chucksPhone.powerOn();
	    chucksPhone.callPhone(23482734);
	    chucksPhone.answer();

	    chucksPhone = new MobilePhone(234987234);
	    chucksPhone.powerOn();
	    chucksPhone.callPhone(234987234);
	    chucksPhone.answer();

    }
}
