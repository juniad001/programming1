package arrays;

import java.util.Arrays;

import sorting.mergesort;

//wap to sort the arrays of 0s ,1s and 2s
public class sortarraysof012s {
//brute force technique it will take 0(n log n)we can do better
	public static void sort012s(int [] arr) {
		mergesort.ms(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	//better way then mergesort sorting of 0 1 and 2's
	public static void sort012s_1(int [] arr) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int i = 0;
		while(i<arr.length) {
			if(arr[i] == 0) {
				count0++;
				i++;
			}
			else if(arr[i] == 1) {
				count1++;
				i++;
			}else {
				count2++;
				i++;
			}
		}
		for(int j = 0;j<count0;j++) {
			arr[j] = 0;
		}
		for(int j = count0;j<count0+count1;j++) {
			arr[j] = 1;
		}
		for(int j = count0+count1;j<arr.length;j++) {
			arr[j] = 2;
		}
		System.out.println(Arrays.toString(arr));
	}
	//most optimized algorithm using dutch national flag algorithm
	public static void swap(int [] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void sort012s_2(int [] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		while(mid<=high) {
			if(arr[mid] == 0) {
				swap(arr, mid, low);
				low++;
				mid++;
			}else if(arr[mid] == 1) mid++;
			else {
				swap(arr, mid, high);
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int [] arr3 = {1,2,1,0,1};
		int [] arr = {1,2,0,1,2,0,0,1,2,2,2,1,1};
		int [] arr1 = {1,0,2,1,2,2,0,0,2,1};
		int [] arr2 = {0,1,1,0,1,2,2,2,1,1,1,1,0};//good approach using dutch nation algorithm
		sort012s(arr);
		System.out.println("----------------------");
		sort012s_1(arr1);
		System.out.println("-----------------------");
		sort012s_2(arr2);
		System.out.println("-----------------------");
		sort012s_2(arr3);//just interested that's it using dutch optimized approach
	}
}
