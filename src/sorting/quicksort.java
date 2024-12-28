package sorting;

import java.util.Arrays;

//wap to quick sort
public class quicksort {
	public static void qsort(int [] arr,int l,int h) {
		if(l<h) {
			int partition = partition(arr,l,h);
			qsort(arr,l,partition-1);
			qsort(arr,partition+1,h);
		}
	}
	public static int partition(int [] arr,int l,int h) {
		int pivot = arr[h];
		int i = l-1;
		for(int j = l;j<h;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[h];
		arr[h] = arr[i+1];
		arr[i+1] = temp;
		return i+1;
	}
	public static void main(String[] args) {
		int [] arr = {40,30,20,1,5,2,6};
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------------------");
		qsort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
