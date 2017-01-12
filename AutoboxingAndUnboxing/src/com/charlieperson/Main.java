package com.charlieperson;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String[] stringArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Me!");

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        Integer myIntLongWay = new Integer(45);
        Integer myIntShortCut = 45;

        for(int i=0; i<44; i++) {
//            AUTOBOXING
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i=0; i<44; i++) {
//            UNBOXING
            System.out.println(intArrayList.get(i).intValue());
        }


    }
}
