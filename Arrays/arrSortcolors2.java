public class arrSortcolors2 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 2, 1, 1, 1, 0, 0, 2, 2, 1, 1, 2, 0, 0, 2, 2, 0 };
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Dutch algorithm
        //one pass method
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                Swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 1)
                mid++;
            else if (arr[mid] == 2) {
                Swap(arr, mid, high);
                high--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}