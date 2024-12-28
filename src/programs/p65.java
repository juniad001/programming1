package programs;
/*
*    *    *
 *   *   * 
  *  *  *  
   * * *   
    ***    
***********
    ***    
   * * *   
  *  *  *  
 *   *   * 
*    *    *

 * program to print this pattern
 */

public class p65 {
	public static void main(String[] args) {
		int row = 11;
		int col = 11;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				if(i==j||i+j==row-1||i==row/2||j==col/2) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
