public class QueueArray {
  int[] arr;
  int topOfQueue;
  int beginningOfQueue;

  public QueueArray(int size) {
    this.arr = new int[size];
    this.topOfQueue = -1;
    this.beginningOfQueue= -1;
    System.out.println("The Queue is succesffully created with size of: " + size);
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(N)

  // IsFull
  public boolean isFull() {
    if (topOfQueue == arr.length-1) {
      return true;
    } else {
      return false;
    }
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)
  
  // isEmpty
  public boolean isEmpty() {
    if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) {
      return true;
    } else {
      return false;
    }
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)
  
  // Enqueue
  public void enQueue(int value) {
    if (isFull()) {
      System.out.println("The Queue is Full!");
    } else if (isEmpty()) {
      beginningOfQueue = 0;
      topOfQueue++;
      arr[topOfQueue] = value;
      System.out.println("Succesffully inserted "+value+ " in the queue");
    } else {
      topOfQueue++;
      arr[topOfQueue] = value;
      System.out.println("Succesffully inserted "+value+ " in the queue");
    }
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)
  
  // deQeueue
  public int deQueue() {
    if (isEmpty()) {
      System.out.println("The Queue is empty!");
      return -1;
    } else {
      int result = arr[beginningOfQueue];
      beginningOfQueue++;
      if (beginningOfQueue > topOfQueue) {
        beginningOfQueue = topOfQueue = -1;
      }
      return result;
    }
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  // Peek
  public int peek() {
    if (!isEmpty()) {
      return arr[beginningOfQueue];
    } else {
      System.out.println("The Queue is empty!");
      return -1;
    } 
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

  //delete
  public void deleteQueue() {
    arr = null; 
    System.out.println("The Queue is successfully deleted!");
  }
  //*=> Time Complexity is: O(1) And Space Complexity is: O(1)
}