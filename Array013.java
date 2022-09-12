
/*
 *	 Write a Java program to remove the duplicate elements of a 
 	given array and return the new length of the array.
	Sample array: [20, 20, 30, 40, 50, 50, 50]
	After removing the duplicate elements the program should return 4 as the new length of the array. 

 */

package com.array.bll;

import java.util.Scanner;

public class Array013 {
		
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = input.nextInt();
		int[] numeric = new int[size];
		
		System.out.println("Enter "+size+" numbers : ");
		
		//this loop for store numbers in numeric array
		for(int i=0; i<size; i++)
			numeric[i]=input.nextInt();
		
		System.out.println("Size of array before remove duplicate element : "+ size);
		// use nested for loop to find the duplicate elements  
	    for(int i=0; i<size; i++)  
	    {  
	        for (int j=i+1; j<size; j++)  
	        {  
	            // check duplicate element  
	            if (numeric[i] == numeric[j])  
	            {  
	                // delete the current position of the duplicate element  
	                for (int k=j; k<size-1; k++)
	                	numeric[k] = numeric[k+1];  
	                
	                // decrease the size of array after removing duplicate element  
	                size--;  
	                  
	            // if the position of the elements is changes, don't increase the index j  
	                j--;      
	            }// end if  
	        }  
	    }// end outer for loop 
	    System.out.println("\nSize of array after remove duplicate element : "+ size);
	    System.out.print("\nArray after remove duplicate element : ");
	    for(int i =0; i<size; i++)
	    	System.out.print(" "+numeric[i]);
	    
	    
	    
	    
		input.close();
	}

}
