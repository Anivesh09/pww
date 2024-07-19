import java.util.LinkedList;
import java.util.Queue;

public class q4evenremove {
    static Queue<Integer> que;
    static Queue<Integer> newQue;

    static void removeEven(){
        newQue = new LinkedList<>();
        while (!que.isEmpty()) {
            que.remove();
            if(!que.isEmpty()){
                newQue.add(que.remove());
            }
        }
        que = newQue;
    }
    public static void main(String[] args) {
        que = new LinkedList<>();
        que.add(11);
        que.add(22);
        que.add(33);
        que.add(44);
        que.add(55);
        que.add(66);
        que.add(77);
        que.add(88);
        que.add(99);
        que.add(9);
        System.out.println(que);
        removeEven();
        System.out.println(que);
    }
}
