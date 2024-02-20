package com.org.radical.testproject;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList; 
public class Demoaddfirstmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LinkedList<String> sequence = new LinkedList<String>();

sequence.add("One");
sequence.add("two");
sequence.add("three");


System.out.println("the list is" +sequence);

sequence.addFirst("First");
sequence.addFirst("At");

System.out.println("The new list is " +sequence);

	}

}
