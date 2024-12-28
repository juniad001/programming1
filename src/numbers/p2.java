package numbers;

import java.util.Scanner;

//program to check a number is a palindrome or not
public class p2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check a no is palinddrome or not");
		int num = s.nextInt();
		int temp = num;
		int rem;
		int rev = 0;
		while (temp > 0) {
			rem = temp % 10;
			rev = (rev * 10) + rem;
			temp = temp / 10;
		}
		if (num == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

}
