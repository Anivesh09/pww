class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class ll2 {
     
    public static void main(String[] args) {
        Node a = new Node(10);
        System.out.println();
        System.out.println(a);
        System.out.println(a.val);
        System.out.println(a.next);
        Node b = new Node(10);
        System.out.println(b);
        System.out.println(b.next);
        Node c = new Node(30);
        Node d = new Node(40);
        System.out.println(c.val);
        System.out.println(d.val);


    }
}
