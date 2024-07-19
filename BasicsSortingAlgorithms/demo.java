public class demo {

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10,25,8,4,12};
        // int arr[] = {5,4,3,2,1};

        print(arr);

        int n= arr.length;
       for (int j = 0; j <n-1; j++) {
        boolean flag = false;
        for (int i = 0; i < n-1-j; i++) {
            
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                flag = true;
            }
        }
        if(flag==false)  break;
       }
        print(arr);
    }
}
