import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Stack;


public class BinaryTree {
    public static class TreeNode {
        private String data;

        public TreeNode getlChild() {
            return lChild;
        }

        public void setlChild(TreeNode lChild) {
            this.lChild = lChild;
        }

        public TreeNode getrChild() {
            return rChild;
        }

        public void setrChild(TreeNode rChild) {
            this.rChild = rChild;
        }

        private TreeNode lChild;
        private TreeNode rChild;
        public TreeNode(String data){
            this.data = data;
        }

        @Override
        public String toString() {
            return data;
        }
    }

    private TreeNode root;

    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data);
        preOrder(node.lChild);
        preOrder(node.rChild);
    }

    //入栈顺序
    public void preOrderByStack(TreeNode node) {
        ArrayList<String> arrayList = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = node;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                System.out.println("currentData:"+currentNode.data);
                arrayList.add(currentNode.data);
                System.out.println(arrayList);
                stack.push(currentNode);
                currentNode = currentNode.lChild;
                System.out.println("push stack:"+stack);
            }
            currentNode = stack.pop();
            currentNode = currentNode.rChild;
            System.out.println("pop stack:"+stack);
        }
    }


    //出栈顺序
    public void midOrderByStack(TreeNode node) {
        ArrayList<String> arrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = node;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.lChild;
                System.out.println("push stack:"+stack);
            }
            currentNode = stack.pop();
            System.out.println("currentData:"+currentNode.data);
            arrayList.add(currentNode.data);
            System.out.println(arrayList);
            currentNode = currentNode.rChild;
        }
    }



}
