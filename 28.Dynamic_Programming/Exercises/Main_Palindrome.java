package Exercises;

public class Main_Palindrome {
    public static void main(String[] args) {
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();

        String input = " ELRMENMET";
        int length1 = lps.findLPSLength(input);
        int length2 = lps.findLPSLengthBU(input);
        System.out.println("Longest palindromic subsequence length for '" + input + "': " + length1 + length2);
    }
}
