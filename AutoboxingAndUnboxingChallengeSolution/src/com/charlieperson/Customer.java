package com.charlieperson;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
