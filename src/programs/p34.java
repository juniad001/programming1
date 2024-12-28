package programs;
/*
1    
21   
321  
4321 
54321
program to print this pattern*/
public class p34 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int num = 0;
		for(int i = 0;i<row;i++) {
			//if a character added with integer then the sum is equal to integer so we need to type caste it to integer
			
			num = num + i + 1;
			for(int j = 0;j<col;j++) {
				if(i>=j) {
					System.out.print(num--);
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
