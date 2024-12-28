package Strings;
//wap to check a string is a palindrome or not
public class p1 {
	public static String reverse(String s) {
		String reverse = "";
		for(int i = s.length()-1;i>=0;i--) {
			reverse = reverse+s.charAt(i);
		}
		return reverse;
		
	}
	public static void main(String[] args) {
		String s = "TOT";
		String reverse = reverse(s);
		if(s.contentEquals(reverse)) {//use inbuilt functions like this
			System.out.println("palindrome");
		}else {
			System.out.println("not a palidrome");
		}
	}
}
