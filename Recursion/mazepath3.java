import java.util.Scanner;

public class mazepath3 {
    public static int maze3(int m, int n){
        if (m == 1)  return 1;
        if (n == 1)  return 1;
        int rightways = maze3( m, n-1);
        int downways = maze3( m-1, n);
        return rightways + downways ;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m:");
        int m = sc.nextInt();
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.println(maze3(m,n));
    }
}
