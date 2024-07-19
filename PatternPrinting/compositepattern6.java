import java.util.Scanner;

public class compositepattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int n = sc.nextInt();

        for (int k = 1; k <= 2 * n - 1; k++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        n--;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*" + " ");

            }
            for (int j = 1; j <= 2 * i - 1; j ++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();

        }

    }
}
