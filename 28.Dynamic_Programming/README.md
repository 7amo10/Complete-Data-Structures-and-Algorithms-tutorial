# Fast cover on Dynamic Programming for this tutorial

In this Section, we are going to discuss Dynamic Programming which is the most trendy and has great importance among software engineers

First of all, let me talk about its definition in brief 


> It's an algorithmic technique for solving an optimization problem by breaking it down into simpler sub-problems and utilizing the fact that the optimal solution to the overall problem depends upon the optimal solution to its sub-problems

### Optimal Sub Structure 

> If any problem's overall optimal solution can be constructed from the optimal solutions of its subproblem then this problem has it.

**Example:** Fib(n) = Fib(n-1)+Fib(n-2)....

### Overlapping Sub problem

> It's a similar version of the original one and any problem has overlapping sub-problems if finding its solution involves solving the same sub-problem multiple times.

Now, let's talk about the main 2 concepts of Dynamic Programming which are **TopDown approach** & **BottomUp approach**

### Top Down with Memoization 

``` python []
Memoization is to solve the bigger problem by recursively finding the solution to smaller sub-problems whenever
we solve a sub-problem, we cache its result so that we don't end up solving it repeatedly if it's called multiple times.

```
- This technique of sorting requires the result of already solved problems-> Memoization

**Example:** Fibonacci 

### Bottom Up with Tabulation

``` python []
Tabulation is the opposite of the top-down approach and avoids recursion. In this approach,
we solve the problem "Bottom-Up" (By solving all the related sub-problems first)
This is done by filling up a table. Based on the results in the table, the solution to the top original problem is then computed
```

And then let me show you the problems that we will explain them in detail:

- **Note->** These problems are shown by definition and form before DP, algorithm, and approach type.

### Number Factor

This is the problem that we use the Fibonacci series to implement and this is its definition 

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/1.1.NumberFactor.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/1.2.NumberFactor.png)

**Algorithm in DP:**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/1.3.NumberFactor.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/1.4.NumberFactor.png)

**Approach Type:**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/1.5.NumberFactor.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/1.6.NumberFactor.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/1.7.NumberFactor.png)

### House Robber

This is the problem that we use the Fibonacci series to implement and this is its definition 

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/2.1.HouseRobber.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/2.2.HouseRobber.png)

**Algorithm in DP:**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/2.3.HouseRobber.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/2.4.HouseRobber.png)

**Approach Type:**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/2.5.HouseRobber.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/2.6.HouseRobber.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/2.7.HouseRobber.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/2.8.HouseRobber.png)

### Convert String

This is the problem that we use the Fibonacci series to implement and this is its definition 

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/3.1.ConvertString.png)

**Algorithm in DP:**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/3.2.ConvertString.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/3.3.ConvertString.png)

**Approach Type:**

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/3.4.ConvertString.png)

![ScreenShot](https://github.com/7amo10/Complete-Data-Structures-and-Algorithms-tutorial/blob/main/28.Dynamic_Programming/assets/3.5.ConvertString.png)


> Don't worry if you have a misunderstanding about this topic as you should get more knowledge
> from different sources on the internet like Udemy, Coursera, YouTube, etc...
> The coding files will help you very well to practice for that advanced topic 

**Check coding files for a basic understanding of the approach and its problems and then go to practice in the Exercises folder which has various famous problems.**

Feel free when you open this README file to read or listen for a good tutorial for this topic then review this article and finally try with the questions.
