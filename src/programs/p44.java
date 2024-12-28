package programs;
/* 
    A
   CBA
  EDCBA
 GFEDCBA
IHGFEDCBA

program to print this pattern*/
public class p44 {
	public static void main(String[] args) {
		int row = 5;
		int noch = 1;
		int space = row-1;
		for(int i = 0;i<row;i++) {
			char ch = (char)('A'+2*i);
			for(int j = 0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<noch;k++) {
				System.out.print(ch--);
			}
			System.out.println();
			noch += 2;
			space--;
		}
	}

}
