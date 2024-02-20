package com.org.radical.testproject;
import java.lang.*;
import java.util.*;
 
class Demoprimitivedatatypenobject {
    public static void main(String ar[])
    {
        System.out.println("PRIMITIVE DATA TYPES\n");
        int x = 10;
        int y = x;
        System.out.print("Initially: ");
        System.out.println("x = " + x + ", y = " + y);
 
     
        y = 30;
 
        System.out.print("After changing y to 30: ");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println(
            "**Only value of y is affected here "
            + "because of Primitive Data Type\n");
        System.out.println("REFERENCE DATA TYPES\n");
        int[] c = { 10, 20, 30, 40 };
 
       
        int[] d = c;
 
        System.out.println("Initially");
        System.out.println("Array c: "
                           + Arrays.toString(c));
        System.out.println("Array d: "
                           + Arrays.toString(d));
 
        
        System.out.println("\nModifying the value at "
                           + "index 1 to 50 in array d\n");
        d[1] = 50;
 
        System.out.println("After modification");
        System.out.println("Array c: "
                           + Arrays.toString(c));
        System.out.println("Array d: "
                           + Arrays.toString(d));
        System.out.println(
            "**Here value of c[1] is also affected "
            + "because of Reference Data Type\n");
    }
}