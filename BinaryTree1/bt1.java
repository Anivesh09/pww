class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class bt1 {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(44);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        System.out.println(a);
        System.out.println(a.val);
        System.out.println(a.left);
        System.out.println(a.right);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        System.out.println();
        System.out.println(a);
        System.out.println(a.val);
        System.out.println(a.left.val);
        System.out.println(b.val);
        System.out.println(a.right.val);
        System.out.println(a.right.val);
        System.out.println();
        System.out.println(a.left.right.val);
        System.out.println(e.val);
    }
}
