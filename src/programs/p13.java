package programs;

/*
10101
 0101
  101
   01
    1
program to print this pattern*/
public class p13 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				if(j>=i) {
					if(j%2==0) {
						System.out.print(1);
					}else {
						System.out.print(0);
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
