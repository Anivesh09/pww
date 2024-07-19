import java.util.Stack;

public class st3reverse {
    public static void main(String[] args) {
        Stack<Integer> st_org = new Stack<>();
        System.out.println(st_org.isEmpty());
        st_org.push(12);
        st_org.push(18);
        st_org.push(23);
        System.out.println(st_org);
        System.out.println(st_org.size());
        System.out.println(st_org.peek());

        Stack<Integer> st_rev = new Stack<>();


        while(!st_org.isEmpty()){
           st_rev.push( st_org.pop());
        }
        System.out.println(st_rev.peek());
        System.out.println(st_rev);
    }
}
