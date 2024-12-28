package numbers;
//to take the digits from whereever i want
public class p21 {
	public static void digits(int n) {
		int x = 1;
		for(int i = 0;i<6/2;i++) {
			x = x*10;
		}
		int n1 = n/x;
		System.out.println(n1);
	}
public static void main(String[] args) {
	digits(234433);
}
}
