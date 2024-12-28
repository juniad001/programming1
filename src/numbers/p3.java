package numbers;

import java.util.Scanner;

//program to check whether a no is prime no
public class p3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a no");
		int num = s.nextInt();
		boolean flag = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("prime");
		} else {
			System.out.println("not a prime");
		}

	}
}
