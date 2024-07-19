import java.util.ArrayList;

public class arrlt10 {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,80);
        arr.add(3,16);
        arr.add(4,30);
        arr.add(5,1);
        System.out.println(arr);
        for (int i = 0; i < 6; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.set(0, 5);
        System.out.println(arr);


    }
}
