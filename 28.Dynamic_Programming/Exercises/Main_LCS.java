package Exercises;

public class Main_LCS{
    public static void main(String[] args) {
        String X = "ABCBDAB";
        String Y = "BDCABA";
        LCS lcs = new LCS();
        @SuppressWarnings("static-access")
        char[] result = lcs.lcs(X, Y, 0, 0);
    
        System.out.print("LCS: ");
        for (char c : result) {
            System.out.print(c);
        }
        System.out.println();
    }
}