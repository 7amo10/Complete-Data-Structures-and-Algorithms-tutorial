public class StackLinkedList {
  LinkedList linkedList;

  public StackLinkedList() {
    linkedList = new LinkedList();
  }

  // Push method
  public void push(int value) {
    linkedList.insertInLinkedList(value, 0);
    System.out.println("Inserted " + value + " in Stack");
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // isEmpty
  public boolean isEmpty() {
    if (linkedList.head == null) {
      return true;
    } else {
      return false;
    }
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // Pop method
  public int pop() {
    int result = -1;
    if (isEmpty()) {
      System.out.println("The Stack is Empty!");
    } else {
      result = linkedList.head.value;
      linkedList.deletionOfNode(0);
    }
    return result;
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // Peek Method
  public int peek() {
    if (isEmpty()) {
      System.out.println("The Stack is Empty!");
      return -1;
    } else {
      return linkedList.head.value;
    }
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // Delete Method
  public void deleteStack() {
    linkedList.head = null;
    System.out.println("The Stack is deleted");
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

}
