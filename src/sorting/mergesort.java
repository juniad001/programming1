
package sorting;

import java.util.ArrayList;


import java.util.Scanner;
public class mergesort {
	public static void ms(int [] arr,int l,int h) {
		if(l>=h) return;
		int mid = (l+h)/2;
		ms(arr, l, mid);
		ms(arr, mid+1, h);
		merge(arr,l,mid,h);
	}
	public static void merge(int [] arr,int l,int mid, int h) {
		int [] temp = new int[h-l+1];
		int left = l;
		int right = mid+1;
		int i = 0;
		while(left<=mid && right<=h) {
			if(arr[left]<arr[right]) {
				temp[i++] = arr[left++];
			}else {
				temp[i++] = arr[right++];
			}
		}	
		while(left<=mid) {
			temp[i++] = arr[left++];
		}
		while(right<=h) {
			temp[i++] = arr[right++];
		}
		for(int j = l;j<=h;j++) {
			arr[j] = temp[j-l];
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
		ms(arr,0, num-1);
		System.out.println("After sorting the arrays");
		for(int i = 0;i<num;i++) {
			System.out.println(arr[i]);
		}
	}

}
