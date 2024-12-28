package programs;

/*ABCDE
FGHI
 JKL
  MN
   O
program to print this pattern*/
public class p12 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		char ch = 'A';
		for(int i = 1;i<=row;i++) {
			for(int j = 1;j<=col;j++) {
				if(j>=i) {
					System.out.print(ch++);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	}
