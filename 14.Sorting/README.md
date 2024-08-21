# Fast cover on Sorting for this tutorial

In this Section, we are going to discuss our first algorithm in this tutorial.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/1.1.What.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/1.2.What.png)

So, this algorithm cares about sorting the data structures in ascending or descending order.

### Types of Sorting

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/2.1.Types.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/2.2.Types.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/2.3.Types.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/2.4.Types.png)

As you can see these are the main categories of Sorting and its examples.

### Sorting Terminology

**Increasing Order**
- If a successive element is greater than the previous one

- Example: 1, 3, 5, 7, 9,11

**Decreasing Order**

- If a successive element is less than the previous one

- Example: 11, 9, 7, 5, 3, 1

**Non Increasing Order**

- If a successive element is less than or equal to its previous element in the sequence.

- Example: 11, 9, 7, 5, 5, 3, 1

**Non Decreasing Order**

- If a successive element is greater than or equal to its previous element in the sequence

- Example: 1, 3, 5, 7, 7, 9, 11

### Sorting Algorithms

**Bubble sort**

**Selection sort**

**Insertion sort**

**Bucket sort**

**Merge sort**

**Quick sort**

**Heap sort**

**Which one to select?**

- Stability
- Space efficient
- Time efficient

## Bubble Sort

The process from the first step to the final step using the Bubble sort algorithm (Swap adjacent items till sorting the item in the correct position)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/3.1.Bubble.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/3.2.Bubble.png)

#### When to use Bubble Sort?

- When the input is almost sorted

### When to avoid Bubble Sort?

- Average time complexity is poor
- Space is a concern
- Easy to implement

## Selection Sort

The process from the first step to the final step using the Selection sort algorithm (dividing the array into sorted and unsorted and moving items into the sorted part using the Minimum number)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/4.1.Selection.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/4.2.Selection.png)

### When to use Selection Sort?

- When we have insufficient memory

### When to avoid Selection Sort?

- When time is a concern
- Easy to implement

## Insertion Sort

The process from the first step to the final step using the Insertion sort algorithm (dividing the array into sorted and unsorted  using the comparison between the first element in unsorted and moving it to the sorted part)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/5.1.Insertion.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/5.2.Insertion.png)

### When to use Insertion Sort?

- When we have insufficient memory

### When to avoid Insertion Sort?

- When time is a concern
- Easy to implement
- When we have a continuous inflow of numbers and we want to keep them sorted

## Bucket Sort

The process from the first step to the final step using the Bucket sort algorithm (Buckets that distribute elements according to the mathematical calculations below)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/6.1.Bucket.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/6.2.Bucket.png)

### When to use Bucket Sort?

- When input uniformly distributed over a range

1,2,4,5,3,8,7,9    ------------     ~1,2,4,91,93,95~

### When to avoid Bucket Sort?

- When space is a concern

  ## Merge Sort

- Merge sort is a divide-and-conquer algorithm
- Divide the input array into two halves and we keep halving recursively until they become too
small that cannot be broken further
- Merge halves by sorting them

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/7.1.Merge.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/7.2.Merge.png)

### When to use Merge Sort?

- When you need a stable sort

### When to avoid Merge Sort?

- When space is a concern
- When the average expected time is O(NlogN)

## Quick Sort

The process from the first step to the final step using the Quick sort algorithm (divide and conquer approach where the pivot,left, and right are the rules of this algorithm)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/8.1.Quick.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/8.2.Quick.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/8.3.Quick.png)

### When to use Quick Sort?

- When you need a stable sort

### When to avoid Quick Sort?

- When space is a concern
- When the average expected time is O(NlogN)

## Heap Sort

This type is based on the Heap data structure 

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/9.1.Heap.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/9.2.Heap.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/9.3.Heap.png)

## Time and Space Complexity

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/14.Sorting/assests/10.Complexity.png)

**To practice on the Binary Tree topic:**


**Bubble sort**,**Selection sort**,**Insertion sort**,**Bucket sort**,**Merge sort**,**Quick sort**,**Heap sort**
.java=> holds all basic operations of Sorting types and Main_(sorting files) for running all methods

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.




