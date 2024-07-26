public class QueueLinkedList {
  LinkedList list;

  public QueueLinkedList() {
    list = new LinkedList();
    System.out.println("The Queue is successfully created");
  } 
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // isEmpty
  public boolean isEmpty() {
    if (list.head == null) {
      return true;
    } else {
      return false;
    }
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  //enQueue
  public void enQueue(int value) {
    list.insertInLinkedList(value, list.size);
    System.out.println("Successfully inserted "+value+" in the queue");
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // deQueue
  public int deQueue() {
    int value = -1;
    if (isEmpty()) {
      System.out.println("The Queue is is Empty");
    } else {
      value = list.head.value;
      list.deletionOfNode(0);
    }
    return value;
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  //peek
  public int peek() {
    if (isEmpty()) {
      System.out.println("The Queue is Empty");
      return -1;
    } else {
      return list.head.value;
    }
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  //delete
  public void deleteQueue() {
    list.head = null;
    list.tail = null;
    System.out.println("The Queue is successfully deleted");
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

}
