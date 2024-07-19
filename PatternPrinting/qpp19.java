import java.util.Scanner;

public class qpp19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n : ");
        // int n =sc.nextInt();
        int n = 4;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = i; j <=i ; j++) {
                System.out.print(i);
            }
            for (int j = 2*i-1; j >2 ; j--) {
                System.out.print(" "+" ");
            }
            for (int j =i; j <=i; j++) {
               if(i!=1) System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
