# Fast cover on AVL Tree for this tutorial

In this Section, we will discuss AVL Tree with all the required details for it.

Note:
- AVL Tree has more specifications than BST like it cares about balancing between left and right sides.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/1.1.What.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/1.2.What.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/1.3.What.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/1.4.What.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/1.5.What.png)

So as you can see we use Rotation in these cases of unbalancing sides of the tree in these steps:

- Calculate the difference between the height of the root node (the node you want to balance) and its leaf node
- then when you calculate the difference on the right and left sides If the difference is more than 1 the node is in need
to rebalance else the node is balanced.

### What do we need for AVL Tree?

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/2.1.Why.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/2.2.Why.png)

Don't you think why we use this specific kind of trees?

so the reason is when there is a tree that is in one side shape the complexity of traversing is O(N) as it is more consuming for memory

On the other hand, AVL Tree uses a balancing technique that reduces the complexity O(LogN).

### Common Operations on AVL Tree

- Creation of AVL trees,
- Search for a node in AVL trees
- Traverse all nodes in AVL trees
- Insert a node in AVL trees
- Delete a node from AVL trees
- Delete the entire AVL trees

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/3.Creation.png)

### Binary Search Tree - Traversal

Depth-first search

- Preorder traversal
- Inorder traversal
- Post order traversal

Breadth-first search

- Level order traversal

In Traversal methods the way of traversing nodes is the same for Binary Tree and BST so we won't go through its details.

### AVL Tree - Search

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/4.Search.png)

### AVL Tree - Insert a Node

- Case 1: Rotation is not required
- Case 2: Rotation is required

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/5.1.Insert_LL.png)

Rotation is not required when the balancing equation is safe (0 or 1 for the difference)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/5.2.Insert_LL.png)

Here, when the rotation is required there are conditions for balancing as the picture shows above.

**left-left condition**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/5.3.Insert_LL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/5.4.Insert_LL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/5.5.Insert_LL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/5.6.Insert_LL.png)

To summarize the left-left condition, when the node is inserted in one side column in the left and the balance becomes over 1 then we perform the right rotation as the pictures show

**left-right condition**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/6.1.Insert_LR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/6.2.Insert_LR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/6.3.Insert_LR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/6.4.Insert_LR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/6.5.Insert_LR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/6.6.Insert_LR.png)

To summarize the left-right condition, when the inserted node becomes on the left side but in the right child for its root node as the pictures show we perform left rotation and then right rotation

**right-right condition**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/7.1.Insert_RR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/7.2.Insert_RR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/7.3.Insert_RR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/7.4.Insert_RR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/7.5.Insert_RR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/7.6.Insert_RR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/7.7.Insert_RR.png)

To summarize the right-right condition, when the node is inserted in one side column in the right and the balance becomes over 1 then we perform the left rotation as the pictures show

**right-left condition**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/8.1.Insert_RL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/8.2.Insert_RL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/8.3.Insert_RL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/8.4.Insert_RL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/8.5.Insert_RL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/8.6.Insert_RL.png)

To summarize the right-left condition, when the inserted node becomes on the right side but in the left child for its root node as the pictures show we perform right rotation and then left rotation

Then, let's combine all these conditions and perform a real insertion method problem:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/9.1.Insert_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/9.2.Insert_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/9.3.Insert_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/9.4.Insert_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/9.5.Insert_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/9.6.Insert_ALL.png)

As you can see we go through the insertion method step by step based on the current situation of the problem.

### AVL Tree - Delete a Node

- Case 1 - Rotation is not required
- Case 2 - Rotation is required (LL, LR, RR, RL)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/10.1.Delete.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/10.2.Delete.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/10.3.Delete.png)

The way for inserting a node is the same as deleting this node.

**left-left condition**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/11.Delete_LL.png)

**left-right condition**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/12.1.Delete_LR.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/12.2.Delete_LR.png)

**right-right condition**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/13.Delete_RR.png)

**right-left condition**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/14.1.Delete_RL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/14.2.Delete_RL.png)

Then, let's combine all these conditions and perform a real deletion method problem:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/15.1.Delete_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/15.2.Delete_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/15.3.Delete_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/15.4.Delete_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/15.5.Delete_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/15.6.Delete_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/15.7.Delete_ALL.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/15.8.Delete_ALL.png)

As you can see we go through the deletion method step by step based on the current situation of the problem.

**The time and space complexity for the AVL Tree:**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/16.Complexity.png)

Remember that the insertion and deletion are more suitable for consuming memory than BST so it has the complexity: O(LogN)

**So let's compare between the complexity of BST and AVL:**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/10.Tree_AVL/assests/17.BST_VS_AVL.png)

**To practice on the Binary Tree topic:**

BinaryNode.java=> holds the initial directions for nodes.

AVL_Tree.java and its main file=> hold all basic operations of AVL_Tree and Main_AVL for running all methods.

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.


