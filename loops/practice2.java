import java.util.Scanner;

public class practice2 {
   public static void main(String[] args)
    { Scanner sc = new Scanner(System.in);
       System.out.print("Enter terms: "); 
       int n = sc.nextInt(); int count = 0; 
       for (int i = 2; i &lt;= n - 1; i++) 
       { if (n % i == 0) { count++; } } 
       if (count >= 1) { System.out.println("Composite number"); }
        else 
        { System.out.println("Not a Composite number"); } 
      }
}
