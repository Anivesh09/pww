
import java.util.Scanner;

public class rec4 {
    static int n;
    public static void print(int x) {

        if (x>n) return;
        // print(n - 1);
        System.out.println(x);
        print(x+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");

         n = sc.nextInt();
        print(1);
    }
}
