import java.util.ArrayList;

public class Main_Graph {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodelist = new ArrayList<>();
        nodelist.add(new WeightedNode("A", 0));
        nodelist.add(new WeightedNode("B", 1));
        nodelist.add(new WeightedNode("C", 2));
        nodelist.add(new WeightedNode("D", 3));
        nodelist.add(new WeightedNode("E", 4));
        nodelist.add(new WeightedNode("F", 5));
        nodelist.add(new WeightedNode("G", 6));

        WeightedGraph newGraph = new WeightedGraph(nodelist);
        newGraph.addWeightedEdge(0, 1, 2);
        newGraph.addWeightedEdge(0, 2, 5);
        newGraph.addWeightedEdge(1, 2, 6);
        newGraph.addWeightedEdge(1, 3, 1);
        newGraph.addWeightedEdge(1, 4, 3);
        newGraph.addWeightedEdge(2, 5, 8);
        newGraph.addWeightedEdge(2, 4, 4);
        newGraph.addWeightedEdge(4, 6, 9);
        newGraph.addWeightedEdge(5, 6, 7);

        System.out.println("Printing bellmanFord from source: A");
        // newGraph.dijkstra(nodelist.get(0));
        newGraph.bellmanFord(nodelist.get(0));

    }
}
