class Node{
    int val;
    Node next;
    public Node right;
    public Node left;
    Node(int val){
        this.val = val;
    }
}
public class ll3 {
     
    public static void main(String[] args) {
        Node a = new Node(10);
      
        Node b = new Node(20);
        a.next = b;
        System.out.println(a);
        System.out.println(a.val);
        System.out.println(a.next);
        
        System.out.println(b);
        System.out.println(b.val);
        System.out.println(b.next);
    }
}
