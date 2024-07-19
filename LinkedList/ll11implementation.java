
class SLL{
    Node head; 
    Node tail; 
    int size;
    void insertAtTail(int val){
        Node temp = new Node (val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Size : "+size);
    }
}
public class ll11implementation {
    
    public static void main(String[] args) {
      SLL list = new SLL();
      list.size();
      list.insertAtTail(11);
      list.insertAtTail(22);
      list.insertAtTail(33);
      list.insertAtTail(44);
      
      list.display();
      list.insertAtTail(55);
      list.display();
      list.size();
   }
}

