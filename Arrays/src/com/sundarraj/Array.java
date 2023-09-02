package com.sundarraj;

import java.util.Arrays;


public class Array {
	public static void main(String [] args) {
		int []nums = {2,3,1,4,6,8,10,34,56,78}; //declaring and initializing of array
		//Printing of array using enhanced for loop
		System.out.println("The following is printed using enhanced for loop");
		for(int num : nums) { //Enhanced for loop
			System.out.println(num);
		}
			// OR
		//Printing of array using "Arrays.toString()"
		System.out.println();
		System.out.println("The following is printed using ARRAYS.TOSTRING()");
		System.out.println(Arrays.toString(nums));
			//OR
		//Printing of array using index
		System.out.println();
		System.out.println("The following are printed using index of the array");
		System.out.println(nums[3]+" at INDEX 3");
		System.out.println(nums[0]+" at INDEX 0");
		System.out.println(nums[4]+" at INDEX 4");
		System.out.println(nums[5]+" at INDEX 5");
			//OR
		// Printing of array using for loop
		System.out.println();
		System.out.println("The following is printed using for loop");
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		// Sorting of the array
		System.out.println();
		System.out.println("The following is the sorted Array");
		Arrays.sort(nums);
		for(int sort : nums) {
			System.out.println(sort);
		}
		
	}

}
