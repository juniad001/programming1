package Strings;
//wap to reverse a sentence
public class p3 {
	public static void revsentence(String s) {
	//this is use to split from where we need to be split the array	ex from space or from any character
	//and we store it in a String array	
	String [] segments = s.split(" ");
	String reverse = "";
	for(int i = segments.length-1;i>=0;i--) {
		reverse = reverse+segments[i]+" ";
	}
	System.out.println(reverse);
	}
	public static void main(String[] args) {
		String s = "abhi is handsoome";
		System.out.println(s);
		revsentence(s);
	}
}
