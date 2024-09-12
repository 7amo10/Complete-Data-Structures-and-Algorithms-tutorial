# Fast cover on All Pairs Shortest Path Problem (APSPP) for this tutorial

In this Section, we are going to discuss the All-pairs Shortest Path Problem (APSPP) as we know from previous lectures single source shortest path.

Let's learn about how we combine these single sources, and how we manage them.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/22.All_Pair_SPP/assets/1.What.png)

As you can see in this example, the combination of single sources comes from the single you learned in previous lectures and here we will take each single to get its shortest path and then combine them as a collection. 

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/22.All_Pair_SPP/assets/2.Explain.png)

### How it works?

Here when we take each single source, we define a source vertex that connects it and the single like this example:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/22.All_Pair_SPP/assets/3.1.Vertices.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/22.All_Pair_SPP/assets/3.2.Vertices.png)

In this example, we took 5 source vertices as this is the number of Graph vertices'. 

- Note that we can calculate these paths by Dijkstra, BFS, and BellmandFord as we did before.
- This is not the optimal solution for the All Pairs Problem and we find better in upcoming lectures.

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
