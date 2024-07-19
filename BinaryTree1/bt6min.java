
public class bt6min{
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(-6);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(19);
        Node f = new Node(5);
      
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        display(a);
        System.out.println();
        System.out.println(maxi(a));
        System.out.println(mini(a));
     
   }
    private static void display(Node root){
        if(root == null) return;   //Base case
        System.out.print(root.val + " ");
        display(root.left);  //left side subtree
        display(root.right);  //right side subtree
    }
    private static int maxi(Node root){
       if(root == null) return Integer.MIN_VALUE;
    //   return Math.max(root.val, Math.max(maxi(root.left), maxi(root.right)));  
    int a = root.val, b = maxi(root.left), c = maxi(root.right);
    return Math.max(a,Math.max(b,c));
 }
 private static int mini(Node root){
    if(root == null) return Integer.MAX_VALUE;
   return Math.min(root.val, Math.min(mini(root.left), mini(root.right)));  
//  int a = root.val, b = maxi(root.left), c = maxi(root.right);
//  return Math.max(a,Math.max(b,c));
}


}
