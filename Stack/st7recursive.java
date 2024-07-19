import java.util.Stack;

public class st7recursive {
    public static void displayReverse(Stack<Integer> st){
        if(st.isEmpty()) return;     //can be my st.size()==0
        int top = st.pop();
        // System.out.println(top);   //to print original
        displayReverse(st);
        System.out.println(top);   //to print reverse

        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st_org = new Stack<>();
        System.out.println(st_org.isEmpty());
        st_org.push(12);
        st_org.push(18);
        st_org.push(23);
        st_org.push(55);
        //myside
        // int top1 = st_org.pop();

        // System.out.println(st_org);
        // while (!st_org.isEmpty()) {
        //     System.out.println(st_org.pop());
        // }
        // st_org.push(top1);
        // System.out.println();

        displayReverse(st_org);
    }
}
