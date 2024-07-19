import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class q2reverse {
    static Queue<Integer> queue;
    static void print(){
     System.out.println(queue);
    }
    static void reversequeue(){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
    public static void main(String[] args) {
        queue  = new LinkedList<>();
        queue.add(11);
        queue.add(12);
        queue.add(14);
        queue.add(15);
        queue.add(17);
        queue.add(18);
        print();
        System.out.println("reversing the queue");
        reversequeue();
        print();
    }
}
