public class Binary_Heap {
  int arr[];
  int sizeOfTree;

  public Binary_Heap(int size) {
    arr = new int[size+1];
    this.sizeOfTree = 0;
    System.out.println("Binary Heap has been created");
  }
  // *=>Time Complexity is: O(1) And Space Complexity is: O(N)-> create n number of contiguous cells in the memory

  public boolean isEmpty() {
    if (sizeOfTree == 0) {
      return true;
    } else {
      return false;
    }
  }
  // *=>Time Complexity is: O(1) And Space Complexity is: O(1)

  public Integer peek() {
    if (isEmpty()) {
      System.out.println("Binary Heap is Empty");
      return null;
    }
    return arr[1];
  }
  // *=>Time Complexity is: O(1) And Space Complexity is: O(1)

  public int sizeOfBP() {
    return sizeOfTree;
  }
  // *=>Time Complexity is: O(1) And Space Complexity is: O(1)

  public void levelOrder() {
    for (int i =1; i<=sizeOfTree; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("\n");
  }
  // *=>Time Complexity is: O(N) And Space Complexity is: O(1)

  // Heapify for Insert
  public void heapifyBottomToTop(int index, String heapType) {
    int parent = index / 2;
    if (index <= 1 ) {
      return;
    }
    if (heapType == "Min") {
      if (arr[index] < arr[parent]) {
        int tmp = arr[index];
        arr[index] = arr[parent];
        arr[parent] = tmp;
      }
    } else if (heapType == "Max") {
      if (arr[index] > arr[parent]) {
        int tmp = arr[index];
        arr[index] = arr[parent];
        arr[parent] = tmp;
      }
    }
    heapifyBottomToTop(parent, heapType);
  }
  // *=>Time Complexity is: O(LogN) And Space Complexity is: O(LogN)

  public void insert(int value, String typeHeap) {
    arr[sizeOfTree+1] = value;
    sizeOfTree++;
    heapifyBottomToTop(sizeOfTree, typeHeap);
    System.out.println("Inserted " +value+ " successfully in Heap");
  }
  // *=>Time Complexity is: O(LogN) And Space Complexity is: O(LogN)

  // heapifyTopToBottom
  public void heapifyTopToBottom(int index, String heapType) {
    int left = index*2;
    int right = index*2 + 1;
    int swapChild = 0;
    if (sizeOfTree < left) {
      return;
    }
    if (heapType == "Max") {
      if (sizeOfTree == left) {
        if (arr[index] < arr[left]) {
          int tmp = arr[index];
          arr[index] = arr[left];
          arr[left] = tmp;
        }
        return;
      } else {
        if (arr[left]>arr[right]) {
          swapChild = left;
        } else {
          swapChild = right;
        }
        if (arr[index] < arr[swapChild]) {
          int tmp = arr[index];
          arr[index] = arr[swapChild];
          arr[swapChild] = tmp;
        }
      }
    } else if (heapType == "Min") {
      if (sizeOfTree == left) {
        if (arr[index] > arr[left]) {
          int tmp = arr[index];
          arr[index] = arr[left];
          arr[left] = tmp;
        }
        return;
      } else {
        if (arr[left] < arr[right]) {
          swapChild = left;
        } else {
          swapChild = right;
        }
        if (arr[index] > arr[swapChild]) {
          int tmp = arr[index];
          arr[index] = arr[swapChild];
          arr[swapChild] = tmp;
        }
      }
    }
    heapifyTopToBottom(swapChild, heapType);
  }
  // *=>Time Complexity is: O(LogN) And Space Complexity is: O(LogN)

  public int extractHeadOfBP(String heapType) {
    if (isEmpty()) {
      return -1;
    } else {
      int extractedValue = arr[1];
      arr[1] = arr[sizeOfTree];
      sizeOfTree--;
      heapifyTopToBottom(1, heapType);
      return extractedValue;
    }
  }
  // *=>Time Complexity is: O(LogN) And Space Complexity is: O(LogN)

  // delete
  public void deleteBH() {
    arr = null;
    System.out.println("BH has been successfully deleted");
      // *=>Time Complexity is: O(1) And Space Complexity is: O(1)

  }
}
