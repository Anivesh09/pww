import java.util.Scanner;

public class compositepattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        // for(int j = 1; j<=n-i;j++){
        // System.out.print(" "+" ");
        // }
        // for(int j=1; j<=2*i-1;j++){
        // System.out.print("*"+" ");
        // }

        // System.out.println();
        // }

        // second method
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");

            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nst += 2;
            // nsp =0; nst = 7
        }
        int nosp = 1;
        int nost = 2 * n - 3;

        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j <= nosp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nost; j++) {
                System.out.print("*" + " ");
            }

            nosp++;
            nost -= 2;
            System.out.println();

        }

    }
}
