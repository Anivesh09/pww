import java.util.Arrays;

public class arr8 {
    public static void main(String[] args) {
        int arr[] = { 12, 45, 65, 32, 48, 87 };
        System.out.print("Array elements are: ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // for each loop
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.print("Sorted arrays: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }

}
