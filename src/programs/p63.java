package programs;
/*
*****
** **
* * *
** **
*****
 * program to print this pattern
 */

public class p63 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				if(i==0 ||i==4||j==0||j==4||i==j||i+j==row-1) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
