import java.util.HashMap;
import java.util.Map;

public class TrieNode {
  Map<Character, TrieNode> children;
  boolean endOfString;

  public TrieNode() {
    children = new HashMap<>();
    endOfString = false;
  }
}
