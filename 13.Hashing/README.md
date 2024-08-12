# Fast cover on Hashing for this tutorial

In this Section, we are going to discuss Hashing methodology in detail

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/1.What.png)

So, Hashing is about indexing data in a specific order according to standard measures.

### Why Hashing?

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/2.Why.png)

Hashing is better in Time complexity as it reduces it to O(1) on average.

### Hashing Terminology

This is the main structure for Hashing and with these components, you can easily build your Hashing Structure like this:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/3.1.Terminology.png)

and now we found the challenge of that topic is **Collision** and it is about the value which is inserted has the same index of the same value as you see in the picture below

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/3.2.Terminology.png)

 Before we go through Collision Solutions let's know about the hash functions that we apply Hashing rules on it.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/4.1ModFunction.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/4.2ASCIIFunction.png)

These are the main 2 Standard Hash Functions that are used in the Hashing operation.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/5.properties.png)

It is the main use of Hashing in how to defeat Collision.

Then let's dive into Collision first this is its types:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/6.Techniques.png)

### Direct Chaining

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/7.DirectChaining.png)

### Linear Probing

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/8.LinearProbing.png)

### Quadratic Probing

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/9.QuadraticProbing.png)

### Double Probing

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/10.DoubleProbing.png)

Each of these types are explained in detail in coading section 

So, before we discuss pros and cons of Hashing let's talk about if the Hash Table is Full?!

This question is answered in the situation of Direct Chaining and Open addressing

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/11.1.Pros&Cons.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/11.2.Pros&Cons.png)

As you can see this situation never acts like an horrible obstacle as the 2 types deals with their way and this is clear in the coding section.

### Pros and Cons of Collision Resolution Techniques

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/11.3.Pros&Cons.png)

This is the summary of the Hashing's Pros and Cons and ideal use of them in proper situation. 

### Practical Use of Hashing

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/12.1.Use.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/12.2.Use.png)

Finally this is a comparison between Hashing and other DS in Time Complexity:

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/13.Hashing/assests/13.Hashing&DS.png)

And we conclude that Hashing is more suitable for specific cases that require it like use practical we discussed above 

**To practice on the Binary Tree topic:**

DirectChaining.java and its main file=> hold all basic operations of DirectChaining and Main for running all methods.

LinearProbing.java and its main file=> hold all basic operations of LinearProbing and Main for running all methods.

QuadraticProbing.java and its main file=> hold all basic operations of QuadraticProbing and Main for running all methods.

DoubleHashing.java and its main file=> hold all basic operations of DoubleHashing and Main for running all methods.

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
