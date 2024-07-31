/*
 * Implementing basic Stack operations
 */
public class Stack {
    private Node top;
    public int height;
 
    public Stack() {
        top = null;
        height = 0;
    }
 
    public Node pop() {
        if (height == 0) {
            return null;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
    //*=> Time Complexity is: O(1) And Space Complexity is: O(1)

    public void push(Node node) {
        node.next = top;
        top = node;
        height++;
    }
    //*=> Time Complexity is: O(1) And Space Complexity is: O(1)
}