import java.util.Scanner;

public class sp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows and Columns: ");

        int n = sc.nextInt();
        // //my method
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {

        // if (i == j || j % 2 == 1 && i % 2 == 1 || j % 2 == 0 && i % 2 == 0) {
        // System.out.print("1" + " ");
        // } else {
        // System.out.print("0" + " ");
        // }
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0)
                    System.out.print("1" + " ");
                else
                    System.out.print("0" + " ");

            }
            System.out.println();
        }
    }
}
