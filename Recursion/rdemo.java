import java.util.Scanner;

public class rdemo {
    public static int stair (int n){
        if(n==1) return 1;
        if(n==2) {
            return 1;
        }
        if(n==3) return 2;
        

        

        return stair(n-1)+stair(n-3);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any n: ");
        int n = sc.nextInt();
        System.out.println(stair(n));
    }
}
