package programs;

/*
ABCDE
 BCDE
  CDE
   DE
    E
program to print this pattern*/
public class p6 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++) {
			char ch = 'A';
			for(int j = 0;j<col;j++) {
				if(i<=j) {
					System.out.print(ch++);
				}else {
					System.out.print(' ');
					ch++;
				}
			}
			System.out.println();
		}
	}
}
