# Fast cover on Trie for this tutorial

In this Section, we will discuss the Trie data structure and all details about it.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/1.1.What.png)

so the Trie is a Tree data structure with some differences like non-repetitive characters and end string node.

The following pictures show the steps for the way of structuring the Trie.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/1.2.What.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/1.3.What.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/1.4.What.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/1.5.What.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/1.6.What.png)

The root node begins with **'A'** that has left child **'I'** then the inserted nodes should be in this way for **'R'** and then closing the **'A'** and **'I'** as they don't have the end of string node 

then if we want to insert more nodes the first 2 nodes are closed as we said before so the **'T'** node be inserted with **'R'** as it has an end-of-string node.

- note that the first string is **'AIR'** and the second is **'AIT'** so the **'T'** is inserted after **'A'** and **'I'** as we don't have them repeated.

followed by the same concept for the **'BAR'** word the **'B'** isn't repeated so it is inserted with **'A'** and its child in the right

For **'BIL'** the **'B'** is repeated so we don't insert it and then insert **'I'** with the right **'A'** and then **'L'** right for **'AI'**

Finally **'BM'** the **'B'** is repeated so we don't insert it and then insert **'M'** as it's not repeated with **'AI'** to be **'AIM'**.

### When do we need Trie?

To solve many standard problems in an efficient way

- Spelling checker
- Auto completion

### Common Operations on Trie

- Creation of Trie
- Insertion in Trie
- Search for a String in trie
- Deletion from Trie

### Creation of Trie

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/2.Creation.png)

### Insertion in Trie

Here, we insert in Trie according to 4 cases as the pictures will show.

- Note: End of String = Yes, No -> to demonstrate whether the status of the specified node is at the end or not.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/3.1.Insert.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/3.2.Insert.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/3.3.Insert.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/3.4.Insert.png)

To summarize, the empty container is the end-of-string node and the cases are implemented in the coding files simply.

### Search for a String in trie

Also, the Search method follows the cases way as the first if the string already exists, the second if the string exists and the third if the string exists but not complete

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/4.1.Search.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/4.2.Search.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/4.3.Search.png)

### Deletion from Trie

As you can see the end-of-string is the guide for deleting characters and the coding files take these cases in detail.

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/5.1.Delete.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/5.2.Delete.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/5.3.Delete.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/5.4.Delete.png)

**And finally the the practical use of the Trie data structure:**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/12.Trie/assests/6.Use.png)

### To practice on the Binary Tree topic:

TrieNode.java=> holds the initial directions for nodes.

Trie.java and its main file=> hold all basic operations of Trie and Main_Trie for running all methods.

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
