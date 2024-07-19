// import java.util.Arrays;

public class bubblesort1 {
    public static void main(String[] args) {
        // int[] arr = {7,1,2,8,-4};
        // int[] arr = {3,1,2,5,4};
        int[] arr = {5,4,3,2,1};

        int n = arr.length;

        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        // Arrays.sort(arr);
        // for (int ele : arr) {
        //     System.out.print(ele+" ");
        // }
        // System.out.println();
       for (int x = 0; x < n-1; x++) {
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1] = temp;
            }
        }
       }
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}
