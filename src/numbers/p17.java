package numbers;

import java.util.Scanner;

//write a program to check whether the number is perfect number
public class p17 {
	public static void perfectno(int num) {
		int sum = 0;
		for(int i = 1;i<=num/2;i++) {
			if(num%i == 0) {
				sum = sum + i;
			}
		}
		if(sum == num) {
			System.out.println("perfect number");
		}else {
			System.out.println("not a perfect number");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		perfectno(num);
	}
}
