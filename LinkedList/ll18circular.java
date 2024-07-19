class cNode{
    int val;
    cNode next;
    cNode prev;
    cNode(int val){
        this.val = val;
    }
}
public class ll18circular{ 
    public static void print(cNode head){
       cNode temp = head;
    
        temp = head;
        while(true){
            System.out.print(temp.val+" ");
            if(temp.next == head)  break;
            temp = temp.next;
        }
        System.out.println("/n"); 
    }
    
   
    public static void main(String[] args) {
        cNode a = new cNode(12);
        cNode b = new cNode(22);
        cNode c = new cNode(32);
        cNode d = new cNode(42);
        a.next = b;  
        b.next = c;  
        c.next = d;  
        print(a);

    }
}