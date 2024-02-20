package com.org.radical.testproject;
import java.io.*; 
import java.util.LinkedList; 
public class Demoindexof {
	 public static void main(String args[]) { 
		  
	      // Creating an empty LinkedList 
	      LinkedList<String> list = new LinkedList<String>(); 
	  
	      // Use add() method to add elements in the list 
	      list.add("Gel"); 
	      list.add("for"); 
	      list.add("Geeks"); 
	      list.add("10"); 
	      list.add("20"); 
	  
	      // Displaying the list 
	      System.out.println("LinkedList:" + list); 
	        
	      // The first position of an element  
	      // is returned 
	      System.out.println("The first occurrence of Geeks is at index:" 
	                                              + list.indexOf("Gel")); 
	      System.out.println("The first occurrence of 10 is at index: "  
	                                               + list.indexOf("10")); 

}
}
