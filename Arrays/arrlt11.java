import java.util.ArrayList;

public class arrlt11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " " + list.size());
        list.add(40);
        System.out.println(list + " " + list.size());
        list.add(78);
        System.out.println(list + " " + list.size());
        list.add(65);
        System.out.println(list + " " + list.size());
        list.add(92);
        System.out.println(list + " " + list.size());
        list.add(70);
        System.out.println(list+" "+list.size());
        list.remove(4);
        System.out.println(list+" "+list.size());


    }
}
