package arrays;

import java.util.Arrays;

//wap to remove duplicates in an array
public class removeduplicate {
	public static void removedup(int [] arr) {
		int i = 0;
		for(int j = 1;j<arr.length;j++) {
			if(arr[j]!=arr[i]) {
				arr[i+1] = arr[j];
				i++;
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,1,1,2,2,3,3,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println("After removing duplicates");
		removedup(arr);
		System.out.println(Arrays.toString(arr));//here all the values are printed after removing duplicates and then other unwanted values are printed
	}
}
