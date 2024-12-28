package programs;
/*
*    *
**   **
***  ***
**** ****
**********
 * program to print this pattern
 */
public class p68 {
	public static void main(String[] args) {
		int row = 5;
		int space = row-1;//or 2*row -2
		int noch = 1;
		for(int i = 0;i<row;i++) {
			for(int k = 0;k<noch;k++) {
				System.out.print('*');
			}
			for(int j = 0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<noch;k++) {
				System.out.print('*');
			}
			System.out.println();
			space --;
			noch++;
			
		}
	}

}
