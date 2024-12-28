package numbers;

import java.util.Scanner;

//factorial using recursion

public class p7{
	public static int factorial(int num) {
		if(num==1 || num==0) return 1;
		return num * factorial(num-1);
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number to find the factorial");
		int num = s.nextInt();
		System.out.println(factorial(num));
	}
}