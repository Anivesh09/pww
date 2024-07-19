import java.util.Scanner;

public class sumOfDigits

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, s = 0;
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        while (n != 0) {
            r = n % 10;ṭ

            s = s + r;
            n = n / 10;
        }
        System.out.println("Sum of digits: " + s);
    }
}
