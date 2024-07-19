import java.util.Scanner;

public class starrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns");
        int m = sc.nextByte();
        int n = sc.nextByte();

        for (int i = 1; i <= m; i++) {
            for (int j = 1 ; j <= n ; j++) {
                System.out.print("* ");
                
            }
           System.out.println(); 
        }
    }
    
}
