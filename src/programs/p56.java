package programs;

/*
    *
   * *
  *   *
 *     *
*       *
*       *
 *     *
  *   *
   * *
    *
 * program to print this pattern
 */
public class p56 {
	public static void main(String[] args) {
		int row = 5;
		int space = 4;
		int noch = 1;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<noch;k++) {
				if(k==0 || k==noch-1) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
			noch += 2;
			space--;
		}
		int row1 = 5;
		int space1 = 0;
		int noch1 = 2*row-1;
		for(int i = 0;i<row1;i++) {
			for(int j = 0;j<space1;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<noch1;k++) {
				if(k==0 ||k==noch1-1) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
			noch1 -=2;
			space1++;
		}
	}

}
