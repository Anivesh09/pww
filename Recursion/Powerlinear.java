
import java.util.Scanner;

public class Powerlinear {
    // public static int power(int a, int b) {
    // if( a==0 && b==0){
    // System.out.println("Not defined");
    // return -1;
    // }
    // if ( b == 0) return 1;
    // return a * power(a, b - 1);
    // }

    
    public static int power(int a, int b) {
       
        if (b == 0) return 1;
        int ans = power(a, b/2);
        if(b%2==0) return ans*ans;
        else return a*ans*ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        System.out.print("Enter no powers: ");
        int b = sc.nextInt();

        System.out.println(power(a, b));

    }
}
