import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Iterator;
class Main {
  public static void main(String[] args) {
      // ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
      ArrayList<String> stringList = new ArrayList<String>();
      // Insertion
      stringList.add("A"); //*=> Time Complexity is: O(1) And Space Complexity is: O(N) amortized both
      stringList.add("B");
      stringList.add(2, "C"); //*=> //*Time Complexity is: O(1) And Space Complexity is: O(N) amortized
      System.out.println(stringList);

      //*Time Complexity is: O(1)
      //*Space Complexity is: O(N)
      //^--------------------------------------------------------------------------------------------------------
      // Access
      System.out.println(stringList.get(2));
      System.out.println(stringList.get(2)); //*=> Time Complexity is: O(1) And Space Complexity is: O(1)
      //^--------------------------------------------------------------------------------------------------------
      // Traversal
      for (int i=0; i<stringList.size(); i++) {
          String letter = stringList.get(i);
          System.out.println(letter);
      }
      //*=> Time Complexity is: O(N) And Space Complexity is: O(1)

      // for each
      for (String letter: stringList) {
          System.out.println(letter);  
      }
      //*=> Time Complexity is: O(N) And Space Complexity is: O(1)

      // Itertor traversal
      Iterator<String> iterator = stringList.iterator();
      while (iterator.hasNext()) {
          String letter = iterator.next();
          System.out.println(letter); 
      }
      //*=> Time Complexity is: O(N) And Space Complexity is: O(1)
      //^--------------------------------------------------------------------------------------------------------
      // Searching 
      for (String letter: stringList) {
          if (letter.equals("A")) {
              System.out.println("The element is found");
              break;
          }     
      }
      // index of
      int index = stringList.indexOf("C");
      System.out.println("The element is found at index " + index);
      //*=> Time Complexity is: O(N) And Space Complexity is: O(1)
      //^--------------------------------------------------------------------------------------------------------
      // remove
      stringList.remove("1");
      stringList.remove("D");
      System.out.println(stringList);
      //*=> Time Complexity is: O(N) And Space Complexity is: O(1)
  }
}