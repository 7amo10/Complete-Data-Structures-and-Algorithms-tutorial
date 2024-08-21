public class HeapSort {
  int[] arr = null;

  public HeapSort(int[] arr) {
    this.arr = arr;
  }

  public void sort() {
    BinaryHeap bh = new BinaryHeap(arr.length);
    for (int i = 0 ; i < arr.length; i++) {
      bh.insertInHeap(arr[i]);
    } 

    for(int i=0; i<arr.length; i++) {
      arr[i] = bh.extractHeadOfHeap();
    }
  }
  // *=>Time Complexity is: O(N Log N) And Space Complexity is: O(N)-> Seperate arrays but in best case the Space is O(1)

	public void printArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
}
