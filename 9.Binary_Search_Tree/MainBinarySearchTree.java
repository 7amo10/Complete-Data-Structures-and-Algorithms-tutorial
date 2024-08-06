public class MainBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree binarytree = new BinarySearchTree();
        binarytree.insert(70);
        binarytree.insert(50);
        binarytree.insert(90);
        binarytree.insert(30);
        binarytree.insert(60);
        binarytree.insert(80);
        binarytree.insert(100);
        binarytree.insert(20);
        binarytree.insert(40);
        //!Pre Order Method
        // binarytree.preOrder(binarytree.root);
        //!In Order Method
        // binarytree.inOrder(binarytree.root);
        // //!Post Order Method
        // binarytree.postOrder(binarytree.root);
        //!Level Order Method
        // binarytree.levelOrder();
        //!Search Method
        // binarytree.search(binarytree.root,40);
        binarytree.levelOrder();
        // System.out.println();
        
        //!Delete Node
        // binarytree.deleteNode(binarytree.root,90);
        // System.out.println();
        // binarytree.levelOrder();
        //!Delete entire Node
        binarytree.deleteBST();
    }    
}
