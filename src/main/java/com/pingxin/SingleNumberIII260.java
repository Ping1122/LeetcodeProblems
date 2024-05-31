package com.pingxin;

public class SingleNumberIII260 {
    /*
    * Divide the numbers into two groups, each group contains one unique number
    * Use a & -a to get the right most 1 bit of a
    * */
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int bit = xor & -xor;
        int num1 = 0;
        int num2 = 0;
        for (int num : nums) {
            if ((num & bit) != 0) num1 ^= num;
            else num2 ^= num;
        }
        return new int[]{num1, num2};
    }
}
