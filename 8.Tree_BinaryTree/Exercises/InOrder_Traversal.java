/*
 ! In-Order Traversal (Iterative)
 * Implement an iterative approach for in-order  traversals in a binary tree.  
 * It involves using a stack to keep track of the nodes. This is because recursion inherently uses a call stack, 
 * and when converting to an iterative approach, we need to manage this stack explicitly.
 * inOrderTraversal: Recursively traverses the tree in in-order. 
 * It first visits the left child, then the current node, and finally the right child.
 */
package Exercises;

import java.util.Stack;

public class InOrder_Traversal {
    public void inOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
 
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.val + " ");
            current = current.right;
        }
    }
}
