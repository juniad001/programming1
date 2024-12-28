package programs;
/*
****
 ***
  **
   *
  **
 ***
****
 * program to print this pattern
 */
public class p66 {

	public static void main(String[] args) {
		int row = 7;
		int space = 0;
		int noch = 4;//or row/2+1;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<noch;k++) {
				System.out.print('*');
			}
			if(i<row/2) {
				space++;
				noch--;
			}else {
				space--;
				noch++;
			}
			System.out.println();
		}

	}

}
