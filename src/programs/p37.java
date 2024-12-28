package programs;
/*
    1
   222
  33333
 4444444
555555555

program to print this pattern*/

public class p37 {
	public static void main(String[] args) {
		int row = 5;
		int noch = 1;
		int space = row-1;
		int num = 1;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<noch;k++) {
				System.out.print(num);
			}
			System.out.println();
			num++;
			noch+=2;
			space--;
		}
	}

}
