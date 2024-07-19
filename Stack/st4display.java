
import java.util.Stack;

public class st4display {
    public static void main(String[] args) {
        Stack<Integer> st_org = new Stack<>();
        System.out.println(st_org.isEmpty());
        st_org.push(12);
        st_org.push(18);
        st_org.push(23);
        System.out.println(st_org);

        while(st_org.size()>0 ){   //!st_org.isEmpty()
           System.out.println(st_org.pop());
        }
    }
}
