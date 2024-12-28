package numbers;

import java.util.Scanner;

//another way to check whether the number is peterson number
public class p16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int rem;
		while(temp>0) {
			rem = temp%10;
			int fact = 1;
			for(int i = rem;i>=1;i--) {
				fact = fact * i;
			}
			sum = sum + fact;
			temp = temp/10;
		}
		if(num == sum) {
			System.out.println("Peterson number");
		}else {
			System.out.println("Not a peterson number");
		}
	}
}
