package programs;
/*
1    
00   
111  
0000 
11111
program to print this pattern*/
public class p31 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				if(i>=j) {
					System.out.print((i+1)%2);
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
