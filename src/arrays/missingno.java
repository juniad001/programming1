package arrays;

public class missingno {
	//better way not brute force but can be done using brute force too
	public static void mn(int [] arr) {
		int n = arr.length;
		int [] nos = new int[n];
		for(int i = 0;i<n;i++) {
			nos[i] = i+1;
		}
		for(int i = 0;i<n;i++) {
			if(arr[i]!=nos[i]) {
				System.out.println("missing no is "+nos[i]);
				break;
			}
		}
	}
	//better way using hashing 
	public static void mn1(int [] arr,int range) {
		int [] hash = new int[range];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<range) {
				hash[arr[i]] = 1;
			}
		}
		for(int i = 1;i<range;i++) {
			if(hash[i] == 0) {
				System.out.println("missing element is "+i);;
			}
		}
	}
	//optimized way and amazing way 
	public static int mn2(int [] arr) {
		int sum = arr[arr.length-1]*(arr[arr.length-1] + 1)/2;//amazingly done
		int sum1 = 0;
		for(int i = 0;i<arr.length;i++) {
			sum1 = sum1 + arr[i];
		}
		
		return sum-sum1;
	}
	//another best and optmized way using xor
	public static int mn3(int [] arr) {
		int xor1 = 0;
		int xor2 = 0;
		int n = arr.length;
		/*
		 * for(int i = 0;i<=n;i++) { xor1 = xor1^i; }
		 */
		for(int i = 0;i<n-1;i++) {
			xor2 = xor2^arr[i];
			xor1 = xor1^(i+1);
		}
		xor1 = xor1 ^n;
		return xor1^xor2;
	}
	public static void main(String[] args) {
		int [] arr = {1,2,4,5};
		//mn(arr);
		mn1(arr,6);
		System.out.println(mn2(arr));//another amazing way
		System.out.println(mn3(arr));
	}
}
