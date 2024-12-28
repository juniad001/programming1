package programs;

/*
    5
   45
  345
 2345
12345
program to print this pattern*/
public class p26 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++){
			int num = 1;
			for(int j = 0;j<col;j++) {
				if(i+j>=row-1) {
					System.out.print(num++);
				}else {
					System.out.print(' ');
					num++;
				}
			}
			System.out.println();
		}
}

}
