package numbers;

import java.util.Scanner;

//write a program to check whether the number is automorphic number
public class p11 {
	public static boolean automorphic(int num) {
		int square = num*num;
		boolean flag = true;
		while(num>0) {
			if(num%10 != square%10) {
				flag = false;
				break;
			}
			num = num/10;
			square = square/10;
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check the number");
		int num = sc.nextInt();
		if(automorphic(num)) {
			System.out.println(num+" yes it is automorphic number");
		}else {
			System.out.println(num+" not a automorphic number");
		}
		
	}
}
