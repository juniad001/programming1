package sorting;

import java.util.Arrays;

//another way of insertion sorting
public class ins_sort {
	//for ascending order
	public static void inssort(int [] arr) {
		for(int i = 1;i<arr.length;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && temp<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	//for descending order
	public static void insdessort(int [] arr) {
		for(int i = 1;i<arr.length;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && temp>arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		int [] arr = {20,10,40,30,50,5};
		inssort(arr);
		System.out.println(Arrays.toString(arr));
		insdessort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
