package programs;

/*1
10
101
1010
10101
this program prints this pattern*/
public class p3 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				if(i>=j) {
					if(j%2 == 0) {
						System.out.print(1);
					}else {
						System.out.print(0);
					}
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}