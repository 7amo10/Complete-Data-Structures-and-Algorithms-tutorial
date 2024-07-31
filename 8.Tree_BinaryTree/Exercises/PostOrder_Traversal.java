/*
 ! Post-Order Traversal (Iterative)
 * Implement an iterative approach for post-order traversals in a binary tree.  
 * It involves using a stack to keep track of the nodes. 
 * This is because recursion inherently uses a call stack, 
 * and when converting to an iterative approach, we need to manage this stack explicitly. 
 * postOrderTraversal: Recursively traverses the tree in post-order. 
 * It first visits the left child, then the right child, and finally the current node.
 */
package Exercises;

import java.util.Stack;

public class PostOrder_Traversal {
    public void postOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        
        if (root != null) stack1.push(root);
 
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
 
            if (node.left != null) stack1.push(node.left);
            if (node.right != null) stack1.push(node.right);
        }
 
        while (!stack2.isEmpty()) {
            TreeNode node = stack2.pop();
            System.out.print(node.val + " ");
        }
    }
}
