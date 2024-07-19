import java.util.Scanner;

public class st1 {
    public static void main(String[] args) {
        char[] ch = {'A','n','i','v','e','s','h'};
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println("\n"+"Anivesh");
        String x = "Anivesh is a Coder!!!";
        System.out.println(x);
        Scanner sc = new Scanner(System.in);
        // String str = sc.next(); // for one word
        String str = sc.nextLine();  //for whole line

        System.out.print("Hi"+" ");
        System.out.println(str); 


    }
}
