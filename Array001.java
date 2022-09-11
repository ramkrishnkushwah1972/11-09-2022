
/*
 * 	What is the index of Brighton in the following array?
	String[] skiResorts = {"Whistler Blackcomb", "Squaw Valley", "Brighton",
							"Snowmass", "Sun Valley", "Taos"
							};
 */

package com.array.bll;

public class Array001 {
	
	public static void main(String args[]){
		
		String[] skiResorts ={"Whistler Blackcomb", "Squaw Valley", "Brighton",
			    				"Snowmass", "Sun Valley", "Taos"};
		
		boolean b=false;//boolean variable initialization
		
		for(int i=0; i<skiResorts.length; i++)
		{
			if(skiResorts[i]== "Brighton")
			{
				System.out.println("Index of Brighton : "+i);
				break;
			}
			else
				b = true;
		}
		if(!b)
			System.out.println("Not found ");

		System.out.println("Length of Brighton :"+skiResorts.length);
		System.out.println("Index of last item :"+ (skiResorts.length-1));
		System.out.println("Value of skiResorts[4] : "+skiResorts[4]);
	}

}
