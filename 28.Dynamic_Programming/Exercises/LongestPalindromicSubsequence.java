/*
 ! Longest Palindromic Subsequence using Top Down Approach & Bottom Up Approach
 * We are given a String.
 * We need to find the length of its Longest Palindromic Subsequence (LPS) in the given String using Dynamic Programming Top Down Approach & Bottom Up Approach.
 * A subsequence is a sequence that can be derived from another string by deleting some or no elements without changing the order of the remaining elements.
 * Palindrome is a string that reads the same backward as well as forward.
 * Example
 &  Input: ELRMENMET
 ^ Output: 5
 ^ LPS is "EMEME"
 */


package Exercises;

public class LongestPalindromicSubsequence {
    //! Top Down
    public int findLPSLength(String string) {
		Integer[][] dp = new Integer[string.length()][string.length()];
		return lps_Aux(dp, string, 0, string.length() - 1);
	}// end of method
 
	
	private int lps_Aux(Integer[][] dp, String string, int startIndex, int endIndex) {
		if (startIndex > endIndex) { //BASE CASE - If we have traversed more than 1/2 of string then return 0 as we dont need to process it
			return 0;
		}
		if (startIndex == endIndex) { //BASE CASE - If both the index are at same position then its a palindrome as its 1 character.
			return 1;
		}
		int c3 = 0;
		if (dp[startIndex][endIndex] == null) { //If we have not solved this problem previously, only then solve it
			if (string.charAt(startIndex) == string.charAt(endIndex)) {
				c3 = 2 + lps_Aux(dp, string, startIndex + 1, endIndex - 1);//CASE#1 - If index pointed characters matches then we add 2 to the existing known palindrome length
			} 
			int c1 = lps_Aux(dp, string, startIndex + 1, endIndex);//CASE#2 - Skip one element from beginning
			int c2 = lps_Aux(dp, string, startIndex, endIndex - 1);//CASE#3 - Skip one element from end
			dp[startIndex][endIndex] = Math.max(c3,Math.max(c1, c2));//Take the max sized palindrome
			}
		return dp[startIndex][endIndex];
	}// end of method

    //! Bottom Up 
    public int findLPSLengthBU(String st) {
		int[][] dp = new int[st.length()][st.length()];
		for (int col = 0; col < st.length(); col++) {
			for (int row = st.length()-1; row >= 0; row--) {
				if (row > col) { // BASE CASE - If we have traversed more than 1/2 of string then return 0 as we dont need to process it
					dp[row][col] = 0;
				} else if (row == col) { // BASE CASE - If both the index are at same position then its a palindrome as its 1 character.
					dp[row][col] = 1;
				} else {
					if (st.charAt(row) == st.charAt(col)) {
						dp[row][col] = Math.max(2+dp[row + 1][col - 1], Math.max(dp[row][col - 1], dp[row + 1][col]));
					} else {
						dp[row][col] = Math.max(dp[row][col - 1], dp[row + 1][col]);
					}
				}
			} 
		}// end of loop
		return dp[0][st.length()-1];
	}// end of method
}
