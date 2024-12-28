package arrays;

import java.util.Arrays;
//wap to left rotate
public class Left_rotate {
	public static void lrotate(int[]arr,int rotate) {
		for(int i = 0;i<rotate;i++) {
			int first = arr[0];
			/*
			 * for(int j = 1;j<arr.length;j++) { arr[j-1] = arr[j]; }
			 */ //or we can go another way of looping that is
			for(int j = 0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = first;
		}
	}
	//left rotate using brute way
	public static void leftrotate(int [] arr,int d,int n) {
		d = d%n;
		int [] temp = new int[d];
		for(int i = 0;i<d;i++) {
			temp[i] = arr[i];
		}
		for(int i = d;i<n;i++) {
			arr[i-d] = arr[i];
		}
		for(int i = n-d;i<n;i++) {
			arr[i] = temp[i-(n-d)];//amazing done through using this
		}
	}
	//another optimized way to left rotate an array
	public static void leftrotate1(int [] arr,int d,int n) {
		d = d%n;
		reversearr.reverse(arr, 0, d);
		reversearr.reverse(arr, d, n+1);
		reversearr.reverse(arr, 0, n+1);
	}
	public static void main(String[] args) {
		int [] arr = {10,20,35,45,55};
		int [] arr1 = {11,22,33,44,55,66};
		int [] arr2 = {1,2,3,4,5,6,7,8};
		lrotate(arr, 5);//amazing done here
		System.out.println(Arrays.toString(arr));
		System.out.println("----------------------");
		leftrotate(arr1, 3, arr1.length);//amazingly done
		System.out.println(Arrays.toString(arr1));
		System.out.println("-------------------");
		leftrotate1(arr2, 3, arr2.length-1);
		System.out.println(Arrays.toString(arr2));//brilliantly done
	}
}
