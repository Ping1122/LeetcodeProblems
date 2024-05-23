package com.pingxin;

public class TheNumberOfBeautifulSubsets2597_1 {

    /* Because the maximum length of the nums is 20,
     * we can represent the pick and not pick by using the 32 bits in an integer.
     * With backtracking algorithm, we try to add one num to the subset.
     * Before adding it, we need to check if the newly added number will make the subset became not beautiful.
     */

    private int[] nums;
    private int k;

    public int beautifulSubsets(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
        return traverse(0, 0) - 1;
    }

    private int traverse(int i, int mask) {
        if (i >= nums.length) return 1;
        int result = 0;
        if (isBeautiful(i, mask)) {
            result += traverse(i+1, mask | (1 << i));
        }
        result += traverse(i+1, mask);
        return result;
    }

    private boolean isBeautiful(int i, int mask) {
        for (int j = 0; j < i; j++) {
            if (((1 << j) & mask) != 0 && Math.abs(nums[i] - nums[j]) == k) {
                return false;
            }
        }
        return true;
    }
}
