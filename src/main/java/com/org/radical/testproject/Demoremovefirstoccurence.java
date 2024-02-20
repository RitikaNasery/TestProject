package com.org.radical.testproject;
import java.util.LinkedList;
public class Demoremovefirstoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.addLast("one");
		list.addLast("two");
		list.addLast("three");
		list.addLast("one");
		
		System.out.print("List before removing the "+  "first Occurrence of \"one\" : ");
		 System.out.println(list);
		 boolean returnValue = list.removeFirstOccurrence("one");
		 System.out.println("REturned value:" + returnValue);
		 System.out.print("List after removing the"+
                 " first Occurrence of \"one\" : ");
	
	System.out.println(list);

}
}