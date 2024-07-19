import java.util.Stack;

public class st2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(12);
        st.push(18);
        st.push(23);
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.size());

        //to access first element inserted in any stack
        while(st.size()>1){
            st.pop();
        }
        //size has become 1
        System.out.println(st.peek());
    }
}
