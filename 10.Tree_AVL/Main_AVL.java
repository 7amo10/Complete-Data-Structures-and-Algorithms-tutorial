public class Main_AVL {
    public static void main(String[] args) {
        AVL_Tree tree = new AVL_Tree();
        tree.insert(5);
        tree.insert(10);
        tree.insert(15);
        tree.insert(20);
        tree.levelOrder();
        tree.delete(5);
        System.out.println();
        tree.levelOrder();
    }
}