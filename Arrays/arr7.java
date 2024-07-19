import java.util.Scanner;

public class arr7 {
    public static void main(String[] args) {

        // int x = 5;
        // System.out.println(x);
        // change(x);
        // System.out.println(x);
        // }

        // public static void change(int x) {
        // x = 10;

        // }

        int[] arr = { 12, 45, 65, 32, 48, 87 };
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr) {
        arr[0] = 10;

    }
}
