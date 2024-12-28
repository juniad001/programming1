package arrays;
import java.util.Arrays;

import sorting.*;
//wap for binary search
public class p4 {
	public static void binarysearch(int [] arr,int key) {
		int low = 0;
		int high = arr.length;
		int index = -1;
		for(int i = low;i<high;i++) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				index = mid+1;
			}else if(key<arr[mid]) {
				high = mid;
			}else {
				low = mid+1;
			}
		}
		if(index!=-1) System.out.println(key+" found at index "+index);
		else System.out.println(key+" not availaible");
	}
	public static int recbinaysearch(int [] arr,int key,int low,int high) {
		if(low>high) {
			return -1;
		}
		int mid = (low+high)/2;
		if(arr[mid]==key) return mid;
		
		if(arr[mid]>key) {
			return recbinaysearch(arr, key, low, mid);
		}
		return recbinaysearch(arr, key, mid+1, high);
	}
	public static void main(String[] args) {
		int [] arr = {40,3,9,20,7,6,5};
		int n = arr.length;
		mergesort.ms(arr, 0, n-1);
		System.out.println(Arrays.toString(arr));
		binarysearch(arr, 20);
		System.out.println(recbinaysearch(arr,7, 0, n));
	}
}
