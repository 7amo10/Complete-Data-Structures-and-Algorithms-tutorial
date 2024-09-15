import java.util.ArrayList;

public class Main_Knapsack {
    public static void main(String[] args) {
        ArrayList<KnapsackItem> items = new ArrayList<>();
        int[] value = {100,120,60};
        int[] weight = {20,30,10};
        int capacity = 50;
        for(int i=0; i<value.length; i++){
            items.add(new KnapsackItem(i+1, value[i], weight[i]));
        }
        FractionalKnapsack.knapSack(items, capacity);
    }
}
