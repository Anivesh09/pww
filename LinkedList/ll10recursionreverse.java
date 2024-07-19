
public class ll10recursionreverse {
    
    public static void displayrecursive(Node head){
       if(head == null) return;
       displayrecursive(head.next);
       System.out.println(head.val);

    }
     
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(33);
        Node d = new Node(44);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayrecursive(a);

        
       
    }
}

