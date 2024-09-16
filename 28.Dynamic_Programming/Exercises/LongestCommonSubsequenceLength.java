/*
 ! Longest Common Subsequence Length problem using Top Down & Bottom Up Approach

 * S1 and S2 are given strings, create a function to find the length of the longest subsequence 
 * which is common to both strings using Dynamic Programming Top Down & Bottom Up Approach.
 * Example
 & S1 = "ABCBDAB"
 & S2 = "BDCABA"
 ^ findLCSLengthTD(S1, S2) //4
 */

package Exercises;
public class LongestCommonSubsequenceLength {
	//! Top Down
    public int findLCSLengthTD(String s1, String s2) {
		int[][] dp = new int[s1.length()][s2.length()]; //dp table will store all the results
		for (int i = 0; i < s1.length(); i++) // initialize all values with '-1'
			for (int j = 0; j < s2.length(); j++)
				dp[i][j] = -1;
		return findLCSLengthAux(dp, s1, s2, 0, 0);
	}//end of method
 
	
	private int findLCSLengthAux(int[][] dp, String s1, String s2, int i1, int i2) {
		if (i1 == s1.length() || i2 == s2.length())//Base case
			return 0;
 
		if (dp[i1][i2] == -1) {//if we have not already solved this problem, only then solve it
			if (s1.charAt(i1) == s2.charAt(i2)) {
				dp[i1][i2] = 1 + findLCSLengthAux(dp, s1, s2, i1 + 1, i2 + 1); //If current character in both the string matches, then increase the index by 1 in both the strings.
				return dp[i1][i2];
			}else {
				int c1 = findLCSLengthAux(dp, s1, s2, i1, i2 + 1);//Increase index of 2nd String
				int c2 = findLCSLengthAux(dp, s1, s2, i1 + 1, i2);//Increase index of 1st String
				dp[i1][i2] = Math.max(c1, c2);
			}
		}
		return dp[i1][i2];
	}//end of method

	//! Bottom Up
	public int findLCSLengthBU(String s1, String s2) {
		
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = s1.length(); i >= 1; i--) {
			
			for (int j = s2.length(); j >= 1; j--) {
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i-1][j-1] =  Math.max((1 + dp[i][j]), Math.max(dp[i][j-1], dp[i-1][j]));
				}
				else {
					dp[i-1][j-1] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}//end of inner loop
		}//end of loop
		return dp[0][0];
	}//end of method

}
