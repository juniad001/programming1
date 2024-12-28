package arrays;

import java.util.Arrays;

//wap to move non zeroes array at the end of the array
public class movezerosatend {
//this is using brute force technique	
	public static void movezeroes(int [] arr) {
		int [] temp = new int[arr.length];
		int j = -1;
		int nz = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]!=0) {
				j++;
				temp[j] = arr[i];
			}
		}
		for(int i = 0;i<temp.length;i++) {
			arr[i] = temp[i];
			nz = temp.length;
		}
		for(int i = nz;i<arr.length;i++) {
			arr[i] = 0;
		}
	}
	public static void swap(int [] arr,int l,int h) {
		int temp = arr[l];
		arr[l] = arr[h];
		arr[h] = temp;
	}
	//optimized solution and best way 
	public static void movezeroes1(int [] arr) { //amazingly done but still space to improve
		int j = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
		for(int i = j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				swap(arr,i,j);
				j++;
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {0,1,2,3,0,4,0,8,9};
		int [] arr1 = {0,0,1,2,3,0,4,0,8};
		System.out.println("before moving zeroes");
		System.out.println(Arrays.toString(arr));
		System.out.println("after moving zeroes at end");
		movezeroes(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------");
		System.out.println("before moving zeroes");
		System.out.println(Arrays.toString(arr1));
		System.out.println("after moving zeroes");
		movezeroes1(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}
