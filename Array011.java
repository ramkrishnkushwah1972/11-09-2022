/*
 * 	Write a Java program to get the difference between the largest and smallest 
	values in an array of integers. The length of the array must be 1 and above.
 */

package com.array.bll;

public class Array011 {
	
public static void main(String[] args) {
		
		int[] numarray = new int[]{ 75,15,3,2,8,4,1,21,12,1};
		
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
		
		System.out.println("Smallest value : "+numarray[0]);
		System.out.println("Largest value : "+numarray[numarray.length-1]);
		System.out.println("Difference b/w largest no. and smallest no. : "+ (numarray[numarray.length-1]-numarray[0]));
		

	}


}
