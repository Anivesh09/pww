import java.util.Scanner;

public class qpp6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 3 * n; i++) {

            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();

        }

        for (int i = 1; i <= 3 * n; i++) {

            System.out.print("*");
        }
        System.out.println();

    }
}
