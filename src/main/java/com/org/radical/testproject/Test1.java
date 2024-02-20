package com.org.radical.testproject;

import java.util.Scanner;


public class Test1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
float sub1, sub2, sub3, sub4, sub5, sub6;
double total, percentage;
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of all the 6 subjects below");
System.out.println("Enter Sub1 marks");
sub1=sc.nextFloat();
System.out.println("Enter Sub2 marks");
sub2=sc.nextFloat();
System.out.println("Enter Sub3 marks");
sub3=sc.nextFloat();
System.out.println("Enter Sub4 marks");
sub4=sc.nextFloat();
System.out.println("Enter Sub5 marks");
sub5=sc.nextFloat();
System.out.println("Enter Sub6 marks");
sub6=sc.nextFloat();

total= sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
percentage=(total/600*100);

System.out.println("Toatl Marks =" +total);
System.out.println("PErcentage= " +percentage);

if(percentage <40) {
	System.out.println("Fail");
}else if(percentage>40 && percentage <=60) {
	System.out.println("Second class");
	
	
}else if(percentage > 60 && percentage <=75) {
	System.out.println("First class");
}else {
	System.out.println("Distinction");
}
	}
}



