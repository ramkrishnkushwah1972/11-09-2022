
//	Write a Java program to find the second largest element in an array.

package com.array.bll;

import java.util.Scanner;

public class Array010 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers you wants to enter : ");
		int size = input.nextInt();
		int[] numeric = new int[size];
		
		System.out.println("Enter "+size+" numbers : ");
		
		int[] numarray = new int[size];
		//this loop for store numbers in numeric array
		for(int i=0; i<size; i++)
			numarray[i]=input.nextInt();
		
		for(int i=0; i<numarray.length-1; i++)
		{
			for(int j=i;j<numarray.length-1; j++)
			{
				if(numarray[i]>numarray[j+1])
				{
					int temp=numarray[i];
					numarray[i]=numarray[j+1];
					numarray[j+1]=temp;
					
				}
			}	
		}
		
		System.out.println("Second Largest number : "+numarray[numarray.length-2]);
		

		input.close();
	}


}
