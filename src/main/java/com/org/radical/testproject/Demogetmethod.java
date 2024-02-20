package com.org.radical.testproject;
import java.io.*; 
import java.util.LinkedList;
public class Demogetmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> inputs = new LinkedList<String>();
		
		inputs.add("ABC");
		inputs.add("PQRS");
		inputs.add("XYZ");
		inputs.add("10");
		inputs.add("20");
		
		System.out.println("The list is " +inputs);
		
		System.out.println("The element is: " + inputs.get(2));
	}

}
