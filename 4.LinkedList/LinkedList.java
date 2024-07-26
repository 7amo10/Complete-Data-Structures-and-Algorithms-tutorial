public class LinkedList {
  public Node head;
  public Node tail;
  public int size;

  public void createLL(int nodeValue) {
    Node newNode = new Node();
    newNode.value = nodeValue;
    newNode.next = null;
    head = newNode;
    tail = newNode;
    size = 1;
  }

  public void insertNode(int nodeValue) {
    if (head == null) {
      createLL(nodeValue);
      return;
    }

    Node newNode = new Node();
    newNode.value = nodeValue;
    newNode.next = null;
    tail.next = newNode;
    tail = newNode;
    size++;
  }

  public void traversalLL() {
    Node tempNode = head;
    for (int i =0; i<size; i++) {
      System.out.print(tempNode.value);
      if (i != size -1) {
        System.out.print(" -> ");
      }
      tempNode = tempNode.next;
    }
    System.out.println("\n");
  }

public void insertInLinkedList(int value, int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insertInLinkedList'");
}

public void deletionOfNode(int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletionOfNode'");
}


}
