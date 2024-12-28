package arrays;

import java.util.Arrays;

//wap to check whether the array is sorted or not
public class sortedarraycheck {
	public static boolean sorted(int [] arr) {
		boolean flag = true;
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			if(!(arr[i]<arr[i+1])) {
				flag = false;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int [] ar = {10,3,5,2,9,6};
		sorting.quicksort.qsort(ar, 0, ar.length-1);
		System.out.println(Arrays.toString(ar));
		System.out.println(sorted(ar));
	}
}
