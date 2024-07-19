import java.util.LinkedList;
import java.util.Queue;

public class q1 {
    public static void main(String[] args) {
      Queue<Integer> que = new LinkedList<>();
      System.out.println(que.isEmpty());

      System.out.println(que.size());
      que.add(10);  
      que.add(11);  
      que.add(13);  
      que.add(15);
      System.out.println(que);  
      que.remove();
      System.out.println(que); 
      que.poll(); 
      System.out.println(que);
      System.out.println(que.peek());
      System.out.println(que.size());
      System.out.println(que.isEmpty());
    }
}
