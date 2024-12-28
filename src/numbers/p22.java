package numbers;
//write a program to find the squareroot of a number
public class p22 {
	public static int squareroot(int n) {
		double sqrt = n/2;
		double temp = 0;
		while(sqrt-temp!=0) {
			temp = sqrt;
			sqrt = (temp + n/temp)/2;
		}
		return (int)sqrt;
	}
	public static void main(String[] args) {
		System.out.println(squareroot(27));
	}
}
