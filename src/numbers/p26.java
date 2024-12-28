package numbers;
//write a program to check whether the number is strong number
//try to correct it and corected it
public class p26 {
public static int fact(int n) {
	if(n==0 || n==1) return 1;
	return n * fact(n-1);
}
public static void strongnumber(int n) {
	int temp = n;
	int sum = 0;
	int lastdigit = 0;
	while(temp!=0) {
		lastdigit = temp%10;
		sum += fact(lastdigit);
		temp /=10;
	}
	System.out.println(sum);
	if(sum == n) {
		System.out.println("strong number");
	}else {
		System.out.println("not a strong number");
	}
}
public static void main(String[] args) {
	strongnumber(145);
}
}
