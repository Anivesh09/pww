class Nodee{
    int value;
    Nodee next;
    Nodee(int value){
        this.value = value;
        // this.Nodee = Nodee;
    }
}
public class ll12demo {
    // public static void rec(Nodee head){
    //     if(head == null) return;
    //     System.out.println(head.value);
    //     rec(head.next);
    // }
    public static void pri(Nodee head){
        Nodee temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        
    
    Nodee a = new Nodee(0);
    Nodee b = new Nodee(350);
    a.next = b;
    // System.out.println(a);
    // System.out.println(a.value);
    // System.out.println(a.next);
    // System.out.println(b);
    // System.out.println(b.value);

    // rec(a);
    pri(a);

    }
}
