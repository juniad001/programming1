package Strings;
//write a program to sort the characters in string
public class p2 {
	public static void Stringsort(String s) {
		char [] ch = s.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			for(int j = 1;j<ch.length;j++) {
				if(ch[j]<ch[j-1]) {
					char temp = ch[j-1];
					ch[j-1] = ch[j];
					ch[j] = temp;
				}
			}
		}
		String s1 = new String(ch);
		System.out.println(s1);
	}
	public static void main(String[] args) {
		String s1 = new String("cba");
		System.out.println("before sorting "+s1);
		System.out.println("after sorting");
		Stringsort(s1);
	}

}
