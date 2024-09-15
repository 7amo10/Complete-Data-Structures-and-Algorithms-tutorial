import java.util.*;
public class FractionalKnapsack {
  static void knapSack (ArrayList<KnapsackItem> items, int capacity) {
    Comparator<KnapsackItem> comparator = new Comparator<KnapsackItem>() {
      @Override
      public int compare(KnapsackItem o1, KnapsackItem o2) {
        if (o2.getRatio()>o1.getRatio()) return 1;
        else return -1;
      }
    };
    Collections.sort(items, comparator);
    int usedCapacity = 0;
    double totalValue = 0;

    for (KnapsackItem item : items) {
      if (usedCapacity + item.getWeight()<=capacity) {
        usedCapacity+=item.getWeight();
        System.out.println("Taken: "+item);
        totalValue+=item.getValue();
      } else {
        int usedWeight = capacity - usedCapacity;
        double value = item.getRatio()*usedWeight;
        System.out.println("Taken: item index = "+ item.getIndex()+ ", obtained value= "+ value+ ", used weight =" +usedWeight+ ", ratio = "+ item.getRatio());
        usedCapacity += usedWeight;
        totalValue += value;
      }
      if (usedCapacity == capacity) break;
    }

    System.out.println("\nTotal value obtained: "+ totalValue);
  }
  //*=> Time Complexity is: O(NlogN) and Space Complexity is: O(1)
}
