package com.org.radical.testproject;
import java.util.ArrayList;
public class Updateinarraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String>abc = new ArrayList<String>();
		abc.add("John");
	    abc.add("Jane");
	    abc.add("Doe");
	    
	    abc.set(0,"Jade");
	    
	    System.out.println(abc);
		
	}

}
