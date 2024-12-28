package numbers;

import java.util.Scanner;

//write a program to find the sunny number
public class p24 {
public static double squareroot(int n) {
	double squareroot = n/3;
	double temp = 0;
	while(squareroot-temp != 0) {
		temp = squareroot;
		squareroot = (temp + n/temp)/2;
	}
	return squareroot;
}
public static void sunny(int n) {
	double sqrt = squareroot(n);
	if(sqrt%1==0) {
		System.out.println(n+" is a sunny number");
	}else {
		System.out.println(n+" is not a sunny number");
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no");
	int n = sc.nextInt();
	sunny(n);
}
}
