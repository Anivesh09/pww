import java.util.Scanner;

public class compositepattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
