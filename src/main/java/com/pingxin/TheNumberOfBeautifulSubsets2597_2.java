package com.pingxin;

import java.util.Arrays;

public class TheNumberOfBeautifulSubsets2597_2 {

    /* Change the bit set to a frequency map can reduce the runtime of check of the subset is beautiful from O(n) to O(1)
     * With backtracking algorithm, we try to add one num to the subset.
     * Before adding it, we need to check if the newly added number will make the subset became not beautiful.
     */

    private int[] nums;
    private int k;
    private int[] frequency;

    public int beautifulSubsets(int[] nums, int k) {
        this.nums = nums;
        Arrays.sort(this.nums);
        this.k = k;
        frequency = new int[1001];
        return traverse(0) - 1;
    }

    private int traverse(int i) {
        if (i >= nums.length) return 1;
        int result = 0;
        if (isBeautiful(i)) {
            frequency[nums[i]]++;
            result += traverse(i+1);
            frequency[nums[i]]--;
        }
        result += traverse(i+1);
        return result;
    }

    private boolean isBeautiful(int i) {
        return nums[i] - k < 0 || frequency[nums[i] - k] == 0;
    }
}
