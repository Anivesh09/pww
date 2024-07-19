import java.util.ArrayList;
import java.util.List;

public class ma2Darraylist {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        List<Integer> b = new ArrayList<>();
        b.add(50);
        b.add(60);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(70);
        d.add(80);

        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);

        // System.out.println(a+" "+a.size());
        // System.out.println(b+" "+b.size());
        // System.out.println(c+" "+c.size());
        // System.out.println(d+" "+d.size());
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println();
        System.out.println(l.get(1).get(1));
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            List<Integer> x = l.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
