import java.util.ArrayList;

public class Main_Graph {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodelist = new ArrayList<GraphNode>();
        //! Insert nodes
        nodelist.add(new GraphNode("A", 0));
        nodelist.add(new GraphNode("B", 1));
        nodelist.add(new GraphNode("C", 2));
        nodelist.add(new GraphNode("D", 3));
        nodelist.add(new GraphNode("E", 4));
        nodelist.add(new GraphNode("F", 5));
        nodelist.add(new GraphNode("G", 6));
        nodelist.add(new GraphNode("H", 7));

        //! Adjacting directed nodes
        Graph newGraph = new Graph(nodelist);
        newGraph.addDirectedEdge(0,2);
        newGraph.addDirectedEdge(2,4);
        newGraph.addDirectedEdge(4,7);
        newGraph.addDirectedEdge(4,5);
        newGraph.addDirectedEdge(5,6);
        newGraph.addDirectedEdge(1,2);
        newGraph.addDirectedEdge(1,3);
        newGraph.addDirectedEdge(3,5);

        //! Print result and the topologicalSort of them 
        System.out.println(newGraph.toString());
        newGraph.topologicalSort();
    }
}
