
//	Write a Java Program to reverse the array contents.

package com.array.bll;

import java.util.Scanner;

public class Array015 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers you wants to enter : ");
		int size = input.nextInt();
		int[] numeric = new int[size];
		
		System.out.println("Enter "+size+" numbers : ");
		
		//this loop for store numbers in numeric array
		for(int i=0; i<size; i++)
			numeric[i]=input.nextInt();
		
		System.out.print("Reverse array : ");
		for(int i=size-1; i>=0; i--)
			System.out.print(" "+numeric[i]);
						
		
		input.close();
	}

}
