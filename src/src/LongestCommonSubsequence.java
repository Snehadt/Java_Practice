package src;

import static java.lang.Math.max;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String a = "abgch";
        String b = "abfchr";
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        int n = x.length;
        int m = y.length;
        System.out.println(longestCommonSubsequence(x, y, n, m));
    }

    private static int longestCommonSubsequence(char[] x, char[] y, int n, int m) {
        int count = 0;

        if (n == 0 || m == 0)
            count = 0;

        if (x[n - 1] == y[m - 1])
            count = 1 + longestCommonSubsequence(x, y, n - 1, m - 1);
        else
            count = max(longestCommonSubsequence(x, y, n - 1, m), longestCommonSubsequence(x, y, n, m - 1));

        return count;
    }
}
