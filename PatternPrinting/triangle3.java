
import java.util.Scanner;

public class triangle3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows and Columns: ");
    
        int n = sc.nextInt();

            
       
        for(int i = 1; i <= n; i++){
            // for(int j = 1; j <= i ; j++){
            //     System.out.print((2*j-1)+" ");
            //or
            for(int j = 1; j <=2*i-1 ; j += 2){
                System.out.print(j+" ");
            }
           System.out.println(); 

        }

    }
}

