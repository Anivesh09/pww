
public class bubblesort3optimised {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] arr = {7,1,2,8,-4};
        // int[] arr = {3,1,2,5,4};
        int[] arr = { 9, 7, 6, 4, 3, 1 };
        print(arr);
        int n = arr.length;

        // for (int x = 0; x < n - 1; x++) {
        // for (int i = 0; i < n - 1 - x; i++) {
        // if (arr[i] > arr[i + 1]) {
        // int temp = arr[i];
        // arr[i] = arr[i + 1];
        // arr[i + 1] = temp;
        // }
        // }
        // boolean flag = true;
        // for (int i = 0; i < n-1-x; i++) {
        // if(arr[i]>arr[i+1]){
        // flag = false;
        // break;
        // }
        // }
        // if(flag == true) break;

        // }
        // print(arr);
        for (int x = 0; x < n - 1; x++) {
            boolean flag = true;

            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;

                }
                if (flag == true)
                    break;

            }

        }
        print(arr);
    }
}
