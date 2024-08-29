import java.util.ArrayList;

public class Main_Floyd {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodelist = new ArrayList<>();
        nodelist.add(new WeightedNode("A", 0));
        nodelist.add(new WeightedNode("B", 1));
        nodelist.add(new WeightedNode("C", 2));
        nodelist.add(new WeightedNode("D", 3));

        WeightedGraph newGraph = new WeightedGraph(nodelist);
        newGraph.addWeightedEdge(0, 3, 1);
        newGraph.addWeightedEdge(0, 1, 8);
        newGraph.addWeightedEdge(1, 2, 1);
        newGraph.addWeightedEdge(2, 0, 4);
        newGraph.addWeightedEdge(3, 1, 2);
        newGraph.addWeightedEdge(3, 2, 9);
        System.out.println("Printing Floyd Warshall algorithm from source A:");
        newGraph.floydWarshall();
    }
}
