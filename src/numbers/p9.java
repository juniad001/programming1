package numbers;

import java.util.Scanner;
//fibonacci series using function fib
public class p9 {
	public static void fib(int n) {
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i = 0;i<n-2;i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		fib(num);
	}
}
