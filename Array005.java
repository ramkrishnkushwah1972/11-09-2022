
//	Write a Java program to test if an array contains a specific value.

package com.array.bll;

import java.util.Scanner;

public class Array005 {

		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers you wants to enter : ");
		int size = input.nextInt();
		int[] numeric = new int[size];
		
		System.out.println("Enter "+size+" numbers : ");
		
		//this loop for store numbers in numeric array
		for(int i=0; i<size; i++)
			numeric[i]=input.nextInt();
		
		System.out.println("Enter a number you want to find : ");
		int num = input.nextInt();
		
		boolean b=false;
		for(int i=0; i<size; i++)
		{
			if(num==numeric[i])
			{
				System.out.println(num+" is present in the array ");
				break;
			}
			else
			{
				b=true;
			}
		}
		
		if(b)
			System.out.println(num+" is not present in the array ");

	}
}
