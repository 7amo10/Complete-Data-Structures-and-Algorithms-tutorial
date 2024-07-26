public class SinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createSinglyLinkedList(int nodeValue) {
    head = new Node();
    Node node = new Node();
    node.next = null;
    node.value = nodeValue;
    head = node;
    tail = node;
    size = 1;
    return head;
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // Insert Method SinglyLinkedList
  public void insertInLinkedList(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;
    if (head == null) {
      createSinglyLinkedList(nodeValue);
      return;
    } else if (location == 0) {
      node.next = head;  
      head = node;
    } else if (location >= size) {
      node.next = null;
      tail.next = node;
      tail = node;
    } else {
      Node tempNode = head;
      int index = 0;
      while (index < location - 1) {
        tempNode = tempNode.next;
        index++;
      }
      Node nextNode = tempNode.next;
      tempNode.next = node;
      node.next = nextNode;
    }
    size++;
  }
  //*=> Time Complexity is: O(N) And Space Complexity is: O(1)

  // SinglyLinkedList Traversal
  public void traverseSinglyLinkedList() {
    if (head == null) {
      System.out.println("SLL does not exist!");
    } else {
      Node tempNode = head;
      for (int i = 0; i < size; i++) {
        System.out.print(tempNode.value);
        if (i != size - 1) {
          System.out.print(" -> ");
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("\n");
  }
  //*=> Time Complexity is: O(N) And Space Complexity is: O(1)

  // Search for a node

  boolean searchNode(int nodeValue) {
    if (head != null) {
      Node tempNode = head;
      for (int i = 0; i < size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.print("Found the node at location: " + i + "\n");
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.print("Node not found! ");
    return false;
  }
  //*=> Time Complexity is: O(N) And Space Complexity is: O(1)

  // Deleting a node from SinglyLinkedList
  public void deletionOfNode(int location) {
    if (head == null) {
      System.out.println("The SLL does not exist");
      return;
    } else if (location == 0) { //&=> First element to delete
      head = head.next;
      size--;
      if (size == 0) { //&=> Just one element in the begining of list to delete
        tail = null;
      }
    } else if (location >= size) { //&=> Middle of the List
      Node tempNode = head;
      for (int i = 0; i < size - 1; i++) {
        tempNode = tempNode.next;
      }
      if (tempNode == head) { //&=> Just one element in the last of list to delete
        tail = head = null;
        size--;
        return;
      }
      tempNode.next = null;
      tail = tempNode;
      size--;
    } else { //&=> Last element to delete
      Node tempNode = head;
      for (int i = 0; i < location - 1; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
    }
  }
  //*=> Time Complexity is: O(N) And Space Complexity is: O(1)
  
  // Delete Entire SinglyLinkedList
  public void deleteSLL() {
    head = null;
    tail = null;
    System.out.println("The SLL deleted successfully");
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)
}
