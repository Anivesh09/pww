
public class bt9traversal {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
      
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        preorder(a);
        System.out.println("preorder");
        inorder(a);
        System.out.println("inorder");
        postorder(a);
        System.out.println("postorder");
        System.out.println(levels(a));
   }
    private static void preorder(Node root){
        if(root == null) return;   
        System.out.print(root.val + " ");
        preorder(root.left);  
        preorder(root.right);  
    }
    private static void inorder(Node root){
        if(root == null) return;   
        inorder(root.left);  
        System.out.print(root.val + " ");
        inorder(root.right);  
    }
    private static void postorder(Node root){
        if(root == null) return;   
        postorder(root.left);  
        postorder(root.right);  
        System.out.print(root.val + " ");
    }
   
    private static int levels(Node root){
        if(root == null) return 0;   
        return 1 +Math.max(levels(root.left),levels(root.right));
    }
    
 
}
