package programs;
/*
   ****
  ****
 ****
****
 * program to print this pattern
 */
public class p53 {
	public static void main(String[] args) {
		int row = 4;
		int space = row-1;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<4;k++) {
				System.out.print("*");
			}
			space--;
			System.out.println();
		}
	}

}
