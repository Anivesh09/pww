
import java.util.Scanner;

public class revtriangle1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows and Columns: ");
    
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*"+" ");
                
            }
           System.out.println(); 
        }
            
        // //other ways
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n+1-i ; j++){
        //         System.out.print("*"+" ");
        //     }
        //    System.out.println(); 

        // }

    }
}

