import java.util.Arrays;

public class arrtwopointers {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 9, 5, 7, 20 };
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // /*
        //  * for (int i = 0; i < n / 2; i++) {
        //  * int temp = arr[i];
        //  * arr[i] = arr[n - 1 - i];
        //  * arr[n - 1 - i] = temp;
        //  * }
        //  * for (int ele : arr) {
        //  * System.out.print(ele + " ");
        //  * }
        //  */

        // // pointer method
        // /*
        //  * int i = 0, j = n - 1;
        //  * while (i <= j) {
        //  * int temp = arr[i];
        //  * arr[i] = arr[j];
        //  * arr[j] = temp;
        //  * i++;
        //  * j--;
        //  * }
        //  * 
        //  * for (int ele : arr) {
        //  * System.out.print(ele + " ");
        //  * }
        //  */
        
        int i = 0, j = n - 1;
        while (i <= j) {
            Swap(arr, i, j);
            i++;
            j--;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
