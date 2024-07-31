public class MainBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        //!Insert Method
        tree.insert("N1");
        tree.insert("N2");
        tree.insert("N3");
        tree.insert("N4");
        tree.insert("N5");
        tree.insert("N6");
        tree.insert("N7");
        tree.insert("N8");
        tree.insert("N9");
        System.out.println();
        //!Pre Order Method
        // tree.preOrder(1);
        //!In Order Method
        // tree.inOrder(1);
        //!Post Order Method
        // tree.postOrder(1);
        //!Level Method
        // tree.levelOrder();
        //!Search Method
        // System.out.println(tree.search("N5"));
        //!Delete Node Method
        // tree.delete("N5");
        // tree.levelOrder();
        //!Delete entire Tree Method
        tree.deleteBT();
    }
}
