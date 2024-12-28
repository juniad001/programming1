package numbers;
//multiple recursion call using fibonacci series 
public class p12 {
	public static int fib(int n) {
		if(n<=1) return n;
		int lastdigit = fib(n-1);
		int seclastdigit = fib(n-2);
		return lastdigit + seclastdigit;
	}
	public static void main(String[] args) {
		int n1 = 0;
		int n2  = 1;
		int n = 10;
		System.out.print(fib(n));
	}
}
