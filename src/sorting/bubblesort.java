package sorting;
//this is bubble sort and time complexity of this sorting algorithm is 0(n^2)
import java.util.Iterator;
import java.util.Scanner;

public class bubblesort {
	public static void swap(int [] arr,int i ,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void bsort(int [] arr,int n) {
		for(int i = n;i>0;i--) {
			for(int j = 0;j<i-1;j++) {//amazing done here well done
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the size of the array");
	int n = s.nextInt();
	int [] arr = new int[n];
	System.out.println("enter the elements of the array");
	for (int i = 0; i < arr.length; i++) {
		arr[i] = s.nextInt();
	}
	bsort(arr, n);
	for(int i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
