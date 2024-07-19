
public class ll10demo {

   public static void rec(Node head){
      if(head == null) return;
      rec(head.next);
      System.out.println(head.val);
  }
   public static void main(String[] args) {
    Node a = new Node(15);
    Node b = new Node(25);
    Node c = new Node(45);
    a.next=b;
    b.next=c;
    rec(a);
   } 
}
