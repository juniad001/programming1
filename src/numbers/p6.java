package numbers;

import java.util.Scanner;
//write a program to print the factorial of a number
public class p6 {
	public static int factorial(int n) {
		int fact = 1;
		for(int i = n;i>=1;i--) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		System.out.println(factorial(num));
	}

}
