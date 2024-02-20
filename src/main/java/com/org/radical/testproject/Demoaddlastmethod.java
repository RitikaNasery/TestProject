package com.org.radical.testproject;
import java.io.*;
import java.util.LinkedList;
public class Demoaddlastmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> sequence = new LinkedList<String>();
	sequence.add("One");
	sequence.add("two");
	sequence.add("three");
	sequence.add("10");
	sequence.add("20");
	
	
	System.out.println("The list is " +sequence);
	
	sequence.addLast("100");
	sequence.addLast("Done");
	
	System.out.println("The new list is" +sequence );

	}

}
