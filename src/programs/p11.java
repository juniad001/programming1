package programs;

public class p11 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int num = 1;
		for(int i = 1;i<=row;i++) {
			for(int j = 1;j<=col;j++) {
				if(j>=i) {
					System.out.print(num++);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
