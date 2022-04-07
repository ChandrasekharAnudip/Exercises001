package com.arrays.demo;

import java.util.Arrays;
import java.util.Collections;

public class Array001 {

	public static void main(String[] args) {
		//1. Sorting the array
		/*
		int iArray[] = {8,2,6,9,1};
		
		Arrays.sort(iArray);
		
		System.out.println(Arrays.toString(iArray));
		
		
		
		char cArray[] = {'h', 'e', 'l', 'l', 'o' };
		
		Arrays.sort(cArray);
		
		System.out.println(Arrays.toString(cArray));
		*/
		
		//2. Descending sort
		//int iArray[] = {8,2,6,9,1};
		
		Integer iArray[] = {8,2,6,9,1};
		
		Arrays.sort(iArray, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(iArray));
		
		
		
		//char cArray[] = {'h', 'e', 'l', 'l', 'o' };
		
		Character cArray[] = {'h', 'e', 'l', 'l', 'o' };
		
		Arrays.sort(cArray, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(cArray));
	}

}
