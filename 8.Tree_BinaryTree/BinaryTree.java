public class BinaryTree {
  String[] arr;
  int lastUsedIndex;

  public BinaryTree(int size) {
    arr = new String[size + 1];
    this.lastUsedIndex = 0;
    System.out.println("Blank Tree of size " + size + " has been created");
  }
  // *=> Time Complexity is: O(1) And Space Complexity is: O(N)

  // isFull
  boolean isFull() {
    if (arr.length - 1 == lastUsedIndex) {
      return true;
    } else {
      return false;
    }
  }
  // *=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // insert method

  void insert(String value) {
    if (!isFull()) {
      arr[lastUsedIndex + 1] = value;
      lastUsedIndex++;
      System.out.println("The value of " + value + " has been inserted");
    } else {
      System.out.println("The BT is full");
    }
  }
  // *=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // preOrder Traversal
  public void preOrder(int index) {
    if (index > lastUsedIndex) {
      return;
    }
    System.out.print(arr[index] + " ");
    preOrder(index * 2); // *=> Recursive calls (N/2)
    preOrder(index * 2 + 1); // *=> Recursive calls (N/2)
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)


  // InOrder Traversal
  public void inOrder(int index) {
    if (index > lastUsedIndex) {
      return;
    }
    inOrder(index * 2); // *=> Recursive calls (N/2)
    System.out.print(arr[index] + " ");
    inOrder(index * 2 + 1); // *=> Recursive calls (N/2)

  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Post Order Traversal
  public void postOrder(int index) {
    if (index > lastUsedIndex) {
      return;
    }
    postOrder(2 * index); // *=> Recursive calls (N/2)
    postOrder(2 * index + 1); // *=> Recursive calls (N/2)
    System.out.print(arr[index] + " ");
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(N)

  // Level Order Traversal
  public void levelOrder() {
    for (int i = 1; i <= lastUsedIndex; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(1)

  // Search method
  public int search(String value) {
    for (int i = 1; i <= lastUsedIndex; i++) {
      if (arr[i] == value) {
        System.out.println(value + " exists at the location: " + i);
        return i;
      }
    }
    System.out.println("The value does not exist in BT");
    return -1;
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(1)

  // Delete Method
  public void delete(String value) {
    int location = search(value);
    if (location == -1) {
      return;
    } else {
      arr[location] = arr[lastUsedIndex];
      lastUsedIndex--;
      System.out.println("The node successfully deleted");
    }
  }
  // *=> Time Complexity is: O(N) And Space Complexity is: O(1)

  // Delete BT
  public void deleteBT() {
    try {
      arr = null;
      System.out.println("The BT has been successfully deleted");

    } catch (Exception e) {
      System.out.println("There was an error deleting the tree");
    }
  }
  // *=> Time Complexity is: O(1) And Space Complexity is: O(1)

}
