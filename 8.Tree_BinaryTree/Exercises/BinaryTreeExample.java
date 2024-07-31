/*
 ! Implement Binary Tree
 * Create a basic binary tree data structure from scratch in Java, 
 * with functionalities to add and traverse elements. Focus: 
 * Understanding the structure of binary trees and basic tree operations.
 */

package Exercises;

public class BinaryTreeExample {
    private Node root;

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            addRecursive(root, value);
        }
    }

    private void addRecursive(Node current, int value) {
        if (value < current.value) {
            if (current.left == null) {
                current.left = new Node(value);
            } else {
                addRecursive(current.left, value);
            }
        } else if (value > current.value) {
            if (current.right == null) {
                current.right = new Node(value);
            } else {
                addRecursive(current.right, value);
            }
        }
    }

    public void traverseInOrder() {
        traverseInOrderRecursive(root);
    }

    private void traverseInOrderRecursive(Node node) {
        if (node != null) {
            traverseInOrderRecursive(node.left);
            System.out.print(node.value + " ");
            traverseInOrderRecursive(node.right);
        }
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
