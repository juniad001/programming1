package programs;

/*
    1
   10
  101
 1010
10101
program to print this pattern*/
public class p21 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++){
			for(int j = 0;j<col;j++) {
				if(i+j>=row-1) {
					System.out.print((i+j+1)%2);
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
