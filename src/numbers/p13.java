package numbers;

import java.util.Scanner;

//write a program to check whether a no is armstrong number
public class p13 {
public static void armstrong(int n) {
	int count = 0;
	int temp = n;
	//for counting the digits
	while(temp>0) {
		count++;
		temp = temp/10;
	}
	//for giving power and adding the number
	temp = n;
	int sum = 0;
	int rem;
	while(temp>0) {
		int pow = 1;
		rem = temp%10;
		for(int i = 0;i<count;i++) {
			pow = pow * rem;
		}
		temp = temp/10;
		sum = sum + pow;
	}
	if(n == sum) {
		System.out.println("armstrong number");
	}else {
		System.out.println("Not a armstrong number");
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	armstrong(num);
	
}
}
