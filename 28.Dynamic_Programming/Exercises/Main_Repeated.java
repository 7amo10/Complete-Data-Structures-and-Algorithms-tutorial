package Exercises;

public class Main_Repeated {
    public static void main(String[] args) {
        LongestRepeatedSubsequenceLength lrs = new LongestRepeatedSubsequenceLength();
        //! ButtomUp
        String str = "ATAKTKGGA"; 
        int length = lrs.findLongestRepeatingSubSeq(str);
        System.out.println("Length of the longest repeated subsequence is: " + length);
    }   
}
