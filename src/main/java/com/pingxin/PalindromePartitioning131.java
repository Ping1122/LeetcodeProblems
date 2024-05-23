package com.pingxin;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning131 {
    private List<List<String>> result;
    private List<String> current;
    private String s;
    private int n;
    private List<List<Integer>> palindromes;

    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        current = new ArrayList<>();
        this.s = s;
        n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && (len <= 2 || dp[i+1][j-1]);
            }
        }
        palindromes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            palindromes.add(new ArrayList<>());
            for (int j = i; j < n; j++) {
                if (dp[i][j]) palindromes.get(i).add(j);
            }
        }
        traverse(0);
        return result;
    }

    private void traverse(int i) {
        if (i >= n) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int j : palindromes.get(i)) {
            current.add(s.substring(i, j+1));
            traverse(j+1);
            current.removeLast();
        }
    }
}