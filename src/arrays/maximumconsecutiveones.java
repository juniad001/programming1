package arrays;

import java.util.LinkedList;
import java.util.List;

//wap to find the maximum consecutiveones
public class maximumconsecutiveones {
	public static int max(int l,int h) {
		int max;
		if(l>h) {
			max = l;
		}else {
			max = h;
		}
		return max;
	}
	public static int mc1(int [] arr) {
		int maximum = 0;
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == 1) {
				count++;
				maximum = max(count, maximum);
			}else {
				count = 0;
			}
		}
		return maximum;
	}
	public static void main(String[] args) {
		int [] arr = {0,1,1,0,1,1,1,0};
		System.out.println(mc1(arr));//amazing done yeah man that's it go forth
	}
}
