public class SingleDimensionArray {
    int arr[] = null;
    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    //insert method
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) { //time complexity is O(1)
                arr[location] = valueToBeInserted; //time complexity is O(1)
                System.out.println("Successfully inserted"); //time complexity is O(1)
              } 
              else {
                System.out.println("This cell is already occupied"); //time complexity is O(1)
              }
           } 
           catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!"); //time complexity is O(1)
        }
    }
//Total time complexity is O(1)
//Total space complexity is O(1)
//==========================================================
    // Array Traversal
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) { //time complexity is O(n)
                System.out.print(arr[i] + " "); //time complexity is O(1)
            }
        } 
        catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }
//Total time complexity is O(n)
//Total space complexity is O(1)
//==========================================================
    //Search for an element in the given Array
	public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) { //time complexity is O(n)
          if (arr[i] == valueToSearch) { //time complexity is O(1)
            System.out.println("Value is found at the index of " + i); //time complexity is O(1)
            return;
          }
        }
        System.out.println(valueToSearch + " is not found"); //time complexity is O(1)
      }
//Total time complexity is O(n)
//Total space complexity is O(1)
//==========================================================
    // Delete value from Array
    public void deleteValue(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE; //time complexity is O(1)
            System.out.println("The value has been deleted successfully"); //time complexity is O(1)
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array"); //time complexity is O(1)
        }
    }
//Total time complexity is O(n)
//Total space complexity is O(1)
    public void insertValueInTheArray(int i, int j, int k) {
    }
}