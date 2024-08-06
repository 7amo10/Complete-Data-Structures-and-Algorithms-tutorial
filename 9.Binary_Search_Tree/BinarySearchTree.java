import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
  BinaryNode root;

  BinarySearchTree() {
    root = null;
  }
  // *=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // Insert Method
  private BinaryNode insert(BinaryNode currentNode, int value) {
    if (currentNode == null) {
      BinaryNode newNode = new BinaryNode();
      newNode.value = value;
      System.out.println("The value successfully inserted");
      return newNode;
    } else if (value <= currentNode.value) {
      currentNode.left = insert(currentNode.left, value); // *=> Recursive call(N/2)
      return currentNode;
    } else {
      currentNode.right = insert(currentNode.right, value); // *=> Recursive call(N/2)
      return currentNode;
    }
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  void insert(int value) {
    root = insert(root, value);
  }

  // PreOrder Traversal
  public void preOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Inorder Traversal
  public void inOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);

  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // PostOrder Traversal
  public void postOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + " ");
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Level Order
  void levelOrder() {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryNode presentNode = queue.remove();
      System.out.print(presentNode.value + " ");
      if (presentNode.left != null) {
        queue.add(presentNode.left);
      }
      if (presentNode.right != null) {
        queue.add(presentNode.right);
      }
    }
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Search Method
  BinaryNode search(BinaryNode node, int value) {
    if (node == null) {
      System.out.println("Value: " + value + " not found in BST");
      return null;
    } else if (node.value == value) {
      System.out.println("Value: " + value + " found in BST");
      return node;
    } else if (value < node.value) {
      return search(node.left, value);
    } else {
      return search(node.right, value);
    }
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Minimum node
  public static BinaryNode minimumNode(BinaryNode root) {
    if (root.left == null) {
      return root;
    } else {
      return minimumNode(root.left);
    }
  }

  // Delete node
  public BinaryNode deleteNode(BinaryNode root, int value) {
    if (root == null) {
      System.out.println("Value not found in BST");
      return null;
    }
    if (value < root.value) {
      root.left = deleteNode(root.left, value);
    } else if (value > root.value) {
      root.right = deleteNode(root.right, value);
    } else {
      if (root.left != null && root.right != null) {
        BinaryNode temp = root;
        BinaryNode minNodeForRight = minimumNode(temp.right);
        root.value = minNodeForRight.value;
        root.right = deleteNode(root.right, minNodeForRight.value);
      } else if (root.left != null) {
        root = root.left;
      } else if (root.right != null) {
        root = root.right;
      } else {
        root = null;
      }
    }
    return root;
  }
  // *=>Time Complexity is: O(N) And Space Complexity is: O(N)

  public void deleteBST() {
    root = null;
    System.out.println("BST has been deleted successfully");
  }
  // *=>Time Complexity is: O(1) And Space Complexity is: O(1)

}
