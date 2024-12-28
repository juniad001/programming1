package programs;
/*
11111
2222 
333  
44   
5      
program to print this pattern*/
public class p23 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int num = 1;
		for(int i = 0;i<row;i++){
			for(int j = 0;j<col;j++) {
				if(i+j<=row-1) {
					System.out.print(num);
				}else {
					System.out.print(' ');
				}
			}
			num++;
			System.out.println();
		}
}

}
