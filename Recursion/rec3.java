
import java.util.Scanner;

public class rec3 {
    public static void print(int n){
        if(n==0) return ;
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int n=sc.nextInt();
        print(n);
    }
}
