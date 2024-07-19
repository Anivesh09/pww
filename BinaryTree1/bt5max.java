
public class bt5max{
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(19);
        Node f = new Node(5);
      
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        display(a);
        System.out.println();
        System.out.println(maxi(a));;
     
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




// FROM CHATGPT CODE

// private static void maxi(Node root) {
//     if (root == null) return;
    
//     int max = root.val;
    
//     // Recursively find the maximum value in the left subtree
//     int leftMax = root.left != null ? findMax(root.left) : Integer.MIN_VALUE;
//     // Recursively find the maximum value in the right subtree
//     int rightMax = root.right != null ? findMax(root.right) : Integer.MIN_VALUE;
    
//     // Update max with the maximum value found in the subtrees
//     max = Math.max(max, Math.max(leftMax, rightMax));
    
//     System.out.println(max);
// }
// // Helper method to recursively find the maximum value in a subtree
// private static int findMax(Node node) {
//     if (node == null) return Integer.MIN_VALUE;
    
//     int max = node.val;
//     int leftMax = findMax(node.left);
//     int rightMax = findMax(node.right);
    
//     max = Math.max(max, Math.max(leftMax, rightMax));
    
//     return max;
// }

}
