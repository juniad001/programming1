package numbers;

import java.util.Scanner;

//write a program to find the cube root 
public class p23 {
	public static int cuberoot(int n) {
		double cuberoot = n/3;
		double temp = 0;
		while(cuberoot-temp!=0) {
			temp = cuberoot;
			cuberoot = ((2*temp)+(n)/(temp*temp))/3;
		}
		return (int)cuberoot;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		System.out.println(cuberoot(num));
		System.out.println(cuberoot(27));
	}
}
