import java.util.Scanner;

public class arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total nos. of students: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter marks of students: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("All marks of students are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("All marks of students greater than 35 are: ");
        for (int i = 0; i < arr.length; i++) {
             if (arr[i] > 35) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        int sum=0;
        System.out.println("Sums are: ");
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.print(sum );

    }
}
