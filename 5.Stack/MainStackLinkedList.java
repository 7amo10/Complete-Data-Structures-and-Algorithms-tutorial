class MainStackLinkedList {
  public static void main(String[] args) {
    StackLinkedList newStack = new StackLinkedList();
    boolean result = newStack.isEmpty();
    System.out.println(result);
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);
    int del_result = newStack.pop();
    System.out.println(del_result);
    int peek_result = newStack.peek();
    System.out.println(peek_result);
    newStack.deleteStack();
  }
}
