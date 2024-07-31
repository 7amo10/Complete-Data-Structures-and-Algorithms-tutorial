import java.util.ArrayList;

public class NodeTree {
  String data;
  ArrayList<NodeTree> children;

  public NodeTree(String data) {
    this.data = data;
    this.children = new ArrayList<NodeTree>();
  }

  public void addChild(NodeTree node) {
    this.children.add(node);
  }

  public String print(int level) {
    String ret;
    ret = "  ".repeat(level) + data + "\n";
    for (NodeTree node : this.children) {
      ret += node.print(level + 1);
    }
    return ret;
  }
}
