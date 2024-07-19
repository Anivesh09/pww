class Single {
    Node head;
    Node tail;
    int size;
    void inserte(int val){
        Node temp = new Node(val) ;
        if(head == null) head=tail=temp;
        else{
            tail.next = temp;
            tail = temp;
        }
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

public class ll11demo {
    public static void main(String[] args) {
        Single list = new Single();
        System.out.println(list.size);
        list.inserte(13);
        list.inserte(23);
        list.inserte(43);
        list.disp();
        System.out.println(list.size);
        list.size();
        list.inserte(66);
        list.disp();

        
    }
}
