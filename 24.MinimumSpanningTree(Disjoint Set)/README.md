# Fast cover on MinimumSpanningTree(Disjoint Set) for this tutorial

In this Section, we are going to discuss the MinimumSpanningTree(Disjoint Set).

### First: **Minimum Spanning Tree**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/24.MinimumSpanningTree(Disjoint%20Set)/assets/1.1.Spanning.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/24.MinimumSpanningTree(Disjoint%20Set)/assets/1.2.Spanning.png)

So this kind of tree doesn't need cycles as it is a single one and when comparing it and SSSPP you find the cost of the first less than the second!

So, we can say that the **Minimum Spanning Tree** finds the cheapest way from the selected node and continue 

### Second: **Disjoint Set**

It is a data structure that keeps track of a set of elements that are partitioned into a number of
disjoint and non-overlapping sets and each sets have a representative which helps in identifying
that sets.

- Make Set
- Union
- Find Set

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/24.MinimumSpanningTree(Disjoint%20Set)/assets/2.Disjoint.png)

As you can see the Disjoint Set is the set of elements that are eliminated together step by step to contain the whole node.

**To practice on the Binary Tree topic:**

WeighedNode.java=> holds the initial directions for nodes

DisjointSet.java=> holds all basic operations of DisjointSet and Main_DisjointSet for running all methods

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
