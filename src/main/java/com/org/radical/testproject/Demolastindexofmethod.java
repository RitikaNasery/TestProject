package com.org.radical.testproject;
import java.io.*; 
import java.util.LinkedList; 
  
public class Demolastindexofmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        LinkedList<String> list = new LinkedList<String>(); 
        
        
        list.add("Gel"); 
        list.add("for"); 
        list.add("Gel"); 
        list.add("10"); 
        list.add("20"); 
  
         
        System.out.println("LinkedList:" + list); 
  
        
        System.out.println( 
            "Last occurrence of Geeks is at index: "
            + list.lastIndexOf("Gel")); 
        System.out.println( 
            "Last occurrence of 10 is at index: "
            + list.lastIndexOf("10")); 

	}

}
