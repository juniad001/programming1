package Strings;
//wap to count no of vowels , consonants and digits
public class p8 {
	public static void main(String[] args) {
		String s = "Ramya is short and 45";
		s = s.toLowerCase();
		char [] ch = s.toCharArray();
		int vowelcount = 0;
		int consonantcount = 0;
		int digitcount = 0;
		for(char lv:ch) {
			if(lv=='a'||lv=='e'||lv=='i'||lv=='o'||lv=='u') {
				vowelcount++;
			}
			else if (lv>='a' && lv<'z') {
				consonantcount++;
			}
			else if (lv>='1' && lv<='9') {
				digitcount++;
			}
		}
		System.out.println(s);
		System.out.println(vowelcount);
		System.out.println(consonantcount);
		System.out.println(digitcount);
	}
}
