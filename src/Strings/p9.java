package Strings;
//wap to reverse a string using recursion
public class p9 {
	public static String recStringrev(String s) {
		if(s.length() == 1) return s;
		return s.charAt(s.length()-1) + recStringrev(s.substring(0,s.length()-1));
	}
	public static void main(String[] args) {
		String s = "java";
		System.out.println(recStringrev(s));
	}
}
