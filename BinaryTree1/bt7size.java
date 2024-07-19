
public class bt7size {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(15);
      
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f; c.left = g;
        display(a);
        System.out.println();
        System.out.println(sum(a));;
        System.out.println(size(a));;
   }
    private static void display(Node root){
        if(root == null) return;   //Base case
        System.out.print(root.val + " ");
        display(root.left);  //left side subtree
        display(root.right);  //right side subtree
    }
    private static int sum(Node root){
        if(root == null) return 0;   
        return root.val+sum(root.left)+sum(root.right);
    }
    private static int size(Node root){
        if(root == null) return 0;   
        return 1 +size(root.left)+size(root.right);
    }
    
 
}
