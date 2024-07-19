class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
}
public class ll16doubly{
    public static void print(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display(dNode node){
        dNode temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        System.out.println();
        //now temp is at head
        print(temp);
    }
    public static void main(String[] args) {
        dNode a = new dNode(12);
        dNode b = new dNode(22);
        dNode c = new dNode(32);
        dNode d = new dNode(42);
        a.next = b;  b.prev = a;
        b.next = c;  c.prev = b;
        c.next = d;  d.prev = c;
        print(a);
        printReverse(d);
        display(c);
    }
}