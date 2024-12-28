package programs;

/*12345
1234
 123
  12
   1
   program to print this pattern*/
public class p7 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 1;i<=row;i++) {
			int num = 1;
			for(int j = 1;j<=col;j++) {
				if(j>=i) {
					System.out.print(num++);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
