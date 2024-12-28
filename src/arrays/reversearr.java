package arrays;

import java.util.Arrays;

public class reversearr {
	public static void reverse1(int [] arr,int l,int n) {
		int [] temp = new int[n-l+1];
		for(int i = n-1,j = 0;i>=l;i--,j++) {
			temp[j] = arr[i];
		}
		for(int i = l,j=0;i<n;i++,j++) {
			arr[i] = temp[j];
		}
	}
	//easy way to reverse
	public static void reverse(int [] arr,int l,int n) {
		int start = l;
		int end = n-1;
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		reverse(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
}
