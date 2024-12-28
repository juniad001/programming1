package arrays;

import java.util.HashMap;
import java.util.Map;

public class majorityelement {
	//brute force technique to find the solution
	public static int majority(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			int count = 0;
			for(int j  = 0;j<arr.length;j++) {
				if(arr[j] == arr[i]) {
					count++;
				}
				if(count>arr.length/2) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	//this is better solution using array hashing
	public static void majority1(int [] arr) {
		int largest = 0;
		for(int i = 0;i<arr.length;i++) {
		  largest = Math.max(largest, arr[i]);
		}
		largest = largest + 1;
		int [] hash = new int[largest];
		for(int i = 0;i<arr.length;i++) {
			hash[arr[i]]++;
			if(hash[arr[i]]>arr.length/2){
				System.out.println("majority element is "+arr[i]);
			}
		}
	}
	//this is too better solution using hashmap
	public static void majority2(int [] arr) {
		HashMap<Integer, Integer>map = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer, Integer> mpp:map.entrySet()) {
			if(mpp.getValue()>arr.length/2) {
				System.out.println("majority element is "+mpp.getKey());
			}
		}
	}
	//most optimised code using moore's voting algorithm
	public static void majority3(int [] arr) {
		int count = 0;
		int candidate = 0;
		for(int  i = 0;i<arr.length;i++) {
			if(count <= 0) {
				count = 1;
				candidate = arr[i];
			}
			count += (candidate==arr[i])?1:-1;
		}
		count = 0;
		for(int i = 0;i<arr.length;i++) {
			if(candidate == arr[i]) {
				count++;
			}
		}
		if(count>arr.length/2) {
			System.out.println("the majority element is "+candidate);
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,1,4,5,3,1,1};
		int [] arr1 = {1,1,2,3,4,1,1};
		int [] arr2 = {2,2,2,1,3,4,2};
		int [] arr3 = {3,3,3,1,1,3,2};
		int [] arr4 = {1,4,4,4,3,4,2};
		majority1(arr);//this is using array hashing
		System.out.println("---------------------");
		System.out.println("majority element is "+majority(arr1));//using brute force approach
		System.out.println("------------------");
		majority2(arr1);//this is using hashmap
		System.out.println("-------------------");
		majority2(arr2);
		System.out.println("----------------------");
		majority2(arr3);
		System.out.println("-----------------------");
		majority3(arr4);//using moore's algorithm the optimized code
	}
}
