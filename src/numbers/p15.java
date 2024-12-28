package numbers;
//program to check whether the number is peterson or not
public class p15 {
	public static int fact(int n) {
		if(n==1 || n==0) return 1;
		return n * fact(n-1);
	}
	  public static void peterson(int n) {
	        int originalNumber = n;  // Store the original number to compare later
	        int sum = 0;

	        // Loop through each digit of the number
	        while (n > 0) {
	            int rem = n % 10;      // Get the last digit
	            sum += fact(rem);      // Add the factorial of the digit to the sum
	            n = n / 10;            // Remove the last digit from the number
	        }

	        // Compare the sum with the original number
	        if (sum == originalNumber) {
	            System.out.println(originalNumber + " is a Peterson number.");
	        } else {
	            System.out.println(originalNumber + " is not a Peterson number.");
	        }
	    }
	public static void main(String[] args) {
		peterson(145);
	}

}
