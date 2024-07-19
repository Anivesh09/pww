import java.util.Scanner;

public class ap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter terms: ");
        int n =sc.nextInt();
        int a=5, d=-3;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a=a+d;
        }

    }
}
