package Strings;

import java.util.Arrays;

//wap to find the repeated characters or duplicate characters in a string
public class p10 {
	public static void duplicateString(String s) {
		char[] ch = s.toCharArray();
		duplicate2(ch);
	}
	public static void duplicate2(char [] a) {
		Arrays.sort(a);
		for(int i = 0;i<a.length-1;i++) {
			if(a[i] == a[i+1]) {
				System.out.println(a[i+1]);
			}
		}
	}
	public static void main(String[] args) {
		String s =  "Shradha kapoor";
		duplicateString(s);
	}
}
