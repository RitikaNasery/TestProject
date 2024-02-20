package com.org.radical.testproject;
import java.util.LinkedList;

public class Demolinkedlistsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		 

        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grape");
        System.out.println("Original list:");
        System.out.println(list);
        
        int size = list.size();
        System.out.println("Size of list: " + size);

	}

}
