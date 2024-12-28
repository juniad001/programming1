package programs;

/*
    1
   21
  321
 4321
54321
program to print this pattern*/
public class p27 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++){
			int num = 5;
			for(int j = 0;j<col;j++) {
				if(i+j>=row-1) {
					System.out.print(num--);
				}else {
					System.out.print(' ');
					num--;
				}
			}
			System.out.println();
		}
}

}
