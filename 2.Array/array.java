import java.util.Arrays;
class array {
    public static void main(String[] args) {
        //creation
        int[] intArray; //time complexity is O(1)
        intArray = new int[3]; //time complexity is O(1)
        intArray[0] = 1; 
        intArray[1] = 2;
        intArray[2] = 3;
        //time complexity is O(n)
        System.out.println(Arrays.toString(intArray));
        String sArray[] = {"a", "b", "c"}; //time complexity is O(1)
        System.out.println(Arrays.toString(sArray));
        //insertion
  }
}