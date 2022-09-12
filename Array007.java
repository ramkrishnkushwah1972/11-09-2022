
//	Write a Java program to insert an element (specific position) into an array.

package com.array.bll;

import java.util.Scanner;

public class Array007 {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = input.nextInt();
		int[] numeric = new int[size+1];
		
		System.out.println("Enter "+size+" numbers : ");
		
		//this loop for store numbers in numeric array
		for(int i=0; i<size; i++)
			numeric[i]=input.nextInt();
	  
		System.out.println("Enter a position where you want to insert element :");
		int pos = input.nextInt();
		
		System.out.println("Enter a number you want to insert : ");
		int new_num = input.nextInt();
		
	    for(int i= size-1; i>=pos-1; i--)  
	    {  
	    	numeric[i+1]=numeric[i];
	    } 
	    numeric[pos-1]=new_num; // insert new element
	    
	    System.out.print("\nAfter add an element : ");
	    for(int i =0; i<size+1; i++)
	    	System.out.print(" "+numeric[i]);
	   
	    
		input.close();
	}
}
