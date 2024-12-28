package numbers;

import java.util.Scanner;

//write a program to find the root of any root
public class p25 {
	public static double pow(double base,double exponential) {
		double result  = 1.0;
		for(int i = 0;i<exponential;i++) {
			result *= base;
		}
		return result;
	}
	public static double root(int num,int n) {
		double root = num/n;
		double temp = 0;
		while(root-temp!=0) {
			temp = root;
			root = (((n-1)*(temp)+(num/pow(temp,n-1))))/n;
		}
		return root;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("enter the root");
		int r = sc.nextInt();
		System.out.println(root(n, r));
	}
}
