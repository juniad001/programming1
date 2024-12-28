package arrays;

import java.util.Arrays;
import java.util.Vector;

//wap to re-arrange the array in positive and negative order where
//one is at positive and another at negative
public class rearrangepandn {
	public static void rearrange(int [] arr) {
		//for storing positive and negative
		int [] postive = new int[arr.length/2];
		int [] negative = new int[arr.length/2];
		int pIndex = 0;
		int nIndex = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>=0) postive[pIndex++] = arr[i];
			else negative[nIndex++] = arr[i];
		}
		//merging or combining in the original array
		for(int i = 0;i<arr.length/2;i++) {
			arr[i*2] = postive[i];
			arr[i*2+1] = negative[i];
		}
	}
	
	//optimal solution
	public static void swap(int [] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//optimized code
	public static Vector<Integer> rearrange1(int [] arr) {
		int p = 0;
		int n = 1;
		Vector<Integer>ans = new Vector<>();
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>0) {
				ans.add(arr[p]);
				p += 2;
			}else {
				ans.add(arr[n]);
				n += 2;
			}
		}
		return ans;
	}
	//variety 2 of positive and negative in rearrange 
	//brute force solution
	public static void rearrange2(int [] arr) {
		Vector<Integer>positive = new Vector<>();
		Vector<Integer>negative = new Vector<>();
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>0) positive.add(arr[i]);
			else negative.add(arr[i]);
		}
		if(positive.size()>negative.size()) {
			for(int i = 0;i<negative.size();i++) {
				arr[i*2] = positive.get(i);
				arr[i*2+1] = negative.get(i);
			}
			int index = 2 * negative.size();
			for(int i = negative.size();i<positive.size();i++) {
				arr[index] = positive.get(i);
				index++;
			}
		}else {
			for(int i = 0;i<positive.size();i++) {
				arr[i*2] = positive.get(i);
				arr[i*2+1] = negative.get(i);
			}
			int index = 2 * positive.size();
			for(int i = positive.size();i<negative.size();i++) {
				arr[index] = negative.get(i);
				index++;
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {-1,-8,-1,5,3,5};
		int [] arr1 = {3,-2,5,5,-1,-8};
		int [] arr2 = {2,2,2,-1,5,-8,33,-9,
				10,-1,-3,-5,-8,-11,-12};//well done
		rearrange(arr);//brute force approach
		System.out.println(Arrays.toString(arr));
		Vector<Integer> ans = rearrange1(arr1);
		System.out.println(ans);
		rearrange2(arr2);
		System.out.println("--------------------");
		System.out.println(Arrays.toString(arr2));
	}
}
//{1,-2,2,-2,3,-4}