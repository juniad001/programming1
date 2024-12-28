package sorting;

import java.util.Scanner;
//this is the program for insertion sort and the time complexity of this program is 0(n^2)
public class insertionsort {
	public static void ins_sort(int [] arr,int n) {
		for(int i = 0;i<n;i++) {
			int j = i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
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
		ins_sort(arr, num);
		System.out.println("After sorting the arrays");
		for(int i = 0;i<num;i++) {
			System.out.println(arr[i]);
		}
	}
}
