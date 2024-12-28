package arrays;

import java.util.Arrays;
import java.util.HashMap;

//wap to find the 2sum where two numbers should make a sum of given number
public class twosum {
	//brute force method to solve this problem
	public static void two_sum(int [] arr,int key) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(i==j) continue;
				if(arr[i]+arr[j] == key) {
					System.out.println(i+" "+j);
				}
			}
		}
	}
	//better approach for two sum using hashmap
	public static void two_sum1(int [] arr,int key){
		HashMap<Integer, Integer>map = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
			int complement = key - arr[i];
			if(map.containsKey(complement)) {
				System.out.println(map.get(complement)+" "+i);
			}
			map.put(arr[i], i);
		}
	}
	//another optimized way using two pointers approach
	public static String two_sum2(int [] arr,int key) {
		int left = 0;
		int right = arr.length-1;
		Arrays.sort(arr);
		while(left<right) {
			int sum = arr[left] + arr[right];
			if(sum == key) {
				return left+" "+right;
			}else if(sum<key) left++;
			else right--;
		}
		return "-1 -1";
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,5,8,10,11};
		int key = 14;
		two_sum(arr, key);//this is using brute force method
		System.out.println("-----------------------");
		two_sum1(arr, key);//good approach and I like it
		two_sum2(arr, key);//optimized approach using two pointers and sorting technique ding ding ding
	}
}
