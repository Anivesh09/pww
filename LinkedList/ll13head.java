
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
    void insert(int idx, int val){
       if(idx == 0){
        insertAtHead(val);return;
       }
       if(idx == size){
        insertAtTail(val); return;
       }
       if(idx > size || idx < 0 ){
        System.out.println("Invalid Index!!");
        return ;
       }
         Node temp = new Node (val);
         Node x = head;
         for (int i = 1; i <= idx-1; i++) {
            x=x.next;
         }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node (val);
        if(head==null) head = tail = temp;
        else{
            // tail.next = temp; //this is for tail almost same
            // tail = temp;
            temp.next = head;
            head = temp;
        }
        size++;
    }
    int get (int idx){
        if(idx == size - 1) return tail.val;
        if(idx >= size || idx < 0){
            System.out.println("Invalid index!!");
            return -1;
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
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
public class ll13head {
    
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

      list.insertAtHead(10);
      list.insertAtHead(20);
      list.insertAtHead(30);
      list.insertAtHead(40);
      
      list.display();
      list.insertAtHead(50);
      list.display();
      list.size();
      System.out.println(list.head.val);
      list.insert(1, 33);
      list.display();
      list.size();
      list.insert(20, 44);
      list.display();
      System.out.println();
        System.out.println(list.get(5));
        System.out.println(list.get(15));
   }
}

