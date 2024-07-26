class MainCircularSinglyLinkedList {
  public static void main(String[] args) {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
    csll.createCSLL(5);
    System.out.println(csll.head.value);
    System.out.println(csll.head.next.value);
    csll.insertCSLL(4, 0);
    csll.insertCSLL(6, 1);
    csll.insertCSLL(7, 8);
    csll.traverseCSLL();
    csll.searchNode(6);
    csll.deleteNode(1);
    csll.deleteCSLL();
    csll.traverseCSLL();

  }
}
