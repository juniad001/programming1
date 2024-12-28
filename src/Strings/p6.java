package Strings;
//wap to swap string without using temp variable
public class p6 {
	public static void stringSwap(String s1,String s2) {
		//deepika padukone
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		/*here in s2 we take the substring of s1 from 0 to 13-8 which is from 0 to 7*/
		s1 = s1.substring(s2.length());//here substring of s1 from 7 to the end of the string s1
		System.out.println(s1);
		System.out.println(s2);
	}
	public static void main(String[] args) {
		String s1 = "deepika";
		String s2 = "padukone";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("after swaping");
		stringSwap(s1, s2);
	}
}
