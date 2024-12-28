package programs;
/*
*****
**  *
* * *
*  **
*****
 * program to print this pattern
 */

public class p62 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				if(i==0 ||i==4||j==0||j==4||i==j) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
