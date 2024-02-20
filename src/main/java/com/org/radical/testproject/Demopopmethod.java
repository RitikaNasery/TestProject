package com.org.radical.testproject;
import java.util.LinkedList;

public class Demopopmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> stack = new LinkedList<>();

	stack.push("ABC");
	stack.push("for");
	String s = stack.pop();
	System.out.println(s);
	stack.push("XYZ");
	System.out.println(stack);
	}

}
