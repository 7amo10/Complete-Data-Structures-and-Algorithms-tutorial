# Fast cover on FloydWarshalls Algorithm for this tutorial

In this Section, we are going to discuss the first algorithm for calculating the All-Pairs Shortest Path.

The logic behind it is that we keep updating the cells of this matrix until we find the Shortest Path for all vertices.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/23.FloydWarshall/assets/1.1.Normal.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/23.FloydWarshall/assets/1.2.Normal.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/23.FloydWarshall/assets/1.3.Normal.png)

As we said before, the algorithm of All-Pairs that we discussed is the main methodology here.

For example, via A we search for paths that need to be shortened or instantiate a value to A

### Why Floyd Warshall Algorithm?

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/23.FloydWarshall/assets/2.Why.png)

Vertex is connected by others or it is infinity, these 2 reasons for using FloydWarshall.

### Floyd Warshall negative cycle

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/23.FloydWarshall/assets/3.Negative.png)

The rule of this algorithm is that the FW can never loop twice that Negative Graphs can't be used here.

### Which algorithm to use for APSP?

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/23.FloydWarshall/assets/4.1.Final_Comparison.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/23.FloydWarshall/assets/4.2.Final_Comparison.png)

This is another Comparison that demonstrates all the algorithms that we need if we want to calculate the Shortest Path.

**To practice on the Binary Tree topic:**

WeighedNode.java=> holds the initial directions for nodes

FloydWarshall.java=> holds all basic operations of AdjacencyMatrix and Main_Floyd for running all methods

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
