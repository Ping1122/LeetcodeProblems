package com.pingxin;

public class StudentAttendanceRecordII552 {
    
    public int checkRecord(int n) {
        long mod = 1000000007;
        long[] dp = new long[Math.max(3, n+1)];
        dp[0] = 1L;
        dp[1] = 2L;
        dp[2] = 4L;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % mod;
        }
        long result = 0L;
        for (int i = 0; i < n; i++) {
            result += (dp[i] * dp[n-i-1]) % mod;
        }
        result += dp[n];
        return (int)(result % mod);
    }
}
