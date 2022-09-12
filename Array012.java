/*
 *	Write a Java program to compute the average value of an array of 
 	integers except the largest and smallest values. 
 */

package com.array.bll;

public class Array012 {
	
public static void main(String[] args) {
		
		int[] numarray = new int[]{ 3,1,2,4};
		
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
			}//end inner for loop	
		}//end outer for loop
		
		int sum=0; //sum variable create for add all values of an array
		for(int i=1; i<numarray.length-1; i++)
		{
			sum+=numarray[i];
		}
		
		System.out.println("Average value of all numbers : "+(double)sum/numarray.length);
		
		
		System.out.println("Smallest value : "+numarray[0]);
		System.out.println("Largest value : "+numarray[numarray.length-1]);
		
		

	}


}
