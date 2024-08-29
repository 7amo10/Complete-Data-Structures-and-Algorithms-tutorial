import java.util.ArrayList;

public class Main_Graph {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodelist = new ArrayList<GraphNode>();
        // ! Insert nodes
        nodelist.add(new GraphNode("A", 0));
        nodelist.add(new GraphNode("B", 1));
        nodelist.add(new GraphNode("C", 2));
        nodelist.add(new GraphNode("D", 3));
        nodelist.add(new GraphNode("E", 4));
        nodelist.add(new GraphNode("F", 5));
        nodelist.add(new GraphNode("G", 6));

        // ! Adjacting directed nodes
        Graph newGraph = new Graph(nodelist);
        newGraph.addDirectedEdge(0, 1); //A-B
        newGraph.addDirectedEdge(0, 2); //A-C
        newGraph.addDirectedEdge(1, 3); //B-D
        newGraph.addDirectedEdge(1, 6); //B-G
        newGraph.addDirectedEdge(2, 3); //C-D
        newGraph.addDirectedEdge(2, 4); //C-E
        newGraph.addDirectedEdge(3, 5); //D-F
        newGraph.addDirectedEdge(4, 5); //E-F
        newGraph.addDirectedEdge(5, 6); //F-G
        // ! Print result and the topologicalSort of them
        System.out.println(newGraph.toString());
        newGraph.BFSForSSSPP(nodelist.get(0));
    }
}
