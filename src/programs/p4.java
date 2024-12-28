package programs;

/*1
01
101
0101
10101
pgm to print this pattern*/
public class p4 {
	public static void main(String[] args) {
		int row = 5;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
	
}
