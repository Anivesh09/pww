
import java.util.Stack;

public class st5pushbottom {
    public static void main(String[] args) {
        Stack<Integer> st_org = new Stack<>();
        System.out.println(st_org.isEmpty());
        st_org.push(12);
        st_org.push(18);
        st_org.push(23);
        System.out.println(st_org);
        int element = 50;

        Stack<Integer> st_temp = new Stack<>();

        while(st_org.size()>0 ){  
           st_temp.push(st_org.pop());
        }
        // System.out.println(st_temp);

        st_org.push(element);
        while(st_temp.size()>0 ){  
            st_org.push(st_temp.pop());
         }
         System.out.println(st_org);
    }
}
