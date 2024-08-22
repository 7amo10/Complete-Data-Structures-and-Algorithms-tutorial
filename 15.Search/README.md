# Fast cover on Searching Tree for this tutorial

In this light Section, we are going to discuss the Search algorithms that we need to search for any element in our data structures.

## First: Linear Search

Linear search is also called as **sequential search algorithm**. It is the simplest searching algorithm. 
In Linear search, we simply traverse the list completely and match each element of the list with the item whose location is to be found. 
If the match is found, then the location of the item is returned; otherwise, the algorithm returns NULL.

**Here is the Terminology of Linear search:**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/15.Search/assests/1.1.Linear.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/15.Search/assests/1.2.Linear.png)

The value of **K**, i.e., **41**, is not matched with the first element of the array. So, move to the next element. 
And follow the same process until the respective element is found.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/15.Search/assests/1.3.Linear.png)

This is the pseudocode for that algorithm when coding:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/15.Search/assests/1.4.Linear.png)

### Linear Search complexity

Now, let's see the time complexity of linear search in the best case, average case, and worst case. 
We will also see the space complexity of linear search.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/15.Search/assests/1.5.Complexity.png)

The time complexity of linear search is `O(n)` because every element in the array is compared only once.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/15.Search/assests/1.5.Complexity_2.png)


## Second: Binary Search

Binary search is the search technique that works efficiently on sorted lists. 
Hence, to search for an element in some list using the binary search technique, we must ensure that the list is sorted.

Binary search follows the divide and conquer approach in which the list is divided into two halves, and the item is compared with the middle element of the list. 
If the match is found then, the location of the middle element is returned. Otherwise, we search into either of the halves depending upon the result produced through the match.

**Here is the Terminology of Binary search:**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/15.Search/assests/2.1.Binary.png)

Let the element to search is, **K = 56**

We have to use the below formula to calculate the **mid** of the array -

`mid = (beg + end)/2`  

So, in the given array -

**beg** = 0

**end** = 8

**mid** = (0 + 8)/2 = 4. So, 4 is the mid of the array.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/15.Search/assests/2.2.Binary.png)

Now, the element to search is found. So algorithm will return the index of the element matched.

This is the pseudocode for that algorithm when coding:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/15.Search/assests/2.3.Binary.png)

### Binary Search complexity

Now, let's see the time complexity of Binary search in the best case, average case, and worst case. We will also see the space complexity of Binary search.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/15.Search/assests/2.4.Complexity.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/15.Search/assests/2.5.Complexity_2.png)

**To practice on the Binary Tree topic:**

Searching.java=> holds all basic operations of Linear & Binary Search algorithms and Main for running all methods

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
