class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class bt2display {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(44);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
      
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        display(a);
       
    }
    private static void display(Node root){
        if(root == null) return;   //Base case
        System.out.print(root.val + " ");
        display(root.left);  //left side subtree
        display(root.right);  //right side subtree
        //these three can interchange but also  print the whole values
    }
}
