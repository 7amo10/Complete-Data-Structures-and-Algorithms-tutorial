# Fast Cover on Queue for this tutorial

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/1.What%20is%20a%20queue.png)

### Why do we need a Queue?

- Utilize first-coming data first, while others wait for their turn
- FIFO method - First In First Out

### Applications on Queue Data Structure

- Point sale system of a restaurant
- Printer queue
- Call center phone systems

### **Queue Operations**

- Create Queue
- Enqueue
- Dequeue
- Peek
- isEmpty
- isFull
- deleteQueue

First: Queue using **Array**

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/2.Linear%20Queue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/2.1.Enqueue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/2.2.Enqueue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/2.3.Enqueue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/3.1.Dequeue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/3.2.Dequeue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/4.Peek.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/5.IsEmpty.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/6.IsFull.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/5.IsEmpty.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/7.Delete.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/8.Complexity.png)

### Second: Circular Queue using **Array**

This picture demonstrates why we need to use Circular Queue

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/9.Importance.png)

The operations in the linear queue are the same as in the Circular Queue but different in implementation 

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/10.CQueue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/11.1.Enqueue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/11.2.Enqueue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/11.3.Enqueue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/12.1.Dequeue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/12.2.Dequeue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/12.3.Dequeue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/13.Peek.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/14.1.IsFull.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/14.2.IsFull.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/14.3.IsFull.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/15.IsEmpty.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/16.Delete.png)

### Advantages of Circular Queue

- As the insertion in the queue is from the rear end and in the case of Linear Queue of fixed size insertion is not possible when the rear reaches the end of the queue.
- But in the case of Circular Queue, the rear end moves from the last position to the front position circularly.

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/17.Complexity.png)

### Second: Queue using **LinkedList**

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/18.1.Enqueue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/18.2.Enqueue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/19.1.Dequeue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/19.2.Dequeue.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/20.Peek.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/21.IsEmpty.png)

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/22.Delete.png)

As you can see in the LinkedList implementation, the Enqueue method works under LinkedList rules by 
updating the next reference from the head to the new node.

In the Dequeue method, you find that the node we want to remove and its reference between it and 
The head node is removed and then it becomes garbage collection and is successfully dequeued. 

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/23.Complexity.png)

And then this is the comparison between Array and LinkedList implementation in Queue:

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/24.Array%20vs%20LinkedList.png)

Finally when we use or avoid Queue:

![Screenshot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/6.Queue/assests/25.Use&Avoid.png)

**To practice on the Binary Tree topic:**

- QueueArray.java and its main file => holds all basic operations of Queue using Array

- CircularQueue.java and its main file => hold all basic operations of Circular Queue 

- Node, LinkedList, QueueLinkedList, and its main => all contain basic operations of Queue using LinkedList

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
