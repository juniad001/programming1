package programs;

/*EDCBA
DCBA
 CBA
  BA
   A
program to print this pattern*/
public class p9 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 1;i<=row;i++) {
			char ch = 'E';
			for(int j = 1;j<=col;j++) {
				if(j>=i) {
					System.out.print(ch--);
				}else {
					System.out.print(" ");
					ch--;
				}
			}
			System.out.println();
		}
	}
}
