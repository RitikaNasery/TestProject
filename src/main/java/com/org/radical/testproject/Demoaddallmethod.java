package com.org.radical.testproject;
import java.security.cert.CollectionCertStoreParameters;
import java.util.*; 
import java.util.LinkedList; 
import java.util.ArrayList;
public class Demoaddallmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> Addition = new LinkedList<String>();
		
		Addition.add("Null");
		Addition.add("Dog");
		Addition.add("Substraction");
		Addition.add("10");
		
		
		Collection<String> ABC = new ArrayList<String>();
		
		ABC.add("10");
		ABC.add("Null");
		ABC.add("White");
		ABC.add("Dog");
		
		System.out.println("The list is " +Addition);
		
		Addition.addAll(ABC);
		
		System.out.println("The new list is " + Addition);
		
				}

}
