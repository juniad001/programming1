package programs;
/*
A    
BA   
CBA  
DCBA 
EDCBA
program to print this pattern*/
public class p33 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i<row;i++) {
			//if a character added with integer then the sum is equal to integer so we need to type caste it to integer
			char ch = (char)('A'+i);
			for(int j = 0;j<col;j++) {
				if(i>=j) {
					System.out.print(ch--);
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
