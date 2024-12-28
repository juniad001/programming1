package arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

//wap to find the duplicate elements in an array
public class p7 {
	public static void duplicate(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			int visited = -1;
			int count = 1;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					arr[j] = visited;
				}
			}
			if(arr[i]!=visited && count>1) {
				System.out.println("duplicate elements present are "+arr[i]);
			}
		}
	}
	//another approach for it it will work if there is only one duplicate element
	public static void duplicate1(int[]a) {
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(" duplicate element of "+a[i]+" present at index="+(j+1));
				}
			}
		}
	}
	//another approach to find the duplicates after sorting the array
	public static void duplicate2(int [] a) {
		Arrays.sort(a);
		for(int i = 0;i<a.length-1;i++) {
			if(a[i] == a[i+1]) {
				System.out.println(a[i+1]);
			}
		}
	}
	//another way to find the duplicate elements using collection
	public static void duplicate3(int [] a) {
		LinkedHashSet<Integer> h1 = new LinkedHashSet();
		for(int i = 0;i<a.length;i++) {
			if(!(h1.add(a[i]))) {
				System.out.println("duplicate elements are "+a[i]);
			}
		}
	}
	public static void main(String[] args) {
		int [] a = {10,30,45,80,100,30,10,30,80,10,10};
		int [] b = {10,30,30,40,50,10};
		int [] c = {10,30,45,80,100,30,10,30,80,10,10};
		System.out.println("------------------------");
		duplicate(a);
		System.out.println("------------------------");
		duplicate1(b);
		System.out.println("------------------------");
		duplicate2(c);
		System.out.println("--------------------------");
		duplicate3(c);
	}
}
