package arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//wap to find the intersection of two sorted array
public class intersectionofsortedarray {
	public static void intersection(int [] arr,int [] arr1) {
		int [] visited = new int[arr1.length];
		int [] ans = new int[arr1.length];
		for(int i = 0;i<arr1.length;i++) {
			visited[i] = 0;
		}
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr1.length;j++) {
				if(arr[i] == arr1[j] && visited[j]==0) {
					ans[i] = arr[i];
					visited[j] = 1;
					break;
				}
				if(arr1[j]>arr[i]) break;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
	//optimized approach using two pointer approach
	public static void intersection1(int [] arr,int [] arr1) {
		List<Integer>ans = new LinkedList<>();
		int i = 0;
		int j = 0;
		while(i<arr.length &&  j<arr1.length) {
			if(arr[i]<arr1[j]) {
				i++;
			}else if(arr1[j]<arr[i]) {
				j++;
			}else {
				ans.add(arr[i]);
				i++;
				j++;
			}
		}
		for(Integer s:ans) {
			System.out.print(s+" ");
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,2,2,3,4,5};
		int [] arr1 = {2,2,3,5,6,7};
//		intersection(arr, arr1);
		intersection1(arr, arr1);//amazing done well done my boy
	}
}
