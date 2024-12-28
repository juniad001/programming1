package sorting;

import java.util.Scanner;
//this is selection sort program and time complexity of this selection sort program is 0(n^2)
public class selectionsort {
	public static void swap(int [] arr,int i,int j) {
		int temp = arr[i];
		arr[i]  = arr[j];
		arr[j] = temp;
	}
	public static void ssort(int [] arr,int n) {
		for(int i = 0;i<n-1;i++) {
			int min = i;
			for(int j = 1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(i!=min) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int num = sc.nextInt();
		int [] arr = new int[num];
		System.out.println("Enter the elements of the array");
		for(int i = 0;i<num;i++) {
			arr[i] =sc.nextInt();
		}
		ssort(arr, num);
		System.out.println("After sorting the arrays");
		for(int i = 0;i<num;i++) {
			System.out.println(arr[i]);
		}
	}
}
