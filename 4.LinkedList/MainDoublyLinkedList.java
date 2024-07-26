class MainDoublyLinkedList {
  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.createDLL(1);
    dll.insertDLL(2, 0);
    dll.insertDLL(3, 1);
    dll.insertDLL(4, 7);
    dll.traverseDLL();
    dll.reverseTraverseDLL();
    dll.searchNode(3);
    dll.deleteNodeDLL(0);
    dll.traverseDLL();
    dll.deleteDLL();
    dll.traverseDLL();
  }
}
