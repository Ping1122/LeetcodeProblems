package com.pingxin;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX1608 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;
        while (left <= right) {
            int middle = (left + right) / 2;
            int bigger = binarySearch(nums, middle);
            if (bigger == middle) return middle;
            if (bigger < middle) right = middle - 1;
            else left = middle + 1;
        }
        return -1;
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] >= target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return nums.length - left;
    }
}
