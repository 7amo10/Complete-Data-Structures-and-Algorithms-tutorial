# Fast cover on Binary Heap for this tutorial

Here in this section, we will discuss the Binary Heap and its implementation but before going through the details first what is it?

### What is Binary Heap?

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/1.What.png)

So, it is a binary tree but has some specifications and then this picture below demonstrates why we use it:

### Why do we need a Binary Heap?

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/2.Why.png)

Practical Use

- Prim’s Algorithm
- Heap Sort
- Priority Queue

It is all about consuming time and it saves time than array and LinkedList that need iterations for all the data structure.

### Types of Binary Heap

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/3.Type.png)

### Common Operations on Binary Heap

- Creation of Binary Heap,
- Peek top of Binary Heap
- Extract Min / Extract Max
- Traversal of Binary Heap
- Size of Binary Heap
- Insert value in Binary Heap
- Delete the entire Binary heap

### Implementation Options

- Array Implementation
- Reference /pointer Implementation

So, after we know the types of heaps and their Common Operations let's dive into the actual implementation using the array as it most suitable for it

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/4.Features.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/5.1.Create.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/5.2.Peek.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/5.3.Size.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/5.4.LevelOrder.png)

These are all the common features that deal with Binary heap using the regular Tree array implementation that we discussed in the Tree section.

### Binary Heap - Insert a Node

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/6.1.Insert.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/6.2.Insert.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/6.3.Insert.png)

When we insert a value that might violate the Min or Max type of the heap swapping with the parent value is the suitable solution for that problem

### Binary Heap - Extract a Node

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/7.1.Extract.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/7.2.Extract.png)

If we need to delete no values should be deleted except the root node using the extracting method by swapping the root and the last inserted cell
and if there is a conflict with the type the swapping concept be performed on this cell to balance the the Min or Max heap.

### Time and Space Complxity

And finally, this is the complexity for the heap notice that insertion and deletion are more better in time.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/11.Binary_Heap/assests/8.Complexity.png)

### To practice on the Binary Tree topic:

Binary_Heap.java and its main file=> hold all basic operations of Binary_Heap and Main_Binary_Heap for running all methods.

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
