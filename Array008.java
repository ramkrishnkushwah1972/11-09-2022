
//	Write a Java program to find the maximum and minimum value of an array.

package com.array.bll;

public class Array008 {
	
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
		
		System.out.println("Minimum value : "+numarray[0]);
		System.out.println("Maximum value : "+numarray[numarray.length-1]);

	}


}
