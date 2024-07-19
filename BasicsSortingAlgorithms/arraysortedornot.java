public class arraysortedornot {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,8,9};
        int n = arr.length;

        boolean flag = true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
            flag = false;
            break;
            }
        }
        if(flag==true) System.out.println("sorted");
        if(flag==false) System.out.println("unsorted");

    }
}
