package Strings;

import java.util.Arrays;

//wap to find the non repeated characters in the string
public class p11 {
	public static void main(String[] args) {
		String s = "shradha kapoor";
		char [] a = s.toCharArray();
			Arrays.sort(a);
			for(int i = 0;i<a.length-1;i++) {
				if(a[i] != a[i+1]) {
					System.out.println(a[i+1]);
				}
			}
		}
	} 
