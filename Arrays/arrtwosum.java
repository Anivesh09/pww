public class arrtwosum {
    public static void main(String[] args) {
        int[] arr = {4,5,0,6,9,3};
        int x = 9;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]== x)
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
