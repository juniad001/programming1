package arrays;

import java.util.Arrays;

//wap to copy the elements of one array into another array
public class p5 {
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50};
		int[]b = new int[a.length];
		for(int i = 0;i<a.length;i++) {
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
