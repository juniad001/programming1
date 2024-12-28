package arrays;
//wap for linear search
public class p3 {
	public static void linearsearch(int[] arr,int key) {
		int index = -1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == key) {
				index = i+1;
			}
		}
		if(index!=-1) {
			System.out.println(key +" is present at index="+index);
		}else {
			System.out.println("not preseent in the array");
		}
	}
	public static void main(String[] args) {
		int [] arr = {11, 4,5,10,3};
		int key = 10;
		linearsearch(arr, 10);
	}
}
