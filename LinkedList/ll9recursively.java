
public class ll9recursively {
    // public static void print(Node head){
    //     Node temp = head;
    //     while (temp != null) {
    //         System.out.println(temp.val);
    //         temp = temp.next;
            
    //     }
    // }
    public static void displayrecursive(Node head){
       if(head == null) return;
        System.out.println(head.val);
        displayrecursive(head.next);
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

        // print(a);
        displayrecursive(a);

        
       
    }
}
