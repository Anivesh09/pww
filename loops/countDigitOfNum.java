import java.util.Scanner;

public class countDigitOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,  count=0;
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        while(n!=0){
            r = n/10;
            count++;
            n=r;
        }
        System.out.println("Number of digits: "+count);
    }
}
