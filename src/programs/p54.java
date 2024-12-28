package programs;

/*
    *
   * *
  *   *
 *     *
*********
 * program to print this pattern
 */
public class p54 {
	public static void main(String[] args) {
		int row = 5;
		int space = 4;
		int noch = 1;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<noch;k++) {
				if(k==0 || k==noch-1 ||i==row-1) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
			noch += 2;
			space--;
		}
	}

}
