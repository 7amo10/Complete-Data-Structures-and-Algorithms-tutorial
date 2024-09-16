public class ConvertOneStringtoAnother {
    public int findMinOperationsTD(String s1, String s2) {
        Integer[][] dp = new Integer[s1.length() + 1][s2.length() + 1];
        return findMinOperationsTD(dp, s1, s2, 0, 0);
    }// end of method

    private int findMinOperationsTD(Integer[][] dp, String s1, String s2, int i1, int i2) {
        if (dp[i1][i2] == null) {
            if (i1 == s1.length()) // if we have reached the end of s1, then insert all the remaining characters of
                                   // s2
                dp[i1][i2] = s2.length() - i2;

            else if (i2 == s2.length()) // if we have reached the end of s2, then delete all the remaining characters of
                                        // s1
                dp[i1][i2] = s1.length() - i1;

            else if (s1.charAt(i1) == s2.charAt(i2)) // If the strings have a matching character, recursively match for
                                                     // the remaining lengths.
                dp[i1][i2] = findMinOperationsTD(dp, s1, s2, i1 + 1, i2 + 1);

            else {
                int c1 = findMinOperationsTD(dp, s1, s2, i1 + 1, i2); // delete
                int c2 = findMinOperationsTD(dp, s1, s2, i1, i2 + 1); // insert
                int c3 = findMinOperationsTD(dp, s1, s2, i1 + 1, i2 + 1); // replace
                dp[i1][i2] = 1 + Math.min(c1, Math.min(c2, c3));
            }
        } // end of if-else
        return dp[i1][i2];
    }// end of method

    public int findMinOperationsBU(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i1 = 0; i1 <= s1.length(); i1++) // if we have reached the end of s1, then insert all the remaining
                                                  // characters of s2
            dp[i1][0] = i1;

        for (int i2 = 0; i2 <= s2.length(); i2++) // if we have reached the end of s2, then delete all the remaining
                                                  // characters of s1
            dp[0][i2] = i2;

        for (int i1 = 1; i1 <= s1.length(); i1++) {
            for (int i2 = 1; i2 <= s2.length(); i2++) { // If the strings have a matching character, recursively match
                                                        // for the remaining lengths.
                if (s1.charAt(i1 - 1) == s2.charAt(i2 - 1))
                    dp[i1][i2] = dp[i1 - 1][i2 - 1];
                else
                    dp[i1][i2] = 1 + Math.min(dp[i1 - 1][i2], // delete
                            Math.min(dp[i1][i2 - 1], // insert
                                    dp[i1 - 1][i2 - 1])); // replace
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        ConvertOneStringtoAnother converter = new ConvertOneStringtoAnother();
        String s1 = "table";
        String s2 = "tbres";

        int minOperationsTD = converter.findMinOperationsTD(s1, s2);
        int minOperationsBU = converter.findMinOperationsBU(s1, s2);

        System.out.println("Minimum operations using top-down approach: " + minOperationsTD);
        System.out.println("Minimum operations using bottom-up approach: " + minOperationsBU);
    }
}
