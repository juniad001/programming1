package programs;
/* 
    1
   212
  32123
 4321234
543212345


program to print this pattern*/

public class p42 {
    public static void main(String[] args) {
        int row = 5;    
        int noch = 1;     
        int space = row - 1; 

        for (int i = 0; i < row; i++) {
            int num = i + 1; 

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < noch / 2; k++) {
                System.out.print(num--);
            }

            for (int k = 0; k < (noch + 1) / 2; k++) {
                System.out.print(num++);
            }

            System.out.println(); 

            noch += 2;  
            space--;  
        }
    }
}

