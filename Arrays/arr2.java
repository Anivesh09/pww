import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arrays size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter arrays elements: ");
        for (int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= n-1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
