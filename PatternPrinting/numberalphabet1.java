import java.util.Scanner;

public class numberalphabet1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns");
    
        int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1 ; j <= n ; j++) {
        //         System.out.print((char)(i+64)+" ");
                
        //     }
        //    System.out.println(); 
        // }
        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= n ; j++) {
                System.out.print((char)(j+96)+" ");
                
            }
           System.out.println(); 
        }
    }
}
