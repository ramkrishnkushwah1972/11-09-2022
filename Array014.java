
/*
 * 	Write a Java program to replace every element with the next 
  	greatest element (from right side) in the given array of integers.
 */

package com.array.bll;

public class Array014{
 
    public static void main (String[] args)
    {
        int arr[] = {11, 117, 41, 1, 2, 90};
             
        int size = arr.length;
        // Initialize the next greatest element
        int max_from_right =  arr[size-1];

        // last element is always -1
        arr[size-1] = -1;
 
        // Replace all other elements with the next greatest
        for (int i = size-2; i >= 0; i--)
        {
            // updating the next greatest element)
            int temp = arr[i];
            // Replace current element with the next greatest
            arr[i] = max_from_right;
 
            // Update the greatest element, if needed
            if(max_from_right < temp)
            max_from_right = temp;
        }
        
        //print array
        System.out.println("The modified array:");
        for (int i=0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}