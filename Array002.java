
//	Write a Java program to sort a numeric array and a string array.

package com.array.bll;
	
public class Array002 {

	public static void main(String[] args) {
		
		int[] numarray ={ 7,15,3,2,8,4,1,21,0,12,1,0};
		String[] strarray = { "Nilesh","Umer","Rk","Rk","Ranu","Yogesh","Nikhil","Aman","Zuli" };
		
		
		for(int i=0; i<numarray.length-1; i++)//for loop for sort int array
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
		
		for(int i=0; i<strarray.length-1; i++)//for loop for sort String array
		{
			for(int j=i;j<strarray.length-1; j++)
			{
//				if(strarray[i].charAt(i)>strarray[j+1].charAt(i+1))
				if(strarray[i].compareTo(strarray[j+1]) > 0)
				{
					String temp=strarray[i];
					strarray[i]=strarray[j+1];
					strarray[j+1]=temp;
					
				}
			}//end inner for loop	
		}//end outer for loop

		System.out.print("\n Sorted Array of Integer :");
		for(int i=0; i<numarray.length-1; i++)
			System.out.print(" "+numarray[i]);
		
		System.out.print("\n Sorted Array of String :");
		for(int i=0; i<strarray.length-1; i++)
			System.out.print(" "+strarray[i]);
	}
}
