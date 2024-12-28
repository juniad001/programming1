package programs;
/*
    A
   BA
  CBA
 DCBA
EDCBA
program to print this pattern*/
public class p28 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++){
			char ch = 'E';
			for(int j = 0;j<col;j++) {
				if(i+j>=row-1) {
					System.out.print(ch--);
				}else {
					System.out.print(' ');
					ch--;
				}
			}
			System.out.println();
		}
}
}
