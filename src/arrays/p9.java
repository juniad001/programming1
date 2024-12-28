package arrays;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

//wap to find appears once, and others appears twice
//in other words single number
public class p9 {
	//lets go with brute force first
	public static void singleno(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			int num = arr[i];
			int count = 0;
			for(int j = 0;j<arr.length;j++) {
				if(arr[j] == num) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(num+" is a single number");
			}
		}
	}
	//lets go with better solution
	public static int max(int l,int h) {
		int max = 0;
		if(l>h) {
			max = l;
		}else {
			max = h;
		}
		return max;
	}
	public static void singleno1(int [] arr) {
		int max = arr[0];
		for(int i = 1;i<arr.length;i++) {
			max = max(arr[i], max);
		}
		int [] hash = new int[max+1];
		for(int i = 0;i<=max;i++) {
			hash[i] = 0;
		}
		for(int i = 0;i<arr.length;i++) {
			hash[arr[i]]++;
		}
		for(int i = 0;i<arr.length;i++) {
			if(hash[arr[i]] == 1) {
				System.out.println("single appearing element is "+arr[i]);
			}
		}
	}

	/*
	 * // another way if the input size 10^9 or // 10^12 large input then
	 * hashing is a long process // so in that scenario we use map // if we use
	 * orderedmap the time complexity would be 0(nlogn) or // we use unorderedmap
	 * then the best time complexity would be 0(n) // sometimes and its rarely
	 * happen in the worst case time complexity could 0(n^2) // if interviewer asks
	 * to go for orderedmap because the data is complex then you can  go to
	 * orderedmap
	 */	
	public static void singleno2(int [] arr) {
		HashMap<Integer, Integer> mpp = new HashMap<>();
		for(int i = 0;i<arr.length-1;i++) {
			int count = 0;
			for(int a:arr) {
				if(mpp.containsKey(a)) {
					mpp.put(a, mpp.get(a)+1);//get returns the value and we add + 1 to the value and map it
				}else {
					mpp.put(a,1); //if there is no key we make one
				}
			}
			for(Map.Entry<Integer, Integer> entry:mpp.entrySet()) {
				if(entry.getValue() == 1) {
					System.out.println("the single element appearing is "+entry.getKey());
				}
			}
		}
	}
	//optimal solution
	public static int singleno3(int [] arr) {
		int xor1 = 0;
		for(int i = 0;i<arr.length;i++) {
			xor1 = xor1 ^ arr[i];
		}
		return xor1;
	}
	public static void main(String[] args) {
		int [] arr = {1,2,2,3,5,5};
		int [] arr1 = {2,3,3,5,5,6,6};
		singleno(arr);
		System.out.println("------------------------");
		singleno1(arr1);
		System.out.println("-------------------------");
		singleno2(arr1);
		System.out.println(singleno3(arr1));
	}
}
