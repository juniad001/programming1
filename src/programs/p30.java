package programs;
/*
1    
23   
456  
7890 
12345
program to print this pattern*/
public class p30 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int num = 1;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				if(i>=j) {
					System.out.print(num++);
					if(num>9) {
						num = 0;
					}
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
