package arrays;

import java.util.HashMap;

//wap to find the summation of longest sub array 
public class summationoflongestsubarray {
	public static int max(int l,int h) {
		if(l>h) {
			return l;
		}else {
			return h;
		}
	}
	//this is using brute force method
	public static void lsubbarray(int[]arr,int key) {
		int len = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = i;j<arr.length;j++) {
				int sum = 0;
				for(int k = i;k<=j;k++) {
					sum = sum + arr[k];
				}
				if(sum == key) {
					len = max(len, j-i+1);
				}
			}
		}
		System.out.println(len);
	}
	//this is another way using brute force but little better way
	public static void lsubbarray1(int[]arr,int key) {
		int len = 0;
		for(int i = 0;i<arr.length;i++) {
			int sum = 0;
			for(int j = i;j<arr.length;j++) {
				sum +=arr[j];
				if(sum == key) {
					len = max(len, j-i+1);
				}
			}
		}
		System.out.println(len);
	}
	//better and optimized approach using hashing with hashmap
	public static int lsubbarray2(int [] arr,int key) {
		HashMap<Long, Integer>lsubl = new HashMap<>();
		int maxLength = 0;
		long sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum = sum+arr[i];
			if(sum == key) {
				maxLength = Math.max(maxLength, i+1);
			}
			long rem = sum - key;
			if(lsubl.containsKey(rem)) {
				int length = i - lsubl.get(rem);
				maxLength = Math.max(maxLength, length);
			}
			lsubl.put(sum, i);
		}
		return maxLength;
	} 
	//optimized solution if it only contains positive and 0's
	public static int lsubarrl(int [] arr,int key) {
		int maxLength = 0;
		long sum = arr[0];
		int right = 0;
		int left = 0;
		int n = arr.length;
		while(right<n) {
			while(left<=right && sum>key) {
				sum -= arr[left];
				left++;
			}
			if(sum == key) {
				maxLength = Math.max(maxLength, (right-left)+1);
			}
			right++;
			if(right<n) {
				sum = sum + arr[right];
			}
		}
		return maxLength;
	}
	public static void main(String[] args) {
		int [] arr = {1,1,-1,0,0,1,2,2,3,4,5,6,10};
		int [] arr1 = {1,1,1,2,3,4,5};
		lsubbarray(arr, 5);
		System.out.println("------------------");
		lsubbarray1(arr, 5);
		System.out.println("-------------------");
		System.out.println(lsubbarray2(arr,9));//well done
		System.out.println("----------------------");
		System.out.println(lsubarrl(arr1, 5));//well done
	}
}
