# Fast cover on Graph & Graph Traversal for this tutorial

In this Section, we are going to discuss the Graph data structure on the construction side and then go through its traversal algorithms.

Then what is a Graph?

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/1.What.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/2.Why.png)

So, in brief, the Graph is about a collection of nodes that are architectured in many types and terminologies.

## Graph Terminology

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/3.1.Terminology.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/3.2.Terminology.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/3.3.Terminology.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/3.4.Terminology.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/3.5.Terminology.png)

As you can see these are the factors of Graph terminology that are the main base of the Graph's categorization.

## Graph Types

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/4.Types.png)

1. Unweighted - undirected

2. Unweighted - directed

3. Positive - weighted - undirected

4. Positive - weighted - directed

5. Negative - weighted - undirected

6. Negative - weighted - directed

Here we will show the main 2 forms of Graph **Adjacency Matrix** and **Adjacency List**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/5.1.Representation.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/5.2.Representation.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/5.3.Representation.png)

These are their definition and when we should use them.

# Graph Traversal

we discussed the Graph construction and its representation now, we are going to deal with the graph algorithms.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/6.Traversal.png)

## Breadth First Search (BFS)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/7.1.BFS.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/7.2.BFS.png)

We used Queue as it is more suitable in this case of traversal and the items are added based on their connections with other nodes and the repeated one ignored form the enqueue method.

## Time and Space Complexity of BFS

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/7.3.BFS.png)

## Depth First Search (DFS)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/8.1.DFS.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/8.2.DFS.png)

We used Stack as it is more suitable in this case of traversal and the items are added based on their connections with other nodes and the repeated one added normally to visit all nodes in the Graph.

## Time and Space Complexity of DFS

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/8.3.DFS.png)

## BFS vs DFS

Finally this is a brief comparison between these types of traversal:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/16%2617.Graph/assests/9.BFSvsDFS.png)

**To practice on the Binary Tree topic:**

GraphNode.java=> holds the initial directions for nodes

Graph.java=> holds all basic operations of AdjacencyMatrix and Main_Graph for running all methods

Graph.java=> holds all basic operations of AdjacencyList and Main_Graph for running all methods

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
