package Strings;
//wap to count the no of words in a sentence
public class p4 {
	public static int countwords(String s) {
		String [] s1 = s.split(" ");
		int count = 0;
		for(int i = 0;i<s1.length;i++) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countwords("hey this is"));
	}
}
