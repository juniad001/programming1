package arrays;

import java.util.Arrays;

//wap to right rotate a array 
public class Right_rotate {
	public static void rrotate(int[]arr,int rotate) {
		for(int i = 0;i<rotate;i++) {
			int last = arr[arr.length-1];
			for(int j = arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
	}
	public static void main(String[] args) {
		int [] arr = {10,20,35,45,55};
		rrotate(arr, 1);
		System.out.println(Arrays.toString(arr));
	}
}
