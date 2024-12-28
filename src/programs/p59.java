package programs;
/*
*******
 *****
  ***
   *
  ***
 *****
*******
 * program to print this pattern
 */
public class p59 {
	public static void main(String[] args) {
		int row=7;
		int space = 0;
		int noch = row;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<noch;k++) {
				System.out.print('*');
			}
			System.out.println();
			if(i<row/2) {
				noch -= 2;
				space++;
			}else {
				noch += 2;
				space--;
			}
		}
	}

}
