package Exercises;

public class Main_Common {
    public static void main(String[] args) {
        LongestCommonSubsequenceLength lrs = new LongestCommonSubsequenceLength();
        //! TopDown
        String str1 = "ABCBDAB";
        String str2 = "BDCABA";
        int length = lrs.findLCSLengthTD(str1, str2);
        int length_2 = lrs.findLCSLengthBU(str1, str2);
        System.out.println("Length of the longest common subsequence is: " + length);
        System.out.println("Length of the longest common subsequence is:" + length_2);
    }
}
