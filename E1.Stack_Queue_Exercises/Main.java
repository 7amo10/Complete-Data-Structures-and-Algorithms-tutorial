class Main {
  public static void main(String[] args) {
    // Stack newStack = new Stack(5);
    // newStack.push(10);
    // newStack.push(20);
    // newStack.push(30);
    // System.out.println(newStack.pop()); // 30
    // System.out.println(newStack.removeBottom()); // 10
    // newStack.push(40);
    // System.out.println(newStack.top.value); // 40
    // System.out.println(newStack.bottom.value); // 20
    //^----------------------------------------------------------
    SetOfStacks SetStacks = new SetOfStacks(3);
    SetStacks.push(10);
    SetStacks.push(20);
    SetStacks.push(30);
    SetStacks.push(40);
    SetStacks.push(50);
    System.out.println(SetStacks.pop());
    // System.out.println(SetStacks.popAt(0));
    // System.out.println(SetStacks.popAt(0));
  }
}