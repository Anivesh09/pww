import java.util.Scanner;

public class arr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element: ");
        int x = sc.nextInt();
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                flag = true;
            break;
            }
        }
        System.out.println();
        if (flag == true)
            System.out.println("Element found ");
        else
            System.out.println("Element not found ");

    }
}
