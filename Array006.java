
//	Write a Java program to remove a specific element from an array.

package com.array.bll;

import java.util.Scanner;

public class Array006 {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = input.nextInt();
		int[] numeric = new int[size];
		
		System.out.println("Enter "+size+" numbers : ");
		
		//this loop for store numbers in numeric array
		for(int i=0; i<size; i++)
			numeric[i]=input.nextInt();
	  
		System.out.println("Enter a number you wants to delete :");
		int num = input.nextInt();
		
	    for(int i=0; i<size; i++)  
	    {  
	        for (int j=i+1; j<size; j++)  
	        {    
	            if (num == numeric[j])  
	            {  
	                // delete the current position  
	                for (int k=j; k<size-1; k++)
	                	numeric[k] = numeric[k+1];  
	                
	                // decrease the size of array after removing element  
	                size--;  
	                  
	                // if the position of the elements is changes, don't increase the index j  
	                j--;      
	            }// end if  
	        }  
	    }// end outer for loop 
	    
	    System.out.print("\nArray after remove specific element : ");
	    for(int i =0; i<size; i++)
	    	System.out.print(" "+numeric[i]);
	   
	    
		input.close();
	}
}
