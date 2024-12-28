package programs;
/*
12345
2345
345
45
5 
program to print this pattern not understanding*/
public class p35 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++) {
			int num = i + 1;
			for(int j = 0;j<col;j++) {
				if(j>=i) {
					System.out.print(num++);
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
