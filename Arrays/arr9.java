import java.util.Arrays;

public class arr9 {
    public static void main(String[] args) {
        int arr[] = { 12, 45, 65, 32, 48, 87 };
        System.out.print("Array elements are: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        // shallow copy
        int[] nums = arr;
        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        // deep copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 95;
        for(int ele : brr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}

