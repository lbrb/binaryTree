
public class Demo {
    /**
     *          A
     *    B           C
     *  D   E
     *     F G
     * @param args
     */
    public static void main(String[] args) {

        BinaryTree.TreeNode a = new BinaryTree.TreeNode("A");
        BinaryTree.TreeNode b = new BinaryTree.TreeNode("B");
        BinaryTree.TreeNode c = new BinaryTree.TreeNode("C");
        BinaryTree.TreeNode d = new BinaryTree.TreeNode("D");
        BinaryTree.TreeNode e = new BinaryTree.TreeNode("E");
        BinaryTree.TreeNode f = new BinaryTree.TreeNode("F");
        BinaryTree.TreeNode g = new BinaryTree.TreeNode("G");
        BinaryTree.TreeNode h = new BinaryTree.TreeNode("H");
        a.setlChild(b);
        a.setrChild(c);
        b.setlChild(d);
        b.setrChild(e);
        c.setlChild(f);
        e.setlChild(g);
        e.setrChild(h);

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.preOrderByStack(a);
        System.out.println("-------------");
        binaryTree.midOrderByStack(a);
    }
}
