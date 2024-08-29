# Fast cover on BellmanFord Algorithm for this tutorial

In this Section, we are going to discuss the BellmanFord algorithm which is another method for calculating SSSP.

so let me see the comparison between previous algorithms and BellmanFord:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/21.BellmanFord/assets/1.Comparison.png)

So, BellmanFord has more privileges than others.

### What is the BellmanFord Algorithm?

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/21.BellmanFord/assets/2.What.png)

Let's go diving into the main algorithm for the positive weighted Graph: 

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/21.BellmanFord/assets/3.Algorithm.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/21.BellmanFord/assets/4.1.Normal.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/21.BellmanFord/assets/4.2.Normal.png)

The parent of a vertex in each iteration is calculated by the distance between the source and destination vertex and the weight is judged here

we talked about the Normal one let's see the Negative one:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/21.BellmanFord/assets/5.1.Negative.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/21.BellmanFord/assets/5.2.Negative.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/21.BellmanFord/assets/5.3.Negative.png)

so here it deals like the normal one but we don't go to the fifth iteration as we find 0 distance between vertices and it reduces them without any benefit.

### Why does Bellman Ford run V-1 times?

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/21.BellmanFord/assets/6.Why.png)

### BFS vs Dijkstra vs Bellman Ford

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/21.BellmanFord/assets/7.Final_View.png)

This is the full comparison between all 3 methodologies for the SSSP.

**To practice on the Binary Tree topic:**

WeightedNode.java=> holds the initial directions for nodes

WeightedGraph.java=> holds all basic operations of AdjacencyMatrix and Main_Graph for running all methods

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.

