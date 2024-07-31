package Exercises;

public class Main_InOrder_Traversal {
    public static void main(String[] args) {
        //!Manually create a binary tree
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        //!Create an instance of the Class and perform in-order traversal
        InOrder_Traversal tree = new InOrder_Traversal();
        tree.inOrderTraversal(root); 
    }
}
