public class WildcardMatching44 {

    public boolean isMatch(String s, String p) {
        if (s == null || p == null) return s == p;

        int m = s.length() + 1;
        int n = p.length() + 1;
        boolean[][] dp = new boolean[m][n];

        dp[0][0] = true;
        for (int i = 1; i < n; i++) {
            if (p.charAt(i-1) == '*') dp[0][i] = dp[0][i-1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                char cp = p.charAt(j-1);
                char cs = s.charAt(i-1);
                if (cp == '*') {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else if (cp == '?' || cp == cs) {
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}

