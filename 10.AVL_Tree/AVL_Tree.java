import java.util.LinkedList;
import java.util.Queue;

public class AVL_Tree {
  BinaryNode root;

  // Constructor
  AVL_Tree() {
    root = null;
  }
  // *=>Time Complexity is: O(1) And Space Complexity is: O(1)

  // PreOrder Traversal
  public void preOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }
  // *=>Time Complexity is: O(N) And Space Complexity is: O(N)

  // Inorder Traversal
  public void inOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);
  }
  // *=>Time Complexity is: O(N) And Space Complexity is: O(N)

  // PostOrder Traversal
  public void postOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + " ");
  }
  // *=>Time Complexity is: O(N) And Space Complexity is: O(N)

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
  // *=>Time Complexity is: O(N) And Space Complexity is: O(N)

  // Search Method
  BinaryNode search(BinaryNode node, int value) {
    if (node == null) {
      System.out.println("Value: " + value + " not found in AVL");
      return null;
    } else if (node.value == value) {
      System.out.println("Value: " + value + " found in AVL");
      return node;
    } else if (value < node.value) {
      return search(node.left, value);
    } else {
      return search(node.right, value);
    }
  }
  // *=>Time Complexity is: O(LogN) And Space Complexity is: O(LogN)

  // getHeight
  public int getHeight(BinaryNode node) {
    if (node == null) {
      return 0;
    }
    return node.height;
  }

  // rotateRight
  private BinaryNode rotateRight(BinaryNode disbalancedNode) {
    BinaryNode newRoot = disbalancedNode.left;
    disbalancedNode.left = disbalancedNode.left.right;
    newRoot.right = disbalancedNode;
    disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
    newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
    return newRoot;
  }
  // *=>Time Complexity is: O(1) And Space Complexity is: O(1)

  // rotateLeft
  private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
    BinaryNode newRoot = disbalancedNode.right;
    disbalancedNode.right = disbalancedNode.right.left;
    newRoot.left = disbalancedNode;
    disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
    newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
    return newRoot;
  }
  // *=>Time Complexity is: O(1) And Space Complexity is: O(1)

  // getBalance
  public int getBalance(BinaryNode node) {
    if (node == null) {
      return 0;
    }
    return getHeight(node.left) - getHeight(node.right);
  }
  // *=>Time Complexity is: O(1) And Space Complexity is: O(1)

  // insertNode Method
  private BinaryNode insertNode(BinaryNode node, int nodeValue) {
    if (node == null) {
      BinaryNode newNode = new BinaryNode();
      newNode.value = nodeValue;
      newNode.height = 1;
      return newNode;
    } else if (nodeValue < node.value) {
      node.left = insertNode(node.left, nodeValue);
    } else {
      node.right = insertNode(node.right, nodeValue);
    }

    node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
    int balance = getBalance(node);

    if (balance > 1 && nodeValue < node.left.value) {
      return rotateRight(node);
    }

    if (balance > 1 && nodeValue > node.left.value) {
      node.left = rotateLeft(node.left);
      return rotateRight(node);
    }

    if (balance < -1 && nodeValue > node.right.value) {
      return rotateLeft(node);
    }

    if (balance < -1 && nodeValue < node.right.value) {
      node.right = rotateRight(node.right);
      return rotateLeft(node);
    }
    return node;
  }
  // *=>Time Complexity is: O(LogN) And Space Complexity is: O(LogN)

  public void insert(int value) {
    root = insertNode(root, value);
  }
  // *=>Time Complexity is: O(1) And Space Complexity is: O(1)

  // Minimum node
  public static BinaryNode minimumNode(BinaryNode root) {
    if (root.left == null) {
      return root;
    } else {
      return minimumNode(root.left);
    }
  }

  // Delete node
  public BinaryNode deleteNode(BinaryNode node, int value) {
    if (node == null) {
      System.out.println("Value not found in AVL");
      return node;
    }
    if (value < node.value) {
      node.left = deleteNode(node.left, value);
    } else if (value > node.value) {
      node.right = deleteNode(node.right, value);
    } else {
      if (node.left != null && node.right != null) {
        BinaryNode temp = node;
        BinaryNode minNodeForRight = minimumNode(temp.right);
        node.value = minNodeForRight.value;
        node.right = deleteNode(node.right, minNodeForRight.value);
      } else if (node.left != null) {
        node = node.left;
      } else if (node.right != null) {
        node = node.right;
      } else {
        node = null;
      }
    }
    // Case 2 - rotation required

    // System.out.println("1");
    // System.out.println(previous.value);

    // node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
    int balance = getBalance(node);

    if (balance > 1 && getBalance(node.left) >= 0) {
      return rotateRight(node);
    }
    if (balance > 1 && getBalance(node.left) < 0) {
      node.left = rotateLeft(node.left);
      return rotateRight(node);
    }
    if (balance < -1 && getBalance(node.right) <= 0) {
      return rotateLeft(node);
    }

    if (balance < -1 && getBalance(node.right) > 0) {
      node.right = rotateRight(node.right);
      return rotateLeft(node);
    }
    return node;
  }
  // *=>Time Complexity is: O(LogN) And Space Complexity is: O(LogN)

  public void delete(int value) {
    root = deleteNode(root, value);
  }

  public void deleteAVL() {
    root = null;
  }
  // *=>Time Complexity is: O(1) And Space Complexity is: O(1)

}
