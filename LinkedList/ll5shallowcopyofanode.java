// class Node{
//     int val;
//     Node next;
//     Node(int val){
//         this.val = val;
//     }
// }


public class ll5shallowcopyofanode {
     
    public static void main(String[] args) {
        Node a = new Node(101);
        // Node temp = new Node(a.val);  //deep copy
        Node temp = a;  //shallow copy
        temp.val= 12;

        System.out.println(a);
        System.out.println(a.val);
        System.out.println(temp);
        System.out.println(temp.val);
        System.out.println(a.val);
        

    }
}
