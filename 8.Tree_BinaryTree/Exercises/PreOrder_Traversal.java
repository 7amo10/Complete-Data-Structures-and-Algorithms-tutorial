/*
 ! Pre-Order Traversal (Iterative)
 * Implement an  iterative approach for  pre-order  traversal in a binary tree . 
 * It  involves using a stack to keep track of the nodes. This is because recursion inherently uses a call stack, 
 * and when converting to an iterative approach, we need to manage this stack explicitly.   
 * preOrderTraversal: Recursively traverses the tree in pre-order. 
 * It first visits the current node, then the left child, and finally the right child.
 */
package Exercises;

import java.util.Stack;

public class PreOrder_Traversal {
    public void preOrderTraversal(TreeNode root) {
        if (root == null) return;
 
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
 
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + " ");
 
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }
}
