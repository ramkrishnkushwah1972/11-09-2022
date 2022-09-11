
//	Write a Java program to calculate the average value of array elements.

package com.array.bll;

import java.util.Scanner;

public class Array004 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] numeric = new int[4];
		
		System.out.println("Enter "+numeric.length+" numbers : ");
		
		//this loop for store numbers in numeric array
		for(int i=0; i<numeric.length; i++)
			numeric[i]=input.nextInt();
		
		int sum=0; //sum variable create for add all values of an array
		for(int i=0; i<numeric.length; i++)
		{
			sum+=numeric[i];
		}
		System.out.println("Average value of all numbers : "+(double)sum/numeric.length);

	}

}
