import java.util.LinkedList;
import java.util.Queue;

public class q3 {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        // System.out.println(que);
        Queue<Integer> helper = new LinkedList<>();
        while(que.size() > 0){
            System.out.print(que.peek() + " ");
            helper.add(que.remove());
        }
        //for filling the queue again
        while (helper.size()>0) {
            que.add(helper.remove());
        }
        System.out.println(que);

    }
}
