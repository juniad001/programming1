package numbers;
//program to check the no is prime or not
public class p8 {
	public static boolean isPrime(int n,int i) {
		if(n==2) return false;
		if(n%i==0) {
			return false;
		}
		if(i*i>n) {
			return true;
		}
		return isPrime(n,i+1);
	}
	public static void main(String[] args) {
		if(isPrime(5,2)) {
			System.out.println("It is a prime");
		}else {
			System.out.println("not a prime");
		}
	}
}
