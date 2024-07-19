
public class ll6 {
     
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;

        Node temp = a;
        for (int i = 1; i < 5; i++) {
            System.out.println(temp.val);
            temp = temp.next;
            
        }
       
    }
}
