# Fast cover on Binary Search Tree for this tutorial

In this Section, we are going to discuss the BST (Binary Search Tree)

### What is BST?
![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/9.Binary_Search_Tree/assests/1.What.png)

Here, BST has specific characteristics over Binary Tree in how to assign nodes with these rules in the picture.

### Why Binary Search Tree?

- It performs faster than Binary Tree when inserting and deleting nodes.

### Common Operations on Binary Search Tree:

- Creation of BST
- Insertion of a node
- Deletion of a node
- Search for a value
- Traverse all nodes
- Deletion of BST

### Create a Binary Search Tree

newBST = BST()

### Binary Search Tree - Insert a Node

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/9.Binary_Search_Tree/assests/2.1.Insert.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/9.Binary_Search_Tree/assests/2.2.Insert.png)

As you can see when you insert a node like 10 first you check if this value is less or more the root node then if it is 
less this node will be checked for the next left nodes and so on until be the less one in the left.
All of this is the same in right but different in value (more).

### Binary Search Tree - Traversal

Depth-first search

- Preorder traversal
- Inorder traversal
- Post order traversal

Breadth-first search
- Level order traversal

In Traversal methods the way of traversing nodes is the same for Binary Tree so we won't go through its details.

### Binary Search Tree - Search

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/9.Binary_Search_Tree/assests/3.Search.png)

In the Search method, we did the same way in traversing.

### Binary Search Tree - Delete a Node

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/9.Binary_Search_Tree/assests/4.1.Delete.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/9.Binary_Search_Tree/assests/4.2.Delete.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/9.Binary_Search_Tree/assests/4.3.Delete.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/9.Binary_Search_Tree/assests/4.4.Delete.png)

In case 3 we did a special way of deleting the node using Successor on the left's right side and this way is widely 
detailed in the Coding files that we will demonstrate below.

### Binary Search Tree - Delete Entire Tree
- root = null

### Binary Search Tree - Time and Space Complexity

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/9.Binary_Search_Tree/assests/5.Complexity.png)

#### To practice on the Binary Tree topic:

BinaryNode.java=> holds the initial directions for nodes.

BinarySearchTree.java and its main file=> hold all basic operations of BinarySearchTree and Main_BinarySearchTree for running all methods.

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
