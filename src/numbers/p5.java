package numbers;

import java.util.Scanner;

public class p5 {
	public static void isPrime(int num) {
		boolean flag = true;
			for (int i = 2; i <= num/2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(num);
			}
		}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i = 0;i<num;i++) {
			isPrime(i);
		}
	}

}
