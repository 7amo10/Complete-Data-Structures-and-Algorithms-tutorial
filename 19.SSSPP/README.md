# Fast cover on the SSSPP for this tutorial

In this Section, we are going to discuss the Single Source Shortest Path Problem that depends on our topics in Graph

## What is a Single Source Shortest Path Problem?

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/19.SSSPP/assets/1.What.png)

So this topic is the main that we will cover in upcoming lectures like these:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/19.SSSPP/assets/2.Types.png)

### First: BFS

As the way the BFS is working the Queue data structure is suitable for finding the SSSP.

- Note that we enqueue vertices as the rule of closest neighbor from the vertex and when they finish the next counter vertex is ready.

### Time and Space Complexity - BFS for SSSPP

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/19.SSSPP/assets/4.Complexity.png)

### Why does BFS not work with weighted Graphs?

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/19.SSSPP/assets/5.1.Why.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/19.SSSPP/assets/5.2.Why.png)

Here the BFS has some limitations in that it just works with unweighted Graphs and we will solve this problem in upcoming lectures.

### Why does DFS not work SSSPP?

This is clear as the methodology of DFS working violates the shortest path idea.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/19.SSSPP/assets/5.3.Why.png)

**To practice on the Binary Tree topic:**

GraphNode.java=> holds the initial directions for nodes

Graph.java=> holds all basic operations of AdjacencyMatrix and Main_Graph for running all methods

Graph.java=> holds all basic operations of AdjacencyList and Main_Graph for running all methods

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
