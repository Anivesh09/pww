
import java.util.LinkedList;
import java.util.Queue;

public class bt4traversalwithlevelorderpair {

    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        } 
    }
    public static void main(String[] args) {
        Node a = new Node(13);
        Node b = new Node(23);
        Node c = new Node(33);
        Node d = new Node(43);
        Node e = new Node(53);
        Node f = new Node(63);
        Node g = new Node(73);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g; 
        System.out.println();
        System.out.println("Level Order : ");
        nthlevel(null, 0, 0);
        levelOrder(a);
        System.out.println();
    }

    private static void nthlevel(Node root, int level, int lvl) {
        if (root == null) return;
        if (level == lvl) System.out.print(root.val + " ");
        nthlevel(root.right, level + 1,lvl);
        nthlevel(root.left, level + 1,lvl);
    }

    private static void levelOrder(Node root) {
        int prevlevel = 0;
        Queue<Pair> q = new LinkedList<>();
        if (root != null) q.add(new Pair(root,0));
        while (q.size() > 0) {
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(lvl != prevlevel){
                System.out.println();
                prevlevel++;
            }
            System.out.print(temp.val+" ");
            if (temp.left != null) q.add(new Pair(temp.left,lvl+1));
            if (temp.right != null) q.add(new Pair(temp.right, lvl+1));

        }
        System.out.println();
    }
    
}
