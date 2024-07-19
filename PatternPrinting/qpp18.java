import java.util.Scanner;

public class qpp18 {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < n; j++) {
                if (i + j == n + 1)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }

            for (int j = n; j <= 2 * n - 1; j++) {
                if (j - i == n - 1)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }

            System.out.println();
        }
        for (int i = n+1; i <=2*n-1; i++) {

            for (int j = 1; j <=n; j++) {
                if (i - j == n - 1)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }

            for (int j = n+1; j <= 2 * n - 1; j++) {
                if (j + i == 3*n - 1)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }

            System.out.println();
        }
    }
}
