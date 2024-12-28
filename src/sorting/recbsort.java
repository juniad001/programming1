package sorting;

import java.util.Scanner;
//bubble sort using recursion
public class recbsort {
	public static void bsort(int [] arr,int n) {
		if(n == 0) return;
		for(int i = 0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		bsort(arr, n-1);
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
		bsort(arr, num);
		System.out.println("After sorting the arrays");
		for(int i = 0;i<num;i++) {
			System.out.println(arr[i]);
		}
	}
}
