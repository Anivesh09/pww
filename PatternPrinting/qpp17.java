import java.util.Scanner;

public class qpp17 {
    public static void main(String[] args) {
        // int n = 4; // Number of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
          
            for (int j = 1; j <=  2*n-1 ; j++) {
                if(i==j) System.out.print("*"+" ");
                else if(i+j==2*n) System.out.print("*"+" ");

                else System.out.print(" "+" ");
            }
            
            System.out.println(); // Move to the next line
        }
    }
}
