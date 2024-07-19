public class bt3sum {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
      
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        display(a);
        System.out.println();
        System.out.println(sum(a));
        System.out.println(product(a));
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
    
   private static int product(Node root){
    if(root == null ) return 1;   
    return root.val * product(root.left) * product(root.right);
}
}
