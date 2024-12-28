package numbers;

import java.util.Scanner;

//program to print all the prime numbers
public class p4 {
	public static void isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(num+" is a prime");
		} else {
			System.out.println(num+" is not a prime");
		}
	}

	public static void main(String[] args) {
		isPrime(13);
		Scanner s = new Scanner(System.in);
		System.out.println("enter a no");
		int num = s.nextInt();
		isPrime(num);
	}
}
