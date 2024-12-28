package numbers;
//program to print the fibonacci series using recursion
public class p10 {
	static int n1 = 0,n2 = 1,n3;
    public static void printfib(int count) {
    	if(count>0) {
    		n3 = n2 + n1;
    		System.out.print(", "+n3);
    		n1 = n2;
    		n2 = n3;
    		printfib(count-1);
    	}
    }
    public static void main(String[] args) {
		int count = 10;
		System.out.print(n1+", "+n2);
		printfib(count-2);
	}
}
