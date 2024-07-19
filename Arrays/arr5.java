import java.util.Scanner;

public class arr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // int max = arr[0];

        // for (int i = 0; i < arr.length; i++) {

        //     if (arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println("Maximum element is: "+max);

        int max =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        System.out.println("Maximum element is: "+max);
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
        }
        System.out.println("Minimum element is: "+min);

    }
}
