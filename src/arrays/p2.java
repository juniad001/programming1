package arrays;
import java.util.Arrays;

//write a program to find the second largest and third largest elements in arrays
public class p2 {
	public static void secthirdelement(int [] arr) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		System.out.println(arr[arr.length-3]);
	}
	//another optimal way for this 
	public static void stele(int [] arr) {
		int largest = -1;
		int slargest = -1;
		int tlargest = -1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]>slargest && arr[i]<largest) {
				slargest = arr[i];
			}
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>tlargest && arr[i]<slargest) {
				tlargest = arr[i];
			}
		}
		System.out.println("largest element in array is "+largest);
		System.out.println("second largest element in array is "+slargest);
		System.out.println("third largest element in array is "+tlargest);
	}
	public static void main(String[] args) {
		int [] arr = {11,44,4,43,10};
		secthirdelement(arr);
		System.out.println("----------------");
		stele(arr);
	}
}

