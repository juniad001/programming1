package programs;
//printing the patterns 10101 in place of starss
public class p1 {
	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				if(j%2 == 0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
