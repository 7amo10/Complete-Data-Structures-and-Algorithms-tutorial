public class TwoDimensionalArray {
	int arr[][] = null;

	// Constructor
	public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
//==========================================================
  // Inserting value in the Array
  public void insertValueInTheArray(int row, int col, int value) {
    try {
      if (arr[row][col] == Integer.MIN_VALUE) { //time complexity is O(1)
        arr[row][col] = value; //time complexity is O(1)
        System.out.println("The value is successfully inserted"); //time complexity is O(1)
      } else {
        System.out.println("This cell is already occupied"); //time complexity is O(1)
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index for 2D array"); //time complexity is O(1)
    }
  }
//Total time complexity is O(1)
//Total space complexity is O(1)
//==========================================================
  // Accessing cell value from given array
	public void accessCell(int row, int col) {
    System.out.println("\nAccessing Row#" + row + ", Col#" + col);  //time complexity is O(1)
    try {
      System.out.println("Cell value is: " + arr[row][col]);  //time complexity is O(1)

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index for 2D array");  //time complexity is O(1)
    }
  }
//Total time complexity is O(1)
//Total space complexity is O(1)
//==========================================================
  // Traverse 2D array

  public void traverse2DArray() {
    for (int row=0; row < arr.length; row++) {  //time complexity is O(m)
      for (int col=0; col < arr[0].length; col++) {  //time complexity is O(n)
        System.out.print(arr[row][col] + "  ");  //time complexity is O(1)
      }
      System.out.println();  //time complexity is O(1)
    }
  }
//Total time complexity is O(m*n)
//Total space complexity is O(1)
//==========================================================//==========================================================
  // Searching a single value from the Array
  public void searchingValue(int value) {
    for (int row=0; row<arr.length; row++){ //time complexity is O(m)
      for (int col=0; col<arr[0].length; col++) { //time complexity is O(n)
        if (arr[row][col] == value) {
          System.out.println("Value is found at row: "+ row + " Col: " + col); //time complexity is O(1)
          return;
        }
      }
    }
    System.out.println("Value is not found"); //time complexity is O(1)
  }
//Total time complexity is O(m*n)
//Total space complexity is O(1)
//==========================================================
  // Deleting a value from Array
  public void deleteValuefromArray(int row, int col) {
    try {
      System.out.println("Successfully deleted: " + arr[row][col]); //time complexity is O(1)
      arr[row][col] = Integer.MIN_VALUE; //time complexity is O(1)

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("This index is not valid for array"); //time complexity is O(1)
    }
  }
//Total time complexity is O(m*n)
//Total space complexity is O(1)
}
