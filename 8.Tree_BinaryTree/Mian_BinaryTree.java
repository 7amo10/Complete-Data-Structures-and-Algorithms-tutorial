public class Mian_BinaryTree {
    public static void main(String[] args) {
        BinaryTreeLL binarytree = new BinaryTreeLL();
        BinaryNode N1 = new BinaryNode();
        N1.value = "N1";
        BinaryNode N2 = new BinaryNode();
        N2.value = "N2";
        BinaryNode N3 = new BinaryNode();
        N3.value = "N3";
        BinaryNode N4 = new BinaryNode();
        N4.value = "N4";
        BinaryNode N5 = new BinaryNode();
        N5.value = "N5";
        BinaryNode N6 = new BinaryNode();
        N6.value = "N6";
        BinaryNode N7 = new BinaryNode();
        N7.value = "N7";
        BinaryNode N8 = new BinaryNode();
        N8.value = "N8";
        BinaryNode N9 = new BinaryNode();
        N9.value = "N9";

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;
        binarytree.root = N1;
        //!Pre Order Method
        // binarytree.preOrder(binarytree.root);
        //!In Order Method
        // binarytree.inOrder(binarytree.root);
        // //!Post Order Method
        // binarytree.postOrder(binarytree.root);
        //!Level Order Method
        // binarytree.levelOrder();
        //!Search Method
        // binarytree.search("N5");
        //!Insert Nodes
        // binarytree.insert("N1");
        // binarytree.insert("N2");
        // binarytree.insert("N3");
        // binarytree.insert("N4");
        // binarytree.insert("N5");
        // binarytree.insert("N6");
        // binarytree.levelOrder();
        // System.out.println();
        //!Get the deepest Node
        // System.out.println("The deepestNode is: "+binarytree.getDeepestNode().value);
        //!Delete deepest Node
        // binarytree.deleteDeepestNode();
        // System.out.println();
        // binarytree.levelOrder();
        //!Delete specific Node
        // binarytree.deleteNode("N3");
        // System.out.println();
        // binarytree.levelOrder();
        //!Delete entire Node
        // binarytree.deleteBT();
    }
}