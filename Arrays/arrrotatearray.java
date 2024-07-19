public class arrrotatearray {
    public static void main(String[] args) {
        int[] arr = { 10, 38, 43, 16, 9, 54, 76, 23 };
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(); 
        for (int ele : Reverse) {
            System.out.print(ele + " ");
        }
    }
    public static void Reverse(int[] arr, int i, int j) {
        while(i<=j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }

        
    }
    public static void Rotate(int[] arr,int k) {
        int n = arr.length;
        
        k =4;
    Reverse(arr, 0 , n-k-1);
    Reverse(arr,  n-k, n);
    Reverse(arr, 0 , n);

   
        
  

    }
    




}
