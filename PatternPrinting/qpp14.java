import java.util.Scanner;

public class qpp14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print((char) (j + 64) + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print((char)(j+64) + " ");

            }
            System.out.println();

        }

    }
}
