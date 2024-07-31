# Fast cover on Tree & Binary Tree for this tutorial

Here in this topic Tree is so important to learn as it is used for illustrating the problem in Tree format.

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/1.What%20is%20Tree.png)

And here is the structure of the Tree to know a full knowledge of it.

### **Why Tree?**
- Quicker and Easier access to the data
- Store hierarchical data, like folder structure, organization structure, and XML/HTML data.
- Many different types of data structures perform better in various situations
- Binary Search Tree, AVL, Red Black Tree, Trie
  
![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/2.Tree%20Terminology.png)
- Depth of node N4 (for example) = 2 => from N1 to N2 to N4
- Height of node N3 (for example) = 1 => from N3 to N6 is a step
- Depth of Tree = zero
- Height of Tree = 3 from root to deepest node

As an example, the file NodeTree demonstrates this very well.

### **Binary Tree**
###
![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/3.Binary%20Tree.png)

### **Why Binary Tree?**  
- Binary trees are a prerequisite for mode advanced trees like BST, AVL, Red Black Trees
- Huffman coding problems, heap priority problems, and expression parsing problems can be solved
- efficiently using binary trees,

It is a specific form of Tree that we will discuss in detail:

### **Types of Binary Tree**

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/4.1.Full%20Binary%20Tree.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/4.2.Complete%20Binary%20Tree.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/4.3.Perfect%20Binary%20Tree.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/4.4.Balanced%20Binary%20Tree.png)

These are the types of Binary Tree that we use and now it's time to construct  
the creation form of Binary Tree using **LinkedList** and **Array** 

### First: Using **LinkedList**

we will discuss how to perform basic operations on Tree LinkedList in practice like:
- Creation of Tree
- Insertion of a node
- Deletion of a node
- Search for a value
- Traverse all nodes
- Deletion of tree

1.Traverse nodes:

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/5.Traversal-Linked.png)

a. Preorder traversal

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/5.1.Preorder.png)

b. Inorder traversal

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/5.2.Inorder.png)

c. Post order traversal

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/5.3.Postorder.png)

d.  Level order traversal

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/5.4.levelorder.png)

2.Search for a value

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/6.Search.png)
- note searching method uses level order traversal

3.Insert of a node

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/7.Insert.png)

4.Delete of a node

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/8.Delete.png)

5.Delete Tree

Steps=> rootNode = Null

### Second: Using **Array**

we will discuss how to perform basic operations on Tree LinkedList in practice like:
- Creation of Tree
- Insertion of a node
- Deletion of a node
- Search for a value
- Traverse all nodes
- Deletion of tree

1.Creation of Tree

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/9.Creation-Array.png)

As you can see the implementation of Tree using Array is different from LinkedList as the fixed size of the array
so, we follow these mathematical calculations from index 1 not index 0 due to complex mathematical problems.

2. Traverse nodes are the same for linkedList as a concept but different in implementation

3.Insert a node

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/10.Insert.png)

4.Search for a value

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/11.Search.png)
- note searching method uses level order traversal

4.Delete of a node

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/12.Delete.png)

5.Delete Tree

Steps=> arr = Null

Then finally let's compare the time and space complexity for Tree using (LinkedList and Array)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/8.Tree_BinaryTree/assests/13.Complexity.png)

To practice on the Binary Tree topic:
- BinaryNode.java=> holds the initial directions for nodes
- BinaryTreeLL.java=> holds all basic operations of LinkedListTree and Main_BinaryTree for running all methods
- BinaryTree.java=> holds all basic operations of arrayTree MainBinaryTree for running all methods

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
