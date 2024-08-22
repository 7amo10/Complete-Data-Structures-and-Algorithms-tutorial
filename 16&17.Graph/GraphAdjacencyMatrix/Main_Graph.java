import java.util.ArrayList;

public class Main_Graph {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodelist = new ArrayList<GraphNode>();
        nodelist.add(new GraphNode("A", 0));
        nodelist.add(new GraphNode("B", 1));
        nodelist.add(new GraphNode("C", 2));
        nodelist.add(new GraphNode("D", 3));
        nodelist.add(new GraphNode("E", 4));
        
        Graph g = new Graph(nodelist);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(1, 4);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 4);
        System.out.println(g.toString());

        //!BFS
        // g.bfs();

        //!DFS
        g.dfs();
    }
}
