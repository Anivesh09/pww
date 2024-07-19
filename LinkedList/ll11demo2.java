class Single {
    Node head;
    Node tail;
    int size;
    void inserttl(int val){
        Node temp = new Node(val) ;
        if(head == null) head=tail=temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void inserthd(int val){
        Node temp = new Node(val) ;
        if(head == null) head=tail=temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertmd(int idx,int val){
        Node temp = new Node(val) ;
        Node x = head;
        for (int i = 1; i <= idx-1; i++) {
            x = x.next;
        }
        //insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    void disp(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("size: "+size);
    }
}

public class ll11demo2 {
    public static void main(String[] args) {
        Single list = new Single();
        list.size();
        list.inserttl(13);
        list.inserttl(23);
        list.inserttl(43);
        list.disp();
        list.size();
        list.inserttl(66);
        list.disp();
        list.inserthd(50);
        list.inserthd(17);
        list.disp();
        list.size();
        System.out.println(list.head.val);
        System.out.println();
        list.insertmd(2,36);
        list.disp();
        list.insertmd(12,32);
        list.disp();


        
    }
}
