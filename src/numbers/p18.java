package numbers;

import java.util.Scanner;

//write a program to check whether a number is spy no
public class p18 {
	public static void spyno(int n) {
		int sum = 0;
		int product = 1;
		int rem = 0;
		int temp = n;
		while(temp>0) {
			rem = temp%10;
			sum = sum + rem;
			product = product * rem;
			temp = temp/10;
		}
		if(sum == product) {
			System.out.println(n+" Spy no");
		}else {
			System.out.println(n+" not a Spy no");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		spyno(num);

	}

}
