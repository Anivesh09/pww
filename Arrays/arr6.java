import java.util.Scanner;

public class arr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,45,65,32,48,87};
        // System.out.println("Enter array elements: ");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        System.out.print("Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     

        int max =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        System.out.println("Maximum element is: "+max);
        // arr[z]=arr[max];
        int smax =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != max) smax = Math.max(smax,arr[i]);
        }
        System.out.println("Second maximum element is: "+smax);
        

        int min =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
        }
        System.out.println("Minimum element is: "+min);

    }
}
