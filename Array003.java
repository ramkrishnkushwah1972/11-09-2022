
//	Write a Java program to sum values of an array.

package com.array.bll;

import java.util.Scanner;

public class Array003 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] numeric = new int[5];
		
		System.out.println("Enter "+numeric.length+" numbers : ");
		
		//this loop for store numbers in numeric array
		for(int i=0; i<numeric.length; i++)
			numeric[i]=input.nextInt();
		
		int sum=0; //sum variable create for add all values of an array
		for(int i=0; i<numeric.length; i++)
		{
			sum+=numeric[i];
		}
		System.out.println("Sum of all numbers : "+sum);
	}

}
