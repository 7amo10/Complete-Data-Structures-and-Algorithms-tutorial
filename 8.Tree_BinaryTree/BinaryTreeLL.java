import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
  BinaryNode root;

  public BinaryTreeLL() {
    this.root = null;
  }
  // *=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // PreOrder Traversal
  void preOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left); // *=> Recursive calls (N/2)
    preOrder(node.right); // *=> Recursive calls (N/2)
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // InOrder Traversal
  void inOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left); // *=> Recursive calls (N/2)
    System.out.print(node.value + " ");
    inOrder(node.right); // *=> Recursive calls (N/2)
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Post Order Traversal
  void postOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    postOrder(node.left); // *=> Recursive calls (N/2)
    postOrder(node.right); // *=> Recursive calls (N/2)
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
  public void search(String value) {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryNode presentNode = queue.remove();
      if (presentNode.value == value) {
        System.out.println("The value-" + value + " is found in Tree");
        return;
      } else {
        if (presentNode.left != null) {
          queue.add(presentNode.left);
        }
        if (presentNode.right != null) {
          queue.add(presentNode.right);
        }
      }
    }
    System.out.println("The value-" + value + " is not found in Tree");
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Insert Method
  void insert(String value) {
    BinaryNode newNode = new BinaryNode();
    newNode.value = value;
    if (root == null) {
      root = newNode;
      System.out.println("Inserted new node at Root");
      return;
    }
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryNode presentNode = queue.remove();
      if (presentNode.left == null) {
        presentNode.left = newNode;
        System.out.println("Successfully Inserted at left");
        break;
      } else if (presentNode.right == null) {
        presentNode.right = newNode;
        System.out.println("Successfully Inserted at left");
        break;
      } else {
        queue.add(presentNode.left);
        queue.add(presentNode.right);
      }
    }
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Get Deepest node
  public BinaryNode getDeepestNode() {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode presentNode = null;
    while (!queue.isEmpty()) {
      presentNode = queue.remove();
      if (presentNode.left != null) {
        queue.add(presentNode.left);
      }
      if (presentNode.right != null) {
        queue.add(presentNode.right);
      }
    }
    return presentNode;
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Delete Deepest node
  public void deleteDeepestNode() {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode previousNode, presentNode = null;
    while (!queue.isEmpty()) {
      previousNode = presentNode;
      presentNode = queue.remove();
      if (presentNode.left == null) {
        previousNode.right = null;
        return;
      } else if (presentNode.right == null) {
        presentNode.left = null;
        return;
      }
      queue.add(presentNode.left);
      queue.add(presentNode.right);

    }
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Delete Given node
  void deleteNode(String value) {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryNode presentNode = queue.remove();
      if (presentNode.value == value) {
        presentNode.value = getDeepestNode().value; //*=>Call for one time not for each node O(N)
        deleteDeepestNode(); //*=>Call for one time not for each node O(N)
        System.out.println("The node is deleted!");
        return;
      } else {
        if (presentNode.left != null)
          queue.add(presentNode.left);
        if (presentNode.right != null)
          queue.add(presentNode.right);
      }
    }
    System.out.println("The node does not exist in this BT");
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Delete Binary Tree
  void deleteBT() {
    root = null;
    System.out.println("BT has been successfully deleted!");
  }
  // *=> Time Complexity is: O(1) And Space Complexity is: O(1)

}
