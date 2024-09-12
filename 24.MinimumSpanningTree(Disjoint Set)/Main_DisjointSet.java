import java.util.ArrayList;

public class Main_DisjointSet {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodelist = new ArrayList<>();
        nodelist.add(new WeightedNode("A", 0));
        nodelist.add(new WeightedNode("B", 0));
        nodelist.add(new WeightedNode("C", 0));
        nodelist.add(new WeightedNode("D", 0));

        DisjointSet.makeSet(nodelist);
        WeightedNode firstNode = nodelist.get(0);
        WeightedNode secondNode = nodelist.get(1);
        DisjointSet output = DisjointSet.findSet(secondNode);
        output.printAllNodesofThisSet();

        DisjointSet.union(firstNode, secondNode);
        output = DisjointSet.findSet(secondNode);
        output.printAllNodesofThisSet();
    }
}
