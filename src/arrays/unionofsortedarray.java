package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;
//wap to find the union of sorted array
public class unionofsortedarray {
	//this is done by using brute force approach
	public static void union(int [] arr,int [] arr1) {
		HashSet<Integer> st = new HashSet();
		
		for(int i = 0;i<arr.length;i++) {
			st.add(arr[i]);
		}
		for(int i = 0;i<arr1.length;i++) {
			st.add(arr1[i]);
		}
		int [] union = new int[st.size()];
		int i = 0;
		for(Integer s:st) {
			union[i++] = s;
		}
		System.out.println(Arrays.toString(union));
	}
	//this is using two pointer approach optmized version
	public static Vector<Integer> union1(int [] arr,int [] arr1){
		Vector<Integer> union = new Vector<>();
		int i = 0;
		int j = 0;
		while(i<arr.length && j<arr1.length) {
			if(arr[i]<=arr1[j]) {
				if(union.size() == 0 || union.lastElement()!=arr[i]) {
					union.add(arr[i]);
				}
				i++;
			}else {
				if(union.size() == 0 || union.lastElement()!=arr1[j]) {
					union.add(arr1[j]);
				}
				j++;
			}
		}
		while(j<arr1.length) {
			if(union.size() == 0 || union.lastElement()!=arr1[j]) {
				union.add(arr1[j]);
			}
			j++;
		}
		while(i<arr.length) {
			if(union.size() == 0 || union.lastElement()!=arr[i]) {
				union.add(arr[i]);
			}
			i++;
		}
		return union;
	}
	public static void main(String[] args) {
		int [] a1 = {1,1,2,3,4,5};
		int [] a2 = {2,3,4,5,6,7};
        Vector<Integer> union= union1(a1, a2);
        for(Integer s:union) {
        	System.out.println(s);
        }
	}

}
