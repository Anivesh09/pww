public class demo2 {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10,25,8,4,12};
        print(arr);
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int mindx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[mindx]){
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);

    }
    
}
