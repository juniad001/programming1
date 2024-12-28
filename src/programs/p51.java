package programs;
/* 
ABCDE
 ABC
  A
program to print this pattern*/
public class p51{
	public static void main(String[] args) {
		int row = 3;
		int space = 0;
		int noch = (row*2)-1;
		for(int i = 0;i<row;i++) {
			char ch = 'A';
			for(int j = 0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<noch;k++) {
				System.out.print(ch++);
			}
			System.out.println();
			noch-=2;
			space++;
		}
	}
}
