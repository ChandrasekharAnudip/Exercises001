package com.arrays.demo;

import java.util.Scanner;

public class Array002 {

	public static void main(String[] args) {
		/* Binary search is the method used to search an element from a 
		 * collection of elements. 
		 * 
		 * To perform a binary search, all elements of an array must be in 
		 * ascending order. 
		 * 
		 * Take a look at a program showing this type of search below.
		 */
		
		int i, size, item, array[], first, last, middle;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		size = sc.nextInt();
		
		array = new int[size];
		
		
		System.out.println("Enter " + size + " no of values: ");
		for(i=0; i<size; i++)
			array[i] = sc.nextInt();
		
		System.out.println("Enter the value: ");
		item = sc.nextInt();
		
		first = 0;
		last = size-1;
		
		middle = (first + last)/2;
		
		while(first <= last) {
			if(array[middle] < item) {
				first = middle + 1;
			}
			else if(array[middle] == item) {
				System.out.println("The number " + item + " is found at the location " + (middle + 1));
				break;
			}
			else {
				last = middle - 1;
			}
			
			middle = (first + last) / 2;
			
			
		}
		
		if(first > last)
			System.out.println("The number " + item + " is  not found in the list");

		sc.close();
		
	}
	
	

}
