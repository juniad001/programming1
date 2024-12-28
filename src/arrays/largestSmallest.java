package arrays;

import java.util.Arrays;
//write a program to find the largest and least element in an array
public class largestSmallest {
	public static void largest_least(int [] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Largest"+arr[arr.length-1]);
		System.out.println("Smallest"+arr[0]);
	}

}
