import java.util.Scanner;

public class gp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter terms: ");
        int n =sc.nextInt();
        int a=3, r=4;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a=a*r;
        }

    }
}
