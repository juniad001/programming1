package programs;

/******
 **** 
 *** 
 ** 
 * 
 * program to print this pattern I'm not undertanding this and i need to solve it
 */
public class p15 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				if(j>=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
