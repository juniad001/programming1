package programs;
/* 
    1
   212
  32123
 4321234
543212345



program to print this pattern*/

public class p41 {
	public static void main(String[] args) {
		int row = 5;
		int noch = 1;
		int num = 1;
		int space = row-1;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<noch;k++) {
				if(k<(noch/2)) {
					System.out.print(num--);
				}else {
					System.out.print(num++);
				}
			}
			System.out.println();
			noch+=2;
			space--;
		}
	}
}

