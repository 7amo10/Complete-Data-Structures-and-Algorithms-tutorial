/*
 ! Longest repeated Subsequence Length problem

 * Create a function to find the length of Longest Repeated Subsequence. The longest repeated subsequence (LRS) is the longest subsequence of a string that occurs at least twice.
 * Example
 & findLongestRepeatingSubSeq('ATAKTKGGA') // 4 LRS = ATKG 
 */

package Exercises;

public class LongestRepeatedSubsequenceLength {
    int findLongestRepeatingSubSeq(String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j)
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return dp[n][n];
    } 
}
