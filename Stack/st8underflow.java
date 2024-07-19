import java.util.Stack;

public class st8underflow {
    public static void main(String args[]){
     
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(45);
        st.push(62);
        st.push(86);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);

        st.pop();
        System.out.println(st);

    }

}
