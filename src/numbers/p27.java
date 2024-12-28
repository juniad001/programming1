package numbers;

import java.util.Scanner;

//write a program to find the fascinating number
public class p27 {
	public static int noOfdigits(int num) {
		int digits = 0;
		while(num>0) {
			digits++;
			num/=10;
		}
		return digits;
	}
	public static boolean isFascinatingNo(int n) {
		boolean flag = true;
		String s = ""+n+n*2+n*3;
		for(char ch = '1';ch<='9';ch++) {
			int count = 0;
			for(int i = 0;i<s.length();i++) {
				if(s.charAt(i)==ch) {
					count++;
				}
			}
			if(count!=1) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if(noOfdigits(num)>=3) {
			if(isFascinatingNo(num)) {
				System.out.println(num+" is a fascinating number");
			}else {
				System.out.println(num+" is not a fascinating number");
			}
		}
		else {
			System.out.println("not a fascinating number");
		}
	}

}
