public class QuickSort {
  static int partition(int[] array, int start, int end) {
    int pivot = end;
    int i = start - 1;
    for (int j= start; j<=end; j++) {
      if (array[j] <= array[pivot]) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    return i;
  }
  // *=>Time Complexity is: O(N) And Space Complexity is: O(1)

  public static void quickSort(int[] array, int start, int end) {
    if (start < end) {
      int pivot = partition(array, start, end);// *=> Time Complexity: O(N)
      quickSort(array, start, pivot -1); // *=>Recursive Calls: O(N/2)
      quickSort(array, pivot + 1, end); // *=>Recursive Calls: O(N/2)
    }
  } 
  // *=>Time Complexity is: O(N Log N) And Space Complexity is: O(N)

	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
}
