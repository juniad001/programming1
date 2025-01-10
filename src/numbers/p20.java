package numbers;

import java.util.Scanner;

//write a program to check whether a number is tech number
public class p20 {
	public static boolean techno(int n,int digits) {
		int x = 1;
		for(int i = 0;i<digits/2;i++) {
			x *= 10; //here the values will be 10 or 100 based on conditions
		}
		int n1 = n/x; //here we divide
		int n2 = n%x;//here we take modulus
		int sum = (n1+n2) * (n1+n2); //here we add qoutient and remainder
		if(sum==n) return true;
		else return false;
	}
	public static int noOfDigits(int n) {
		int digits = 0;
		while(n>0) {
			digits++;
			n/=10;
		}
		return digits;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int digits = noOfDigits(num);
		if(digits%2==0) {
			if(techno(num, digits)) {
				System.out.println("tech number");
			}else {
				System.out.println("not a tech number");
			}
			
		}else {
			System.out.println("no doesn't continue with even no of digits");
		}
	}
}
