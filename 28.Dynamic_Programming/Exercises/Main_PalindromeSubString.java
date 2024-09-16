package Exercises;

public class Main_PalindromeSubString {
    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String input = "BABAD"; 
        String longestPalindrome = lps.longestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }
}
