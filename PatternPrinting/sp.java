
import java.util.Scanner;

public class sp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows and Columns: ");

        int n = sc.nextInt();
        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == mid || j == mid)
                    System.out.print("*" + " ");

                else
                    System.out.print(" " + " ");

            }
            System.out.println();

        }
    }

    // my code for odd number
    // for (int i = 1; i <= n; i++) {
    // if (i == (n + 1) / 2) {
    // for (int j = 1; j <= n; j++)
    // System.out.print("*"+" ");
    // } else {
    // for (int j = 1; j <= n; j++) {

    // if (j == (n + 1) / 2)
    // System.out.print("*"+" ");

    // else
    // System.out.print(" "+" ");

    // }
    // }
    // System.out.println();
    // }
}
