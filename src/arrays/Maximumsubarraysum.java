package arrays;
//wap to find the maximum subarray sum using kadane's algorithm
public class Maximumsubarraysum {
	//brute force approach
	public static int msars(int [] arr) {
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			for(int j = i;j<arr.length;j++) {
				int sum = 0;
				for(int k = i;k<=j;k++) {
					sum += arr[k];
					max = Math.max(max, sum);
				}
			}
		}
		return max;
	}
	//better approach
	public static int msars1(int [] arr) {
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			int sum = 0;
			for(int j = i;j<arr.length;j++) {
				sum += arr[j];
				max = Math.max(max, sum);
			}
		}
		return max;
	}
	//Most-Optimized or optimal solution kadane's algorithm
	public static void msars2(int [] arr) {
		//lets code baby
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int ansstart = -1;
		int ansend = -1;
		for(int i = 0;i<arr.length;i++) {
			if(sum == 0) ansstart = i;
			sum += arr[i];
			if(sum<0) {
				sum = 0;
			}
			if(sum>max) {
				ansend = i;
				max = sum;
			}
		}
		System.out.println("the max sub-array is "+max+" startsAt "+ansstart+" endAt "+ansend);
	}
	public static void main(String[] args) {
		int [] arr = {-3,-8,-1,3,5,-6,-2};
		int [] arr1 = {2,-2,2,-1,6};
		System.out.println("the maximum sub-array sum is "+msars(arr));//this is using brute force aproach
		System.out.println("-----------------------");
		System.out.println("the maximum sub-array sum is "+msars1(arr));//second approach or better approach
		System.out.println("------------------------");
		msars2(arr);//optimal code with where it starts and ends that's good
		msars2(arr1);
	}
	
}