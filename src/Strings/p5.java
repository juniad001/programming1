package Strings;
//wap to find the longest word in a sentence
public class p5 {
	public static String longestword(String s) {
		//Arnold is a good bodybuilder
		String lword = "";
		String [] x = s.split(" ");
		for(int i = 0;i<x.length;i++) { //here length is a method of array
			if(x[i].length()>lword.length()) { //here length is a method of String
				lword = x[i];
			}
		}
		return lword;
	}
	public static void main(String[] args) {
		String s = new String("Arnold is a good bodybuilder");
		System.out.println("longest word in the sentence is = "+longestword(s));
	}
}
