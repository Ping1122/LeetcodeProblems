package com.pingxin;

public class MaxSumofaPairWithEqualSumofDigits2342 {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> sumToNum = new HashMap<>();
        int max = -1;
        for (int num : nums) {
            int sum = digitSum(num);
            if (!sumToNum.containsKey(sum)) {
                sumToNum.put(sum, num);
            } else {
                max = Math.max(max, sumToNum.get(sum) + num);
                sumToNum.put(sum, Math.max(sumToNum.get(sum), num));
            }
        }
        return max;
    }
}
