import java.util.Scanner;

public class mazepath2 {
    public static int maze(int row, int col, int m, int n){
        // if(row == m || col == n) return 1;
        if (row == m && col == n)  return 1;
        if (row > m || col > n)  return 0;
        int rightways = maze(row+1, col, m, n);
        int downward = maze(row, col+1, m, n);
        return rightways + downward ;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m:");
        int m = sc.nextInt();
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.println(maze(1,1,m,n));
    }
}
