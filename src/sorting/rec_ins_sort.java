package sorting;

import java.util.Scanner;

public class rec_ins_sort {
	public static void inssort(int [] arr,int i,int n) {
		if(i>=n) return;
		int j = i;
		while(j>0 && arr[j]<arr[j-1]) {
			int temp = arr[j-1];
			arr[j-1] = arr[j];
			arr[j] = temp;
			j--;
		}
		inssort(arr, i+1, n);
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
		inssort(arr,1, num);
		System.out.println("After sorting the arrays");
		for(int i = 0;i<num;i++) {
			System.out.println(arr[i]);
		}
	}
}
