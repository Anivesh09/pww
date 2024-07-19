class DLL{
    dNode head;
    dNode tail;
    int size;
    void display(){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;  //extra line
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;  //extra line
            head = temp;
        }
        size++;
    }
    void insert(int idx, int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val); return;
        }
        if(idx>size || idx<0){
            System.out.println("Invalid Index!!");  return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for(int i=1; i<=idx-1;i++){
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;
        size++;

    }
    void deleteAtHead() throws Error {
        if (head == null)
            throw new Error("List is empty;");
        head = head.next;
        head.prev = null; //extra
        size--;
    }
    void deleteAtTail() throws Error {
        if (size == 0)
            throw new Error("List is empty;");
        tail = tail.prev;
        tail.next = null;  //extra
            size--;
    }

    void delete(int idx) throws Error {
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        if (idx < 0 || idx >= size)
            throw new Error(" Invalid index");
        dNode temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
       
        temp.next = temp.next.next;
        temp = temp.next;    //extra
        temp.prev = temp.prev.prev;  //extra
        size--;
    }
}
public class ll17doublylinkedlist {
   
    public static void main(String[] args) {
        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        System.out.println(list.size);
        list.insertAtHead(22);
        list.insertAtHead(17);
        list.display();
        System.out.println(list.size);
        list.insert(2,66);
        list.display();
        list.delete(3);
        list.display();
    }
}
