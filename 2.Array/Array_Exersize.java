// import java.util.Arrays;

//import java.util.Random;

public class Array_Exersize {

    // public int[] removeDuplicates(int[] array) {
    //     return null;
    // }
    // todo 1-Middle Elements from an array

    // public static int[] middle(int[] array) {
    //     if (array.length <= 2) {
    //         return new int[0]; // Return an empty array if the input array has 2 or fewer
    //     }

    //     int[] middleArray = new int[array.length - 2];

    //     int index = 1;
    //     while (index < array.length - 1) {
    //         middleArray[index - 1] = array[index];
    //         index++;
    //     }
    //     return middleArray;
    // }

    // ~ ========================================================================
    // todo 2-DiagonalSum

    // public static int sumDiagonalElements(int[][] array) {
    //     int sum = 0;
    //     int numRows = array.length;

    //     for (int i = 0; i < numRows; i++) {
    //         sum += array[i][i];
    //     }
    //     return sum;
    // }

    // ~========================================================================
    // todo 3-best score

    // public static int[] findTopTwoScores(int[] array) {
    //     int firstHighest = Integer.MIN_VALUE;
    //     int secondHighest = Integer.MIN_VALUE;

    //     for (int score : array) {
    //         if (score > firstHighest) {
    //             secondHighest = firstHighest;
    //             firstHighest = score;
    //         } else if (score > secondHighest && score < firstHighest) {
    //             secondHighest = score;
    //         }
    //     }
    //     return new int[] { firstHighest, secondHighest };
    // }

    // ~========================================================================
    // todo 4-Missing score

    // public static int findMissingNumberInArray(int[] array) {
    //     int n = array.length + 1;
    //     int expectedSum = (n * (n + 1)) / 2;
    //     int actualSum = 0;

    //     for (int number : array) {
    //         actualSum += number;
    //     }
    //     return expectedSum - actualSum;
    // }
    // ~ ========================================================================
    // todo 5-Removing duplicate number

    // public int[] removeDuplicates(int[] array) {
    //     int n = array.length;
    //     int[] uniqueArray = new int[n];
    //     int index = 0;

    //     for (int i = 0; i < n; i++) {
    //         boolean isDuplicate = false;
    //         for (int j = i + 1; j < n; j++) {
    //             if (array[i] == array[j]) {
    //                 isDuplicate = true;
    //                 break;
    //             }
    //         }
    //         if (!isDuplicate) {
    //             uniqueArray[index++] = array[i];
    //         }
    //     }
    //     return Arrays.copyOf(uniqueArray, index);
    // }
    // ~ ========================================================================
    // todo 6-removing Duplicates Leetcode26

    // public static int removeDuplicates_2(int[] nums) {
    //     if (nums.length == 0) {
    //         return 0;
    //     }
    //     int i = 0;
    //     for (int j = 1; j < nums.length; j++) {
    //         if (nums[j] != nums[i]) {
    //             i++;
    //             nums[i] = nums[j];
    //         }
    //     }
    //     return i + 1;
    // }
    // ~ ========================================================================
    // todo 7-Best Time to Buy and Sell Stock - LeetCode 121

    // public int maxProfit(int[] prices) {
    //     int minPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;
    //     for (int price : prices) {
    //         if (price < minPrice) {
    //             minPrice = price;
    //         } else if (price - minPrice > maxProfit) {
    //             maxProfit = price - minPrice;
    //         }
    //     }
    //     return maxProfit;
    // }
    // ~ ========================================================================
    // todo 8-Two Sum - LeetCode 1

    // public int[] twoSum(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[] { i, j };
    //             }
    //         }
    //     }
    //     throw new IllegalArgumentException("No two sum solution found");
    // }

    // ~ ========================================================================
    // todo 9-Finding a Number in an Array

    // public int searchInArray(int[] intArray, int valueToSearch) {
    //     for (int i = 0; i < intArray.length; i++) {
    //         if (intArray[i] == valueToSearch) {
    //             System.out.println("Found the number " + i);
    //             return i;
    //         }
    //     }
    //     System.out.println(valueToSearch + " is not found");
    //     return -1;
    // }

    // ~ ========================================================================
    // todo 10-Max Product of Two Integers

    // public String maxProduct(int[] intArray) {
    //     int maxProduct = 0;
    //     String pairs = "";
    //     for (int i = 0; i < intArray.length; i++) {
    //         for (int j = i + 1; j < intArray.length; j++) {
    //             if (intArray[i] * intArray[j] > maxProduct) {
    //                 maxProduct = intArray[i] * intArray[j];
    //                 pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
    //             }
    //         }
    //     }
    //     return pairs;
    // }

    // ~ ========================================================================
    // todo 11-IsUnique / Contains Duplicate - LeetCode 217

    // public boolean isUnique(int[] intArray) {
    //     for (int i = 0; i < intArray.length; i++) {
    //         for (int j = i + 1; j < intArray.length; j++) {
    //             if (intArray[i] == intArray[j]) {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    // ~ ========================================================================
    // todo 12- Permutation

    // public boolean permutation(int[] array1, int[] array2) {
    //     if (array1.length != array2.length) {
    //         return false;
    //     }
    //     int sum1 = 0;
    //     int sum2 = 0;
    //     int mul1 = 1;
    //     int mul2 = 1;

    //     for (int i = 0; i < array1.length; i++) {
    //         sum1 += array1[i];
    //         sum2 += array2[i];
    //         mul1 *= array1[i];
    //         mul2 *= array2[i];
    //     }
    //     if (sum1 == sum2 && mul1 == mul2) {
    //         return true;
    //     }
    //     return false;
    // }

    // ~ ========================================================================
    // todo 13-Rotate Matrix/image - LeetCode 48 - most hard

    // public boolean rotateMatrix(int[][] matrix) {
    //     if (matrix.length == 0 || matrix.length != matrix[0].length)
    //         return false;
    //     int n = matrix.length;
    //     for (int layer = 0; layer < n / 2; layer++) {
    //         int first = layer;
    //         int last = n - 1 - layer;
    //         for (int i = first; i < last; i++) {
    //             int offset = i - first;
    //             int top = matrix[first][i];
    //             matrix[first][i] = matrix[last - offset][first];
    //             matrix[last - offset][first] = matrix[last][last - offset];
    //             matrix[last][last - offset] = matrix[i][last];
    //             matrix[i][last] = top;
    //         }
    //     }
    //     return true;
    // }

    // ~========================================================================
    // todo Exersize:
    // todo Find Maximum Element in an Array using Binary Search

    // ~========================================================================
    // todo Exersize: Find the first duplicate in an array
    // todo https://leetcode.com/problems/find-the-duplicate-number/
    // todo https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-o1
    // todo -extra-space/
    // todo https://www.geeksforgeeks.org/find-first-duplicate-element/
    // todo https://www.geeksforgeeks.org/find-first-duplicate-element-array/
    

}
